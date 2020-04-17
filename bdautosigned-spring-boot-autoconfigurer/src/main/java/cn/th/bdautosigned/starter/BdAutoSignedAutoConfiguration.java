package cn.th.bdautosigned.starter;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.annotation.Resource;


/**
 * @author tianh
 */
@Configuration
@ConditionalOnMissingBean(BdAutoSignedAutoConfiguration.class)
@EnableConfigurationProperties(BdAutoSignedProperties.class)
public class BdAutoSignedAutoConfiguration {
    @Resource
    BdAutoSignedProperties properties;

    @Bean
    @ConditionalOnMissingBean(AutoSignedService.class)
    public AutoSignedService service(){
        return new AutoSignedService(properties);
    }

}
