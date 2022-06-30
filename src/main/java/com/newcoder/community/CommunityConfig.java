package com.newcoder.community;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;
import java.util.regex.Pattern;

/**
 * @author feyfey
 * @create 2022/6/29
 * @University JiangHan Univiersity
 */
@Configuration
public class CommunityConfig {
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
    }
}
