package com.cn.wordonlineediting.controller;

import java.awt.image.BufferedImage;
import java.io.OutputStream;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.cn.wordonlineediting.util.ImageUtil;

/**
 * @author qsj
 * @date 2017-06-05
 * @describe 更换验证码控制层
 */
@Controller
public class ImageUtilController {
	private static Logger log = LoggerFactory.getLogger(ImageUtilController.class);
	
	@RequestMapping("/createImage.do")
	public void createImg(HttpServletRequest req,HttpServletResponse res){
		 try{
		       //生成随机的验证码和图片
				Object[] objs=ImageUtil.createImage();
				//将验证码存入session
				HttpSession session=req.getSession();
				session.setAttribute("imgCode",objs[0]);
				//将图片输出给浏览器
				BufferedImage img=(BufferedImage)objs[1];
				//概输出流的目标就是浏览器
				OutputStream os=res.getOutputStream();
				ImageIO.write(img,"png",os);
				//具体格式在/tomcat/conf/web.xml可见
				res.setContentType("image/png");
				os.close();
		 }catch(Exception e){
			 log.error("生成验证码出错");
	  }
	}
}
