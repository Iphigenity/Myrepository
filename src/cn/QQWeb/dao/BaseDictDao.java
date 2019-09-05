package cn.QQWeb.dao;

import java.util.List;

import cn.QQWeb.domain.BaseDict;

public interface BaseDictDao extends BaseDao<BaseDict> {

	List<BaseDict> getListByTypeCode(String dict_type_code);

}
