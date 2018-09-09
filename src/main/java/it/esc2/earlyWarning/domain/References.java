package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "reference"
})
public class References implements Serializable {

    private final static long serialVersionUID = -874550620179156758L;

    @JsonProperty("reference")
    private List<Reference> reference = null;

    @JsonProperty("reference")
    public List<Reference> getReference() {
        return reference;
    }

    @JsonProperty("reference")
    public void setReference(List<Reference> reference) {
        this.reference = reference;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("reference", reference).toString();
    }

}
