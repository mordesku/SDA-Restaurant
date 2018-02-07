package pl.mordesku.sda.restaurant;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

/**
 * Created with notepad.exe.
 * Author: mprzybylski
 * Date: 2018-02-07
 * Time: 19:08
 */
@Configuration
@EnableWebMvc
@ComponentScan("pl.mordesku.sda.restaurant")
public class AppConfig extends WebMvcConfigurationSupport {

    @Bean
    InternalResourceViewResolver internalResourceViewResolver() {
        InternalResourceViewResolver internalResourceViewResolver = new InternalResourceViewResolver();
        internalResourceViewResolver.setPrefix("/WEB-INF/views/");
        internalResourceViewResolver.setSuffix(".jsp");
        return internalResourceViewResolver;
    }


}
