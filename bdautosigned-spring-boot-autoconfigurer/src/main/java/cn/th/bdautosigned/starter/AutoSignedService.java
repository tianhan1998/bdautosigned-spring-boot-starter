package cn.th.bdautosigned.starter;

import cn.th.api.Service;
import cn.th.api.impl.ServiceImpl;
import cn.th.utils.Utils;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

/**
 * @author tianh
 */
@Component
public class AutoSignedService {
    BdAutoSignedProperties properties;

    public AutoSignedService(){
    }

    public AutoSignedService(BdAutoSignedProperties properties){
        this.properties=properties;
        if(properties.getRetry_num()!=null){
            Utils.setCookieAndRetryNumInHeaders(properties.getBduss(),properties.getRetry_num());
        }else {
            Utils.setCookieInHeaders(properties.getBduss());
        }
    }

    public void allSigned(){
        Utils.allSigned(true);
    }

    public BdAutoSignedProperties getProperties() {
        return properties;
    }

    public void setProperties(BdAutoSignedProperties properties) {
        this.properties = properties;
    }
}
