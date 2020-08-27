package cn.th.bdautosigned.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author tianh
 */
@ConfigurationProperties(prefix = "cn.th.bdautosigned")
public class BdAutoSignedProperties {
    private String bduss;
    private Integer retry_num;

    public Integer getRetry_num() {
        return retry_num;
    }

    public void setRetry_num(int retry_num) {
        this.retry_num = retry_num;
    }

    public String getBduss() {
        return bduss;
    }

    public void setBduss(String bduss) {
        this.bduss = bduss;
    }
}
