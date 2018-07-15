
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "baseMetricV2"
})
public class Impact implements Serializable
{

    @JsonProperty("baseMetricV2")
    private BaseMetricV2 baseMetricV2;
    private final static long serialVersionUID = -8835125339601442616L;

    @JsonProperty("baseMetricV2")
    public BaseMetricV2 getBaseMetricV2() {
        return baseMetricV2;
    }

    @JsonProperty("baseMetricV2")
    public void setBaseMetricV2(BaseMetricV2 baseMetricV2) {
        this.baseMetricV2 = baseMetricV2;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("baseMetricV2", baseMetricV2).toString();
    }

}
