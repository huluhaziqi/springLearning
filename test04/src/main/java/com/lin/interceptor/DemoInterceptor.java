//package com.lin.interceptor;
//
//import org.springframework.web.servlet.ModelAndView;
//import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;
//
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//public class DemoInterceptor extends HandlerInterceptorAdapter {
//    @Override
//    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
////        HandlerMethod handlerMethod =  (HandlerMethod)handler;
////        DemoAnno demoAnno = handlerMethod.getMethodAnnotation(DemoAnno.class);
////        LoginAnno loginAnno = handlerMethod.getMethodAnnotation(LoginAnno.class);
////        if(demoAnno != null){
////            System.out.println("demoAnno test success!");
////        }
////        if(loginAnno != null){
////            if(request.getCookies() == null){
////                throw new RuntimeException("错误");
////            }
////            System.out.println("cookies :" + request.getCookies());
////            if(request.getAttribute("abc") == null){
////                throw new RuntimeException("abc错误");
////            }else {
////                System.out.println("abc : " + request.getAttribute("abc"));
////            }
////        }
////        request.setAttribute("startTime",System.currentTimeMillis());
////        return true;
//        return true;
//    }
//
//    @Override
//    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
//        long startTime = (long)request.getAttribute("startTime");
//        System.out.println("startTime :" + startTime);
//        long costTime = (System.currentTimeMillis() - startTime);
//        request.setAttribute("handlingTime" , costTime);
//        System.out.println("handlingTime : " + costTime);
//
//    }
//}
