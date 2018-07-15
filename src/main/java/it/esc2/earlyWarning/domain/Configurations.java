
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "CVE_data_version",
    "nodes"
})
public class Configurations implements Serializable
{

    @JsonProperty("CVE_data_version")
    private String cVEDataVersion;
    @JsonProperty("nodes")
    private List<Node> nodes = null;
    private final static long serialVersionUID = -719018868420940987L;

    @JsonProperty("CVE_data_version")
    public String getCVEDataVersion() {
        return cVEDataVersion;
    }

    @JsonProperty("CVE_data_version")
    public void setCVEDataVersion(String cVEDataVersion) {
        this.cVEDataVersion = cVEDataVersion;
    }

    @JsonProperty("nodes")
    public List<Node> getNodes() {
        return nodes;
    }

    @JsonProperty("nodes")
    public void setNodes(List<Node> nodes) {
        this.nodes = nodes;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cVEDataVersion", cVEDataVersion).append("nodes", nodes).toString();
    }

}
