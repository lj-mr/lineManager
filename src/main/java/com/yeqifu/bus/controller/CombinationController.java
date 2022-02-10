package com.yeqifu.bus.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.yeqifu.bus.entity.Combination;
import com.yeqifu.bus.entity.Provider;
import com.yeqifu.bus.service.ICombinationService;
import com.yeqifu.bus.vo.CombinationVo;
import com.yeqifu.bus.vo.ProviderVo;
import com.yeqifu.sys.common.DataGridView;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lijiang
 * @Date: 2022/2/10 16:35
 */
@RestController
@RequestMapping("combination")
public class CombinationController {

    @Autowired
    private ICombinationService combinationService;

    @RequestMapping("loadAllCombination")
    public DataGridView loadAllCombination(CombinationVo combinationVo){
        //1.声明一个分页page对象
        IPage<Combination> page = new Page(combinationVo.getPage(),combinationVo.getLimit());
        //2.声明一个queryWrapper
        QueryWrapper<Combination> queryWrapper = new QueryWrapper();
        queryWrapper.like(StringUtils.isNotBlank(combinationVo.getCombinationName()),"combination_name",
                combinationVo.getCombinationName());
        combinationService.page(page,queryWrapper);
        return new DataGridView(page.getTotal(),page.getRecords());
    }
}
