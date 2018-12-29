package com.cn.wordonlineediting.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.cn.wordonlineediting.dao.WorduserfDao;
import com.cn.wordonlineediting.response.Page;
import com.cn.wordonlineediting.pojo.Worduserf;
import com.cn.wordonlineediting.service.WorduserServicef;
/**
 * @author qsj
 * @date 2017-9-29
 * @describe 业务层接口实现类
 */
@Service("worduserServicef")
public class WorduserServiceImpl implements WorduserServicef {
	@Autowired
	private WorduserfDao userdao;

	@Override
	public Worduserf findById(String Id) throws Exception {
		return this.userdao.findById(Id);
	}

	@Override
	public Worduserf findByName(String name) throws Exception {
		return this.userdao.findByName(name);
	}

	@Override
	public List<Worduserf> findList(Worduserf user) throws Exception {
		return this.userdao.findList(user);
	}

	@Override
	public Page findListByPage(Integer page, Worduserf user) {
		if(page == null){
			page  = 1;
		}
		Page pge = new Page();
		pge.setPage(page);
		pge.setPageSize(10);
		Integer begin = (pge.getPage() - 1) * pge.getPageSize() + 1;
		Integer end = pge.getPage() * pge.getPageSize();
		pge.setBeginNo(begin);
		pge.setEndNo(end);
		Map<String,Object> map = new HashMap<>();
		List<Worduserf> userLsit = this.userdao.findListByPage(pge, user);
	    map.put("list",userLsit);
		pge.setDatasource(map);
		pge.setRows(userLsit.size());
		if(pge.getRows()%pge.getPageSize()==0){
			pge.setTotal(pge.getRows()/pge.getPageSize());
		}else{
			pge.setTotal((pge.getRows()/pge.getPageSize())+1);
		}
		return pge;
	}

	@Override
	public int insert(Worduserf user) throws Exception {
		return this.userdao.insert(user);
	}

	@Override
	public int insertBash(List<Worduserf> userList) throws Exception {
		return this.userdao.insertBash(userList);
	}

	@Override
	public int deleteById(String Id) throws Exception {
		return this.deleteById(Id);
	}

	@Override
	public int deleteByStatus(Worduserf user) throws Exception {
		return this.userdao.deleteByStatus(user);
	}

	@Override
	public int update(Worduserf user) throws Exception {
		return this.userdao.update(user);
	}

	@Override
	public int updateBash(List<Worduserf> userList) throws Exception {
		return this.userdao.updateBash(userList);
	}
	
}
