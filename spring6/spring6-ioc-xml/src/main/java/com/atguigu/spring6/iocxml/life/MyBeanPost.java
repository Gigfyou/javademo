package com.atguigu.spring6.iocxml.life;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;

public class MyBeanPost implements BeanPostProcessor {
    @Override
    public  Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("3 后置处理器，之前执行");
        System.out.println(beanName+"::"+bean);
        return bean;
    }
    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        System.out.println("5 后置处理器，之后执行");
        System.out.println(beanName+"::"+bean);
        return bean;
    }
}
