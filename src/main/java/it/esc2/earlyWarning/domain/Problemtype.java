
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "problemtype_data"
})
public class Problemtype implements Serializable
{

    @JsonProperty("problemtype_data")
    private List<ProblemtypeDatum> problemtypeData = null;
    private final static long serialVersionUID = -3112817710683995752L;

    @JsonProperty("problemtype_data")
    public List<ProblemtypeDatum> getProblemtypeData() {
        return problemtypeData;
    }

    @JsonProperty("problemtype_data")
    public void setProblemtypeData(List<ProblemtypeDatum> problemtypeData) {
        this.problemtypeData = problemtypeData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("problemtypeData", problemtypeData).toString();
    }

}
