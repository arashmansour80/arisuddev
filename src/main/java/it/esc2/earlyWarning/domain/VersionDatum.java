
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version_value"
})
public class VersionDatum implements Serializable
{

    @JsonProperty("version_value")
    private String versionValue;
    private final static long serialVersionUID = -5288264445213228420L;

    @JsonProperty("version_value")
    public String getVersionValue() {
        return versionValue;
    }

    @JsonProperty("version_value")
    public void setVersionValue(String versionValue) {
        this.versionValue = versionValue;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("versionValue", versionValue).toString();
    }

}
