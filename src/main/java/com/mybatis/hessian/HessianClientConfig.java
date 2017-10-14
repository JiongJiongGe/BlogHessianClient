package com.mybatis.hessian;

import com.caucho.hessian.client.HessianProxyFactory;
import com.mybatis.service.pen.CalmWangPenServiceI;
import com.mybatis.service.user.CalmWangUserServiceI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.remoting.caucho.HessianProxyFactoryBean;

/**
 * Created by yunkai on 2017/9/19.
 */
@Configuration
public class HessianClientConfig {

    @Bean
    public HessianProxyFactoryBean clientConfig(){
        HessianProxyFactoryBean proxy = new HessianProxyFactoryBean();
        proxy.setServiceUrl("http://127.0.0.1:8911/calmWangUserServiceExporter.hessian");
        proxy.setServiceInterface(CalmWangUserServiceI.class);
        return proxy;
    }

    @Bean
    public HessianProxyFactoryBean penClientConfig(){
        HessianProxyFactoryBean proxy = new HessianProxyFactoryBean();
        proxy.setServiceUrl("http://127.0.0.1:8911/calmWangPenServiceExporter.hessian");
        proxy.setServiceInterface(CalmWangPenServiceI.class);
        return proxy;
    }



}
