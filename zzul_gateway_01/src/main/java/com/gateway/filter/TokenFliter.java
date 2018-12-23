package com.gateway.filter;


import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;
import org.apache.commons.lang.StringUtils;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;

@Component
public class TokenFliter extends ZuulFilter {
    @Override
    public String filterType() {//过滤器类型：返回 pre  请求之前执行
        return "pre";
    }

    @Override
    public int filterOrder() {//过滤器执行顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {//判断过滤器是否失效
        return true;
    }

    @Override
    public Object run() throws ZuulException {// 过滤器拦截业务代码

        //1.获取上下文
        RequestContext currentContext = RequestContext.getCurrentContext();

        //2. 获取request
        HttpServletRequest request = currentContext.getRequest();

        //3. 获取token ，最好是从请求头中获取
        String userToken = request.getParameter("userToken");
        if(StringUtils.isEmpty(userToken)){
            //不会继续向下执行
            currentContext.setSendZuulResponse(false);
            currentContext.setResponseBody("userToken is null");
            currentContext.setResponseStatusCode(401);
            //返回一个错误提示

        }

        return null;
    }
}
