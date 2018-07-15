
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "description"
})
public class ProblemtypeDatum implements Serializable
{

    @JsonProperty("description")
    private List<Description> description = null;
    private final static long serialVersionUID = 3181898982208319612L;

    @JsonProperty("description")
    public List<Description> getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(List<Description> description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("description", description).toString();
    }

}
