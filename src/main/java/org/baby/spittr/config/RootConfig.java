package org.baby.spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created with Intellij IDEA.
 * Description:配置器
 * User: baby
 * Date: 2017/8/28
 * Time: 9:10
 */
@Configuration
@ComponentScan(basePackages = {"org.baby.spittr"},
excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
})
public class RootConfig {
}
