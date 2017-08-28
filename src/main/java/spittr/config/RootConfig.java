package spittr.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.FilterType;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * Created with Intellij IDEA.
 * Description:
 * User: baby
 * Date: 2017/8/28
 * Time: 9:10
 */
@Configuration
@ComponentScan(basePackages = {"spittr"},
excludeFilters = {
        @ComponentScan.Filter(type = FilterType.ANNOTATION,value = EnableWebMvc.class)
})
public class RootConfig {
}
