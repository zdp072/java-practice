package io.github.zdp072.validation.result;

import lombok.Data;

/**
 * 功能描述: 统一错误码异常 @ClassName: GlobalErrorInfoException @Author: zdp072 @Date: 2019/6/30
 * 下午3:28 @Version: V1.0
 */
@Data
public class GlobalErrorInfoException extends Exception {
    private ErrorInfoInterface errorInfoInterface;

    public GlobalErrorInfoException(ErrorInfoInterface errorInfoInterface) {
        this.errorInfoInterface = errorInfoInterface;
    }
}
