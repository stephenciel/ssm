package cn.controller;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.servlet.http.HttpServletRequest;
import java.sql.SQLException;

@Component("log")
//@Aspect
public class Log {
    @Autowired
    private HttpServletRequest request;
//@Before("execution(* com.itheima.ssm.controller.*.*(..))")
    @Before("execution(* cn.service.*.*(..))")
    public void beginTransaction() {
//        System.out.println("yyds1");
//        System.out.println(request);
//        String requestURI = request.getRequestURI();
//        System.out.println("URIIIII"+requestURI);
        String remoteAddr = request.getRemoteAddr();
        System.out.println("IPPP"+remoteAddr);
//        System.out.println("yyds2");
    }
}