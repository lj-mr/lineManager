package com.yeqifu.bus.vo;

import com.yeqifu.bus.entity.Combination;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @Author: lijiang
 * @Date: 2022/2/10 16:40
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class CombinationVo extends Combination {

    /**
     * 分页参数，当前是第一页，每页10条数据
     */
    private Integer page=1;
    private Integer limit=10;
}
