package com.cn.wordonlineediting.pojo;

import java.io.Serializable;
import java.util.Map;

/**
 * @author qsj
 * @date 2018-1-12
 * @describe 分页对象
 */
public class Page implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Integer page; //页码
	
	private Integer pageSize;//每页条数
	
	private Integer beginNo; //开始页
	
	private Integer endNo; //结束页
	
	private Integer rows; //数据总条数
	
	private Integer total; //总页数
	
	private Map<String,Object> datasource; //数据

	public Integer getPage() {
		return page;
	}

	public void setPage(Integer page) {
		this.page = page;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getBeginNo() {
		return beginNo;
	}

	public void setBeginNo(Integer beginNo) {
		this.beginNo = beginNo;
	}

	public Integer getEndNo() {
		return endNo;
	}

	public void setEndNo(Integer endNo) {
		this.endNo = endNo;
	}

	public Integer getRows() {
		return rows;
	}

	public void setRows(Integer rows) {
		this.rows = rows;
	}

	public Integer getTotal() {
		return total;
	}

	public void setTotal(Integer total) {
		this.total = total;
	}

	public Map<String, Object> getDatasource() {
		return datasource;
	}

	public void setDatasource(Map<String, Object> datasource) {
		this.datasource = datasource;
	}
}
