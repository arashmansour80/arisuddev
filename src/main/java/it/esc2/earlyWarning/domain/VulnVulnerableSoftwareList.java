
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vuln:product"
})
public class VulnVulnerableSoftwareList implements Serializable
{

    @JsonProperty("vuln:product")
    private List<String> vulnProduct = null;
    private final static long serialVersionUID = -913496696571881985L;

    @JsonProperty("vuln:product")
    public List<String> getVulnProduct() {
        return vulnProduct;
    }

    @JsonProperty("vuln:product")
    public void setVulnProduct(List<String> vulnProduct) {
        this.vulnProduct = vulnProduct;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vulnProduct", vulnProduct).toString();
    }

}