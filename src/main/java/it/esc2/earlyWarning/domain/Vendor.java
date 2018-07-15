
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendor_data"
})
public class Vendor implements Serializable
{

    @JsonProperty("vendor_data")
    private List<VendorDatum> vendorData = null;
    private final static long serialVersionUID = 8923604571471975018L;

    @JsonProperty("vendor_data")
    public List<VendorDatum> getVendorData() {
        return vendorData;
    }

    @JsonProperty("vendor_data")
    public void setVendorData(List<VendorDatum> vendorData) {
        this.vendorData = vendorData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vendorData", vendorData).toString();
    }

}
