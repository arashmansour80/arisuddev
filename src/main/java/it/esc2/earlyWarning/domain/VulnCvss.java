
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cvss:base_metrics"
})
public class VulnCvss implements Serializable
{

    @JsonProperty("cvss:base_metrics")
    @Field("cvss:base_metrics")
    private CvssBaseMetrics cvssBaseMetrics;
    private final static long serialVersionUID = 1888591344018598622L;

    @JsonProperty("cvss:base_metrics")
    public CvssBaseMetrics getCvssBaseMetrics() {
        return cvssBaseMetrics;
    }

    @JsonProperty("cvss:base_metrics")
    public void setCvssBaseMetrics(CvssBaseMetrics cvssBaseMetrics) {
        this.cvssBaseMetrics = cvssBaseMetrics;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cvssBaseMetrics", cvssBaseMetrics).toString();
    }

}
