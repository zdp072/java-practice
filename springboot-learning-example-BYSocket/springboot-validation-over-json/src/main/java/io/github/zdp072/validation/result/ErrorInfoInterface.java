package io.github.zdp072.validation.result;

/**
 * 功能描述: 错误码接口
 *
 * @ClassName: ErrorInfoInterface
 * @Author: zdp072
 * @Date: 2019/6/30 下午3:07
 * @Version: V1.0
 */
public interface ErrorInfoInterface {

    /**
     * 获取接口编码
     * @return String
     */
    String getCode();

    /**
     * 获取接口消息
     * @return String
     */
    String getMessage();
}
