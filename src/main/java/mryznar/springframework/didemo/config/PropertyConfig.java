package mryznar.springframework.didemo.config;

import mryznar.springframework.didemo.examplebeans.FakeDataSource;
import mryznar.springframework.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;
import org.springframework.core.env.Environment;

@Configuration
//@PropertySource("classpath:datasource.properties")
//@PropertySources({
//        @PropertySource("classpath:datasource.properties"),
//        @PropertySource("classpath:jms.properties")
//})
public class PropertyConfig {

    @Value("${guru.username}")
    String user;
    @Value("${guru.password}")
    String password;
    @Value("${guru.dburl}")
    String url;

    @Value("${guru.jms.username}")
    String jmsuser;
    @Value("${guru.jms.password}")
    String jmspassword;
    @Value("${guru.jms.url}")
    String jmsurl;

    /**
     * Access to OS environment
     */
    @Autowired
    Environment env;

    @Bean
    public FakeDataSource fakeDataSource(){
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(user);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);
        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker(){
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsuser);
        fakeJmsBroker.setPassword(jmspassword);
        fakeJmsBroker.setUrl(jmsurl);
        return fakeJmsBroker;
    }
    /**
     * PropertySourcesPlaceholderConfigurer reads the configuration file
     * @return
     */
//    @Bean
//    public static PropertySourcesPlaceholderConfigurer properties(){
//        PropertySourcesPlaceholderConfigurer propertySourcesPlaceholderConfigurer = new PropertySourcesPlaceholderConfigurer();
//        return propertySourcesPlaceholderConfigurer;
//    }
}
