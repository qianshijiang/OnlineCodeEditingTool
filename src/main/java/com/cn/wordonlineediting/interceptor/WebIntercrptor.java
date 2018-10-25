package com.cn.wordonlineediting.interceptor;

import com.cn.wordonlineediting.pojo.Worduser;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 拦截器
 * Created by QSJ on 2018/10/25.
 */
public class WebIntercrptor extends HandlerInterceptorAdapter{
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String url = request.getRequestURI();
        //获取session中的数据
        Worduser user = (Worduser)request.getSession().getAttribute("user");
        if(user!=null){
            return true;
        }if(url.indexOf("login.do")>0){
            return true;
        }if(url.indexOf("tologins.do")>0){
            return true;
        }if(url.indexOf("regist.do")>0){
            return true;
        }if(url.indexOf("findpwd.do")>0){
            return true;
        }if(url.indexOf("updatepassword.do")>0){
            return true;
        }if(url.lastIndexOf("toupdatepwds.do")>0){
            return true;
        }if(url.lastIndexOf("toupdatepas.do")>0){
            return true;
        }if(url.indexOf("createImage.do")>0){
            return true;
        }

        //request.getRequestDispatcher("../login/login.do").forward(request, response); //使用转发会出现url路径不变的影响，对提交请求的路径会产生错误的引导。
        response.sendRedirect("login/login.do");
        return false;

    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView)
            throws Exception {

    }
}
