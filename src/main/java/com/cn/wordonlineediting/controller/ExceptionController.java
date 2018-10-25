package com.cn.wordonlineediting.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * 异常及错误处理
 * Created by QSJ on 2018/10/25.
 */
@Controller
@RequestMapping("/error")
public class ExceptionController {

    private Logger log = LoggerFactory.getLogger(ExceptionController.class);

    /**
     * 错误页面跳转
     * @return
     */
    @RequestMapping("/error.do")
    public String errorView(){

        return "error/error";
    }
}
