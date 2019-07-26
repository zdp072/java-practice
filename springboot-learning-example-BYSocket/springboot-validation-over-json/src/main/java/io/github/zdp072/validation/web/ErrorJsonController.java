package io.github.zdp072.validation.web;

import io.github.zdp072.validation.constant.CityErrorInfoEnum;
import io.github.zdp072.validation.result.GlobalErrorInfoException;
import io.github.zdp072.validation.result.ResultBody;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * 功能描述: 错误码案例
 *
 * @ClassName: ErrorJsonController
 * @Author: zdp072
 * @Date: 2019/6/30 下午2:36
 * @Version: V1.0
 */
@RestController
public class ErrorJsonController {

    /**
     * 获取城市接口
     *
     * @return
     */
    @GetMapping("/api/city")
    public ResultBody findOneCity(@RequestParam("cityName") String cityName) throws GlobalErrorInfoException {
        //入参检查
        if (StringUtils.isEmpty(cityName)) {
            throw new GlobalErrorInfoException(CityErrorInfoEnum.PARAMS_NO_COMPLETE);
        }
        return new ResultBody(new City(1L, 1L, cityName, "我的故乡"));
    }
}
