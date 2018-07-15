
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reference_data"
})
public class References implements Serializable
{

    @JsonProperty("reference_data")
    private List<ReferenceDatum> referenceData = null;
    private final static long serialVersionUID = -8311320076308841747L;

    @JsonProperty("reference_data")
    public List<ReferenceDatum> getReferenceData() {
        return referenceData;
    }

    @JsonProperty("reference_data")
    public void setReferenceData(List<ReferenceDatum> referenceData) {
        this.referenceData = referenceData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("referenceData", referenceData).toString();
    }

}
