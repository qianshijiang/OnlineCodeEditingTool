package com.cn.wordonlineediting.service;

import java.util.List;

import com.cn.wordonlineediting.pojo.Page;
import com.cn.wordonlineediting.pojo.Worduser;

/**
 * @author qsj
 * @date 2017-9-29
 * @describe 用户业务层接口
 */
public interface WorduserServicef {
	
	/**
	 * 通过Id查询用户
	 * @param Id 用户Id
	 * @throws Exception
	 */
	 Worduser findById(String Id) throws Exception;
	
	/**
	 * 通过名称查询,用户名、电话、邮箱
	 * @param name
	 * @return
	 * @throws Exception
	 */
	 Worduser findByName(String name) throws Exception;
	
	/**
	 * 查询所有数据
	 * @return 用户集合实体
	 */
     List<Worduser> findList(Worduser user) throws Exception;
    
    /**
     * 分页查询用户数据
     * @param page 分页对象
     * @param user 用户实体
     * @return
     */
     Page findListByPage(Integer page, Worduser user);
    
    /**
     * 单条插入数据
     * @return 插入的数据条数
     * @throws Exception
     */
     int insert(Worduser user) throws Exception;
    
    /**
     * 多条插入数据
     * @param userList 用户实体数据
     * @return 插入数据条数
     * @throws Exception
     */
     int insertBash(List<Worduser> userList) throws Exception;
    
    /**
     * 真实删除 通过用户Id
     * @param user 用户实体
     * @return
     * @throws Exception
     */
     int deleteById(String Id) throws Exception;
    
    /**
     * 物理删除 修改删除标识的状态
     * @param user 用户实体
     * @return
     * @throws Exception
     */
     int deleteByStatus(Worduser user) throws Exception;
    
    /**
     * 单条修改用户数据
     * @param user 用户实体
     * @return
     * @throws Exception
     */
     int update(Worduser user) throws Exception;
    
    /**
     * 批量修改用户数据
     * @param userList 用户实体集合
     * @return
     * @throws Exception
     */
     int updateBash(List<Worduser> userList) throws Exception;
}
