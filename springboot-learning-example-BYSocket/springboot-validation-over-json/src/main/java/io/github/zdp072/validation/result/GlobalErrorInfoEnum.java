package io.github.zdp072.validation.result;

/**
 * 功能描述:应用级别的错误码
 *
 * @ClassName: GlobalErrorInfoEnum
 * @Author: zdp072
 * @Date: 2019/6/30 下午3:18
 * @Version:V1.0
 */
public enum GlobalErrorInfoEnum implements ErrorInfoInterface {
    SUCCESS("0", "success"),

    NOT_FOUND("-1", "service not found");

    private String code;

    private String message;

    GlobalErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
