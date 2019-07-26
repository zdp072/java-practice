package io.github.zdp072.validation.result;

import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * 功能描述:统一异常处理器
 *
 * @ClassName: GlobalErrorInfoHandler
 * @Author: zdp072
 * @Date: 2019/6/30 下午3:58
 * @Version: V1.0
 */
@RestControllerAdvice
public class GlobalErrorInfoHandler {

    /**
     * 全局异常捕捉处理
     * @param ex
     * @return
     */
    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ResultBody errorHandler(Exception ex) {
        ResultBody result = new ResultBody("-1", ex.getMessage(), null);
        return result;
    }

    /**
     * 拦截捕捉自定义异常
     * @param request
     * @param exception
     * @return
     */
    @ExceptionHandler(value = GlobalErrorInfoException.class)
    public ResultBody errorHandlerOverJson(HttpServletRequest request, GlobalErrorInfoException exception) {
        ErrorInfoInterface errorInfoInterface = exception.getErrorInfoInterface();
        ResultBody result = new ResultBody(errorInfoInterface);
        return result;
    }
}
