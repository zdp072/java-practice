package io.github.zdp072.validation.result;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述: 返回体
 *
 * @ClassName: ResultBody
 * @Author: zdp072
 * @Date: 2019/6/30 下午2:41
 * @Version: V1.0
 */
@Data
@NoArgsConstructor
public class ResultBody {

    private String code;

    private String message;

    private Object result;

    public ResultBody(ErrorInfoInterface errorInfoInterface) {
        this.code = errorInfoInterface.getCode();
        this.message = errorInfoInterface.getMessage();
    }

    public ResultBody(Object result) {
        this.code = GlobalErrorInfoEnum.SUCCESS.getCode();
        this.message = GlobalErrorInfoEnum.SUCCESS.getMessage();
        this.result = result;
    }

    public ResultBody(String code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }
}
