package io.github.zdp072.constant;

import io.github.zdp072.result.ErrorInfoInterface;

/**
 * 功能描述:业务错误码
 *
 * @ClassName: CityErrorInfoEnum
 * @Author: zdp072
 * @Date: 2019/6/30 下午4:18
 * @Version: V1.0
 */
public enum CityErrorInfoEnum implements ErrorInfoInterface {

    PARAMS_NO_COMPLETE("000001", "params not complete"),

    CITY_EXIT("000002", "city exists");

    private String code;

    private String message;

    CityErrorInfoEnum(String code, String message) {
        this.code = code;
        this.message = message;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
