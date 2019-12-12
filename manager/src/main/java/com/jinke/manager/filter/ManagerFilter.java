package com.jinke.manager.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.exception.ZuulException;
import org.springframework.stereotype.Component;

@Component
public class ManagerFilter extends ZuulFilter {
    @Override
    public String filterType() {
        //过滤器类型：之前或之后
        return "pre";
    }

    @Override
    public int filterOrder() {
        //多个过滤器的执行顺序
        return 0;
    }

    @Override
    public boolean shouldFilter() {
        //是否开启该过滤器
        return true;
    }

    @Override
    public Object run() throws ZuulException {
        //如果设置setsendzullResponse(false)表示不再继续执行
        System.out.println("已经执行到最后了");
        return null;
    }
}
