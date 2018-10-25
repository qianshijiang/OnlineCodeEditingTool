package com.cn.wordonlineediting.controller;

import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.alibaba.fastjson.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import com.cn.wordonlineediting.util.BeautyCodeUtil;
/**
 * @author qsj
 * @date 2018-1-16
 * @describe 代码在线编辑控制层
 */
@Controller
@RequestMapping("/code")
public class CodeController {

	private static Logger log = LoggerFactory.getLogger(CodeController.class);
	/**
	 * @return    文本编辑器界面
	 */
	@RequestMapping("/index.do")
	public String index(){
		
		return "manager/index";
	}
	
	/**
	 * @return    java代码操作界面
	 */
	@RequestMapping("/javacode.do")
	public String javacode(){
		
		return "code/code";
	}
	
	/**
	 * 对java进行格式美化
	 * @param request    请求实体
	 * @param response   响应实体
	 * @param code       java类型的代码
	 * @param tabtype    缩进类型
	 * @return
	 */
	@RequestMapping("/beautyjava.do")
	public String formatjavacode(HttpServletRequest request,HttpServletResponse response,String code,Integer tabtype){
		try{
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject json = new JSONObject();
		    json.put("dataSource",BeautyCodeUtil.beautyCode(code, tabtype));
			out.print(json);
			out.close();
			return null;
		}catch(Exception e){
			log.error("Java代码美化报错");
		}
		return null;
	}
	
	/**
	 * @return html操作界面
	 */
	@RequestMapping("/htmlcode.do")
	public String html5code(){
		
		return "code/html5";
	}
	
	/**
	 * 对html进行格式美化
	 * @param request       请求实体
	 * @param response      响应实体
	 * @param code          html格式代码
	 * @param tabtype       缩进类型
	 * @return
	 */
	@RequestMapping("/beautyhtml.do")
	public String formathtmlcode(HttpServletRequest request,HttpServletResponse response,String code,Integer tabtype){
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * @return  css操作界面
	 */
	@RequestMapping("/csscode.do")
	public String csscode(){
		
		return "code/css3";
	}
	
	/**
	 * 对css进行格式美化
	 * @param request      请求实体
	 * @param respoonse    响应实体
	 * @param code         css格式代码
	 * @param tabtype      缩进类型
	 * @return
	 */
	@RequestMapping("/beautycss.do")
	public String formatcsscode(HttpServletRequest request,HttpServletResponse respoonse,String code,Integer tabtype){
		try{
			switch(tabtype){
			  case 1:
				  
				  break;
			  case 2:
				  break;
			  case 4:
				  break;
			  case 8:
				  break;
			  default:
				  break;
			}
		}catch(Exception e){
			log.error("美化Css代码出错");
		}
		return null;
	}
	
	/**
	 * @return javascript操作界面
	 */
	@RequestMapping("/javascriptcode.do")
	public String javascriptcode(){
		
		return "code/javascript";
	}
	
	/**
	 * 对javascript 进行格式美化
	 * @param request   请求实体
	 * @param response  响应实体
	 * @param code      javascript 格式代码
	 * @param tabtype   缩进类型
	 * @return
	 */
	@RequestMapping("/beautyjavascript.do")
	public String formatjavascriptcode(HttpServletRequest request,HttpServletResponse response,String code,Integer tabtype){
		try{
			switch(tabtype){
			  case 1:
				  
				  break;
			  case 2:
				  break;
			  case 4:
				  break;
			  case 8:
				  break;
			  default:
				  break;
			}
		}catch(Exception e){
			log.error("美化Javascript出错");
		}
		return null;
	}
	
	/**
	 * @return xml操作界面
	 */
	@RequestMapping("/xmlcode.do")
	public String xmlcode(){
		
		return "code/xml";
	}
	
	/**
	 * 对xml进行美化
	 * @param request 请求实体
	 * @param response 响应实体
	 * @param code xml格式数据
	 * @param tabtype 缩进类型
	 * @return
	 */
	@RequestMapping("/beautyxml.do")
	public String formatxmlcode(HttpServletRequest request,HttpServletResponse response,String code,Integer tabtype){
		try{
			switch(tabtype){
			  case 1:
				  
				  break;
			  case 2:
				  break;
			  case 4:
				  break;
			  case 8:
				  break;
			  default:
				  break;
			}
		}catch(Exception e){
			log.error("美化xml出错");
		}
		return null;
	}
	
	/**
	 * @return json操作界面
	 */
	@RequestMapping("/jsoncheck.do")
	public String jsoncheck(){
		
		return "code/json";
	}
	
	/**
	 * 实现json数据的格式校验
	 * @param request
	 * @param response
	 * @param code
	 * @param tabtyp
	 * @return
	 */
	@RequestMapping("/beautyjson.do")
	public String formatjsoncode(HttpServletRequest request,HttpServletResponse response,String code,Integer tabtyp){
		try{
			
		}catch(Exception e){
			e.printStackTrace();
		}
		return null;
	}
	
	/**
	 * 帮助与支持页面
	 * @return  帮助与支持页面
	 */
	@RequestMapping("/helpandsupport.do")
	public String helpandsupport(){
		
		return "code/helpandsupport";
	}
	
	/**
	 * 正则校验页面
	 * @return 正则校验页面
	 */
	@RequestMapping("/regular.do")
	public String regularVerification(){
		
		return "code/regularverification";
	}
	
	/**
	 * 时间戳操作页面
	 * @return  时间戳转换工具
	 */
	@RequestMapping("/timestamp.do")
	public String timestamp(){
		
		return "code/timestamp";
	}
	
	/**
	 * 时间戳转换为时间
	 * @param request
	 * @param response
	 * @param type 单位：1 秒 2毫秒
	 * @param value 数值
	 */
	@RequestMapping("/timestamptotime.do")
	public void unixtobJ(HttpServletRequest request,HttpServletResponse response,String type,String value){
		try{
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			Long times = Long.parseLong(value);
			String result = "";
			if("1".equals(type)){
				result = simple.format(new Date(times*1000));
			}else{
				result = simple.format(new Date(times*1000));
			}
			JSONObject josn = new JSONObject();
			josn.put("message", result);
			out.print(josn);
			out.close();
		}catch(Exception e){
			log.error("时间戳转换出错");
		}
	}
	
	/**
	 * 时间转换为时间戳
	 * @param request
	 * @param response
	 * @param value 时间
	 */
	@RequestMapping("/timetotimestamp.do")
	public void timetotimestamp(HttpServletRequest request,HttpServletResponse response,String type,String value){
		try{
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			JSONObject josn = new JSONObject();
			Long result;
			Date date = null;
			if(value.length()>11){
				date = simple.parse(value);
			}else{
				date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
			}
			if("1".equals(type)){
				result = date.getTime()/1000;
			}else{
				result = date.getTime();
			}
			josn.put("message", result);
			out.print(josn);
			out.close();
		}catch(Exception e){
			log.error("时间转换为时间戳出错");
		}
	}
	
	/**
	 * 北京时间转换为时间戳
	 * @param request
	 * @param response
	 * @param type 单位：1秒 2毫秒
	 * @param value 数据
	 */
	@RequestMapping("/timetoTimestampChange.do")
	public void timetoTimestampChange(HttpServletRequest request,HttpServletResponse response,String type,String value){
		try{
			response.setCharacterEncoding("utf-8");
			PrintWriter out = response.getWriter();
			JSONObject josn = new JSONObject();
			Long result;
			Date date = null;
			if(value.length()==4){
				date = new SimpleDateFormat("yyyy").parse(value);
			} else if(value.length()==7){
				date = new SimpleDateFormat("yyyy-MM").parse(value);
			}else if(value.length()==10){
				date = new SimpleDateFormat("yyyy-MM-dd").parse(value);
			}else if(value.length()==13){
				date = new SimpleDateFormat("yyyy-MM-dd HH").parse(value);
			}else if(value.length()==16){
				date = new SimpleDateFormat("yyyy-MM-dd HH:mm").parse(value);
			}else if(value.length()==19){
				date = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(value);
			}
			if("1".equals(type)){
				result = date.getTime()/1000;
			} else {
				result = date.getTime();
			}
			josn.put("message", result);
			out.print(josn);
			out.close();
		}catch(Exception e){
			log.error("北京时间转换为时间戳出错");
		}
	}
}
