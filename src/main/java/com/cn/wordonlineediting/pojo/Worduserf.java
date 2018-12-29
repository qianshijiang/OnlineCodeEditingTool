package com.cn.wordonlineediting.pojo;

import java.io.Serializable;
import java.util.Date;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

/**
 * @author qsj 
 * @date 2017-9-28
 * @describe word在线编辑用户表实体
 */
@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
public class Worduserf implements Serializable{

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
	
}
