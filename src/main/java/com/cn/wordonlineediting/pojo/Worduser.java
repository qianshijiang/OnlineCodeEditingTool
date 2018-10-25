package com.cn.wordonlineediting.pojo;

import java.io.Serializable;
import java.util.Date;

/**
 * @author qsj 
 * @date 2017-9-28
 * @describe word在线编辑用户表实体
 */
public class Worduser implements Serializable{

	private static final long serialVersionUID = 1L;
	
    private String id; //主键ID
    
    private String name; //登录名
    
    private String password; //密码
    
    private Date createtime; //创建时间
    
    private String status;  //删除状态
    
    private String telephone; //电话号码
    
    private String email; //邮箱
    
    private String address; //住址
    
    private String describe; //描述
    
    private String editcontent; //编辑内容

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Date getCreatetime() {
		return createtime;
	}

	public void setCreatetime(Date createtime) {
		this.createtime = createtime;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelephone() {
		return telephone;
	}

	public void setTelephone(String telephone) {
		this.telephone = telephone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDescribe() {
		return describe;
	}

	public void setDescribe(String describe) {
		this.describe = describe;
	}

	public String getEditcontent() {
		return editcontent;
	}

	public void setEditcontent(String editcontent) {
		this.editcontent = editcontent;
	}
	
}
