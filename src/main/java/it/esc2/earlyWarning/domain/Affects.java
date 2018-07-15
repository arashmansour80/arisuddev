
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendor"
})
public class Affects implements Serializable
{

    @JsonProperty("vendor")
    private Vendor vendor;
    private final static long serialVersionUID = 1271317310408324303L;

    @JsonProperty("vendor")
    public Vendor getVendor() {
        return vendor;
    }

    @JsonProperty("vendor")
    public void setVendor(Vendor vendor) {
        this.vendor = vendor;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vendor", vendor).toString();
    }

}
