package com.cn.wordonlineediting.config.durid;

import com.alibaba.druid.support.http.WebStatFilter;
import javax.servlet.annotation.WebFilter;
import javax.servlet.annotation.WebInitParam;

/**
 * 配置StatView的Servlet：
 * Filter的实现类：
 * Created by QSJ on 2018/12/14.
 */
/*@WebFilter(filterName="druidWebStatFilter",urlPatterns="*//*",
initParams={
        @WebInitParam(name="exclusions",value="*.js,*.gif,*.jpg,*.bmp,*.png,*.css,*.ico,/druid*//*")//忽略资源
}
)
public class DruidStatFilter extends WebStatFilter {

}*/
