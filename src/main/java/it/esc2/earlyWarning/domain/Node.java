
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "operator",
    "cpe"
})
public class Node implements Serializable
{

    @JsonProperty("operator")
    private String operator;
    @JsonProperty("cpe")
    private List<Cpe> cpe = null;
    private final static long serialVersionUID = 629227381026303193L;

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @JsonProperty("cpe")
    public List<Cpe> getCpe() {
        return cpe;
    }

    @JsonProperty("cpe")
    public void setCpe(List<Cpe> cpe) {
        this.cpe = cpe;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("operator", operator).append("cpe", cpe).toString();
    }

}
