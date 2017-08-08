package com.whut.work.filter;

/**
 * Created by SSS on 2017/7/6.
 */
import java.io.IOException;

import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

    public class LoginFilter extends HttpFilter {

        private final Logger log = LoggerFactory.getLogger(LoginFilter.class);

        @Override
        public void doFilter(HttpServletRequest request,
                             HttpServletResponse response, FilterChain filterChain)
                throws IOException, ServletException {

            log.info("==============拦截get请求================");
/*            if ("GET".equalsIgnoreCase(request.getMethod())) {
                RequestUtil.saveRequest(request);
            }*/
            String requestUri = request.getRequestURI();
            String contextPath = request.getContextPath();
            String url = requestUri.substring(contextPath.length());
            System.out.print(url);
            if ("/login".equals(url)) {
                filterChain.doFilter(request, response);
                return;
            } else {
                System.out.println("lanjie"+url);
                String username = (String) request.getSession().getAttribute("userId");
                if (username == null) {
                    log.info("被拦截：跳转到login页面！");
                    request.getRequestDispatcher("/login.html").forward(request, response);
                } else
                    filterChain.doFilter(request, response);
            }
        }
    }