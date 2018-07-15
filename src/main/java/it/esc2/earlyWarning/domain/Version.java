
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version_data"
})
public class Version implements Serializable
{

    @JsonProperty("version_data")
    private List<VersionDatum> versionData = null;
    private final static long serialVersionUID = 5556249304950889846L;

    @JsonProperty("version_data")
    public List<VersionDatum> getVersionData() {
        return versionData;
    }

    @JsonProperty("version_data")
    public void setVersionData(List<VersionDatum> versionData) {
        this.versionData = versionData;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("versionData", versionData).toString();
    }

}
