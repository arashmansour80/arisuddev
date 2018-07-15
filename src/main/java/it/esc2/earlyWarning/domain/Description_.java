
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description_data"
})
public class Description_ implements Serializable
{

    @JsonProperty("description_data")
    private List<DescriptionDatum> descriptionData = null;
    private final static long serialVersionUID = -7844301103153690293L;

    @JsonProperty("description_data")
    public List<DescriptionDatum> getDescriptionData() {
        return descriptionData;
    }

    @JsonProperty("description_data")
    public void setDescriptionData(List<DescriptionDatum> descriptionData) {
        this.descriptionData = descriptionData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("descriptionData", descriptionData).toString();
    }

}
