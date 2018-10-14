package com.smart.servlet;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@WebFilter(filterName = "sessionFilter",urlPatterns = {"/*"})
public class SessionFilter implements Filter {



    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {

        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        HttpSession session = request.getSession(false);
        String uri = request.getRequestURI();
        System.out.println("filter url:"+uri);
        if(uri.indexOf("v1")!=-1||uri.indexOf("admin")!=-1){//这里需要拦截

            String userId=request.getSession().getAttribute("userId")==null?"":request.getSession().getAttribute("userId").toString();
            if(userId.equals("")){//说明没有用户信息
                response.sendRedirect(request.getContextPath()+"/");//跳转到登录页
            }else{
                filterChain.doFilter(servletRequest,servletResponse);
            }
        }else{//放行
            filterChain.doFilter(servletRequest,servletResponse);
        }





    }

    @Override
    public void destroy() {

    }







}
