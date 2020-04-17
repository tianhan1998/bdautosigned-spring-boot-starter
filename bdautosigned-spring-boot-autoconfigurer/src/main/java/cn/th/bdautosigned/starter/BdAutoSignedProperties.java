package cn.th.bdautosigned.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author tianh
 */
@ConfigurationProperties(prefix = "cn.th.bdautosigned")
public class BdAutoSignedProperties {
    private String bduss;

    public String getBduss() {
        return bduss;
    }

    public void setBduss(String bduss) {
        this.bduss = bduss;
    }
}
