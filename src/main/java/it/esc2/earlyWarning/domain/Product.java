
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "product_data"
})
public class Product implements Serializable
{

    @JsonProperty("product_data")
    private List<ProductDatum> productData = null;
    private final static long serialVersionUID = -8810277529072296126L;

    @JsonProperty("product_data")
    public List<ProductDatum> getProductData() {
        return productData;
    }

    @JsonProperty("product_data")
    public void setProductData(List<ProductDatum> productData) {
        this.productData = productData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("productData", productData).toString();
    }

}
