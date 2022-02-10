package com.yeqifu.bus.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.math.BigDecimal;
import java.time.LocalDateTime;

/**
 * @Author: lijiang
 * @Date: 2022/2/10 16:32
 */
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("bus_combination")
public class Combination {
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;
    private String combinationName;
    private BigDecimal combinationPrice;
    private BigDecimal combinationCostPrice;
    private LocalDateTime createTime;
}
