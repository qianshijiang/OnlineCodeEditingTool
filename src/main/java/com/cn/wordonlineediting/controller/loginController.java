package com.cn.wordonlineediting.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;
import java.util.UUID;

import javax.annotation.Resource;
import javax.mail.Address;
import javax.mail.Message;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.cn.wordonlineediting.service.impl.WorduserServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import com.cn.wordonlineediting.pojo.Worduserf;
import com.cn.wordonlineediting.util.MD5Util;
import com.sun.mail.util.MailSSLSocketFactory;
/**
 * @author qsj
 * @date 2017-9-28
 * @describe 登录控制层
 */
@Controller
@RequestMapping("/login")
public class loginController {

  private static Logger logger = LoggerFactory.getLogger(loginController.class);

  @Resource
  private WorduserServiceImpl userservice;
  
  @RequestMapping("/login.do")
  public String login(){
	  
	  return "login/login";
	  
  }
  
  @RequestMapping("/index.do")
  public String toinidex(){
	  
	  return "redirect:/code/javacode.do";
  }
  
  @RequestMapping("/tologins.do")
  public String tologin(HttpServletRequest request,HttpServletResponse response,Model model){
	  try{
		  //登录控制
		  //获取前端传来的用户信息，注册过程中用户名必须是唯一性，需要做唯一性控制
		  String username = request.getParameter("username");
		  String pwd = request.getParameter("pwd");
		  String code = request.getParameter("code");
		  //通过用户名查询,返回Worduser对象,将对象保存在session中,如果对象为null,则给出响应提示
		  Worduserf user = this.userservice.findByName(username);
		  if(user!=null){
			  if(MD5Util.md5Encode(pwd).equals(user.getPassword())){
				  HttpSession session = request.getSession();
				  session.setAttribute("user", user);
				  return "redirect:/code/javacode.do";
			  }else if(!String.valueOf(request.getSession().getAttribute("imgCode")).equalsIgnoreCase(code)){
				  model.addAttribute("username", username);
				  model.addAttribute("pwd",pwd);
				  model.addAttribute("code",code);
				  model.addAttribute("message", "验证码错误!");
				  return "login/login";
			  }else{
				  model.addAttribute("username", username);
				  model.addAttribute("pwd",pwd);
				  model.addAttribute("code",code);
				  model.addAttribute("message", "密码错误!");
				  return "login/login";
			  }
		  }else{
			  model.addAttribute("username", username);
			  model.addAttribute("pwd",pwd);
			  model.addAttribute("code",code);
			  model.addAttribute("message","用户未注册,请注册用户!");
			  return "login/login";
		  }
	  }catch(Exception e){
		  logger.error("登录报错");
		  return "login/login";
	  }
  }
  /**
   * 用户注册逻辑
   */
  @RequestMapping("/toregist.do")
  public String toregistuser(){
	  
	  return "regist/regist";
  }
  
 @RequestMapping("/regist.do")
  public void registuser(HttpServletRequest request,HttpServletResponse response,Model model){
	  try{
		  response.setCharacterEncoding("utf-8"); //响应编码
		  SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		  //获取用户注册数据信息
		  PrintWriter out = response.getWriter();
		  String loginname = request.getParameter("username"); 
		  String password = request.getParameter("pwd");
		  String telephone = request.getParameter("telephone");
		  String email = request.getParameter("qqemail");
		  //通过用户名查询数据库,是否已经注册
		  Worduserf user = this.userservice.findByName(loginname);
		  Worduserf worduserf = new Worduserf();
		  worduserf.setPassword(MD5Util.md5Encode(password));
		  worduserf.setName(loginname);
		  worduserf.setTelephone(telephone);
		  worduserf.setEmail(email);
		  
		  JSONObject obj = new JSONObject();
		  if(user!=null){
			  obj.put("worduser", worduserf);
			  obj.put("message","用户名已被注册");
		  }else{
			  worduserf.setId(UUID.randomUUID().toString());
			  worduserf.setPassword(MD5Util.md5Encode(password));
			  worduserf.setName(loginname);
			  worduserf.setCreatetime(simple.parse(simple.format(new Date())));
			  worduserf.setStatus("1");
			  worduserf.setTelephone(telephone);
			  //worduser.setEmail(email);
			 int s = this.userservice.insert(worduserf);
			 if(s>0){
				 obj.put("worduser", worduserf);
			     obj.put("message","注册成功");
			 }else{
				 obj.put("message","系统繁忙,请稍后重试");
			 }
		  }
		  out.println(obj);
		  out.close();
	  }catch(Exception e){
		  logger.error("注册服务报错");
	  }
  }
  
 @RequestMapping("/toupdatepas.do")
  public String tofindpasByemail(){
	  
	 return "updatepas/updatepas";
  }
  /**
   * 邮箱发送找回密码
   **/
  @RequestMapping("/findpwd.do")
  public void findPassword(HttpServletRequest request,HttpServletResponse response,Model model){
	  try{
	  //设置响应编码格式
	  response.setCharacterEncoding("utf-8");
	  PrintWriter out = response.getWriter();
	  //获取邮箱地址
	  String email = request.getParameter("email");
	  Worduserf user = this.userservice.findByName(email);
	  String json = "";
	  if(user!=null){
		  Properties prop = new Properties();
		  //开启Debug调试
	      prop.setProperty("mail.debug", "true");
	      //发送服务器需要身份验证
	      prop.setProperty("mail.smtp.auth", "true");
	      //发送邮件服务器的主机名
	      prop.setProperty("mail.host", "smtp.qq.com");
	      //发送邮件协议
	      prop.setProperty("mail.transport.protocol", "smtp");
	      //开启ssl加密（并不是所有的邮箱服务器都需要，但是qq邮箱服务器是必须的）
	      MailSSLSocketFactory msf= new MailSSLSocketFactory();
	      msf.setTrustAllHosts(true);
	      prop.put("mail.smtp.ssl.enable", "true");
	      prop.put("mail.smtp.ssl.socketFactory",msf);
	      //获取Session会话实例（javamail Session与HttpSession的区别是Javamail的Session只是配置信息的集合）
	      Session session=Session.getInstance(prop,new javax.mail.Authenticator(){
	              protected PasswordAuthentication getPasswordAuthentication(){
	                      //用户名密码验证（取得的授权吗）
	                      return new PasswordAuthentication ("1965297290@qq.com","nnblgghiicuzbhdh");
	              }

	      });
	      //抽象类MimeMessage为实现类  消息载体封装了邮件的所有消息
	      Message message=new MimeMessage(session);
	      //设置邮件主题
	      message.setSubject("密码验证邮件！");
	      //封装需要发送电子邮件的信息
	      message.setText(user.getName()+"用户您好,这是您的密码验证邮件,请妥善保管,防止被他人窃取,您好请到这个地址修改您的密码：http://localhost:8080/OnlineCodeEditingTool/login/updatepassword.do?userId="+user.getId()+"&ulink="+UUID.randomUUID()+"ufire="+UUID.randomUUID()+"kifire=http://www.itblogger.cn");
	      //设置发件人地址
	      message.setFrom(new InternetAddress("1965297290@qq.com","系统管理员"));
	      //此类的功能是发送邮件 又会话获得实例
	      Transport transport=session.getTransport();
	      //开启连接
	      transport.connect();
	      //设置收件人地址邮件信息
	      transport.sendMessage(message, new Address[]{new InternetAddress(email)});
	      //邮件发送后关闭信息
	      transport.close();
	      json = JSON.toJSONString("验证邮件已发送");
	  }else{
		  json = JSON.toJSONString("该邮箱尚未注册,请注册账号");
	  }
	  out.println(json);
      out.close();
	  }catch(Exception e){
		  logger.error("邮件找回密码报错");
	  }
  }
  
  @RequestMapping("/updatepassword.do")
  public String updatapassword(HttpServletRequest request,HttpServletResponse response,Model model){
	  try{
		  String id = request.getParameter("userId");
		  model.addAttribute("Id",id);
		  return "updatepas/updatepassword";
	  }catch(Exception e){
		  logger.error("修改密码报错");
	  }
	return null;
  }
  
  @RequestMapping("/toupdatepwds.do")
  public void toupdatepassword(HttpServletRequest request,HttpServletResponse response,Model model){
	  try{
		  //设置编码
		  response.setCharacterEncoding("utf-8");
		  //获取用户ID
		  String userid = request.getParameter("userid");
		  //获取用户设置的密码
		  String pwd = request.getParameter("pwdone");
		  Worduserf user = new Worduserf();
		  user.setId(userid);
		  user.setPassword(MD5Util.md5Encode(pwd));
		  int s = this.userservice.update(user);
		  PrintWriter out = response.getWriter();
		  String json = "";
		  if(s>0){
			  json = JSON.toJSONString("密码修改成功");
		  }else{
			  json = JSON.toJSONString("密码修改失败,请稍后重试");
		  }
		  out.println(json);
		  out.close();
	  }catch(Exception e){
		  logger.error("修改密码报错");
	  }
  }
  
}
