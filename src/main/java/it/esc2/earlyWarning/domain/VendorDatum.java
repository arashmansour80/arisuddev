
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vendor_name",
    "product"
})
public class VendorDatum implements Serializable
{

    @JsonProperty("vendor_name")
    private String vendorName;
    @JsonProperty("product")
    private Product product;
    private final static long serialVersionUID = -6418486022894506836L;

    @JsonProperty("vendor_name")
    public String getVendorName() {
        return vendorName;
    }

    @JsonProperty("vendor_name")
    public void setVendorName(String vendorName) {
        this.vendorName = vendorName;
    }

    @JsonProperty("product")
    public Product getProduct() {
        return product;
    }

    @JsonProperty("product")
    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vendorName", vendorName).append("product", product).toString();
    }

}
