
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "negate",
    "cpe-lang:fact-ref",
    "operator"
})
@Document
public class CpeLangLogicalTest implements Serializable
{

    @JsonProperty("negate")
    private boolean negate;
    @JsonProperty("cpe-lang:fact-ref")
    private List<CpeLangFactRef> cpeLangFactRef = null;
    @JsonProperty("operator")
    private String operator;
    private final static long serialVersionUID = -9054768887256762498L;

    @JsonProperty("negate")
    public boolean isNegate() {
        return negate;
    }

    @JsonProperty("negate")
    public void setNegate(boolean negate) {
        this.negate = negate;
    }

    @JsonProperty("cpe-lang:fact-ref")
    public List<CpeLangFactRef> getCpeLangFactRef() {
        return cpeLangFactRef;
    }

    @JsonProperty("cpe-lang:fact-ref")
    public void setCpeLangFactRef(List<CpeLangFactRef> cpeLangFactRef) {
        this.cpeLangFactRef = cpeLangFactRef;
    }

    @JsonProperty("operator")
    public String getOperator() {
        return operator;
    }

    @JsonProperty("operator")
    public void setOperator(String operator) {
        this.operator = operator;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("negate", negate).append("cpeLangFactRef", cpeLangFactRef).append("operator", operator).toString();
    }

}
