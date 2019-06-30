package io.github.zdp072.web;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * 功能描述:城市实体类
 *
 * @ClassName: City
 * @Author: zdp072
 * @Date: 2019/6/30 下午4:23
 * @Version: V1.0
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class City {
    /**
     * 城市编号
     */
    private Long id;

    /**
     * 省份编号
     */
    private Long provinceId;

    /**
     * 城市名称
     */
    private String cityName;

    /**
     * 描述
     */
    private String description;
}
