
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "ID",
    "ASSIGNER"
})
public class CVEDataMeta implements Serializable
{

    @JsonProperty("ID")
    private String iD;
    @JsonProperty("ASSIGNER")
    private String aSSIGNER;
    private final static long serialVersionUID = -2637408083494232129L;

    @JsonProperty("ID")
    public String getID() {
        return iD;
    }

    @JsonProperty("ID")
    public void setID(String iD) {
        this.iD = iD;
    }

    @JsonProperty("ASSIGNER")
    public String getASSIGNER() {
        return aSSIGNER;
    }

    @JsonProperty("ASSIGNER")
    public void setASSIGNER(String aSSIGNER) {
        this.aSSIGNER = aSSIGNER;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("iD", iD).append("aSSIGNER", aSSIGNER).toString();
    }

}
