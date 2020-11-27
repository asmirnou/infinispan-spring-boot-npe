package com.example.demo;

import org.infinispan.configuration.cache.ConfigurationBuilder;
import org.infinispan.spring.starter.embedded.InfinispanCacheConfigurer;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableCaching
public class CacheConfig {

    @Bean
    public InfinispanCacheConfigurer cacheConfigurer() {
        return manager -> {
            manager.defineConfiguration("test", new ConfigurationBuilder()
                    .simpleCache(true)
                    .statistics()
                    .available(false)
                    .build());

        };
    }
}
