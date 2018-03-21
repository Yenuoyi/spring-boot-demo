package com.example.demo.session;

import org.springframework.session.data.redis.config.annotation.web.http.EnableRedisHttpSession;

/**
 * @author yebing
 * @version V1.0.0
 * @Date 2018/3/21 22:06
 * @description 分布式Session，使用spring.session.store-type=redis自动配置
 */
@EnableRedisHttpSession(maxInactiveIntervalInSeconds= 1800)
public class SessionConfig {

}
