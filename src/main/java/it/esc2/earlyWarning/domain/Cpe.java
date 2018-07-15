
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vulnerable",
    "cpe22Uri",
    "cpe23Uri"
})
public class Cpe implements Serializable
{

    @JsonProperty("vulnerable")
    private boolean vulnerable;
    @JsonProperty("cpe22Uri")
    private String cpe22Uri;
    @JsonProperty("cpe23Uri")
    private String cpe23Uri;
    private final static long serialVersionUID = 6146093971465870819L;

    @JsonProperty("vulnerable")
    public boolean isVulnerable() {
        return vulnerable;
    }

    @JsonProperty("vulnerable")
    public void setVulnerable(boolean vulnerable) {
        this.vulnerable = vulnerable;
    }

    @JsonProperty("cpe22Uri")
    public String getCpe22Uri() {
        return cpe22Uri;
    }

    @JsonProperty("cpe22Uri")
    public void setCpe22Uri(String cpe22Uri) {
        this.cpe22Uri = cpe22Uri;
    }

    @JsonProperty("cpe23Uri")
    public String getCpe23Uri() {
        return cpe23Uri;
    }

    @JsonProperty("cpe23Uri")
    public void setCpe23Uri(String cpe23Uri) {
        this.cpe23Uri = cpe23Uri;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vulnerable", vulnerable).append("cpe22Uri", cpe22Uri).append("cpe23Uri", cpe23Uri).toString();
    }

}
