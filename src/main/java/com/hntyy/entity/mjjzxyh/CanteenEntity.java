package com.hntyy.entity.mjjzxyh;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.fasterxml.jackson.databind.ser.std.ToStringSerializer;
import com.hntyy.entity.BaseEntity;
import lombok.Data;

/**
 * 食堂
 */
@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CanteenEntity extends BaseEntity {

    /**
     * 食堂id
     */
    @JsonSerialize(using= ToStringSerializer.class)
    private Long canteenId;

    /**
     * 名称
     */
    private String name;

    /**
     * 头像
     */
    private String icon;

    /**
     * 简介
     */
    private String summary;

    /**
     * 学校id,外键
     */
    @JsonSerialize(using= ToStringSerializer.class)
    private Long schoolId;

}
