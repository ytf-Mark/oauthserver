package com.simon.service;

import com.simon.common.service.BasicService;
import com.simon.model.DictType;

import java.util.List;

/**
* @author SimonSun
* @date 2018-09-06 10:03:50
**/
public interface DictTypeService extends BasicService<DictType> {
    /**
     * 根据字典组编码查询字典列表
     * @param groupCode 字典组编码
     * @return
     */
    List<DictType> getTypeByGroupCode(String groupCode);
}