package company.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import company.interceptor.ErrorInterceptor;

import java.util.List;

/**
 * Created by nata on 11.03.2017.
 */


@EnableWebMvc
@EnableScheduling
//
@Configuration

@ComponentScan({"company.service", "company.controller"})
public class WebServerForBMScApplicationConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addInterceptors(InterceptorRegistry registry) {
              registry.addInterceptor(new ErrorInterceptor());


    }

}
