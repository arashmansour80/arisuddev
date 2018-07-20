
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vuln:definition"
})
public class VulnScanner implements Serializable
{

    @JsonProperty("vuln:definition")
    private VulnDefinition vulnDefinition;
    private final static long serialVersionUID = 5830654086779555432L;

    @JsonProperty("vuln:definition")
    public VulnDefinition getVulnDefinition() {
        return vulnDefinition;
    }

    @JsonProperty("vuln:definition")
    public void setVulnDefinition(VulnDefinition vulnDefinition) {
        this.vulnDefinition = vulnDefinition;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vulnDefinition", vulnDefinition).toString();
    }

}
