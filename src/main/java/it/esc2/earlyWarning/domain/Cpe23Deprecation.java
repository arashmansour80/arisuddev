package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "date",
    "cpe-23:deprecated-by"
})
public class Cpe23Deprecation implements Serializable {

    private final static long serialVersionUID = 5848504079536075138L;
    @JsonProperty("date")
    private String date;
    @JsonProperty("cpe-23:deprecated-by")
    @Field("cpe-23:deprecated-by")
    private Cpe23DeprecatedBy cpe23DeprecatedBy;

    @JsonProperty("date")
    public String getDate() {
        return date;
    }

    @JsonProperty("date")
    public void setDate(String date) {
        this.date = date;
    }

    @JsonProperty("cpe-23:deprecated-by")
    public Cpe23DeprecatedBy getCpe23DeprecatedBy() {
        return cpe23DeprecatedBy;
    }

    @JsonProperty("cpe-23:deprecated-by")
    public void setCpe23DeprecatedBy(Cpe23DeprecatedBy cpe23DeprecatedBy) {
        this.cpe23DeprecatedBy = cpe23DeprecatedBy;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("date", date).append("cpe23DeprecatedBy", cpe23DeprecatedBy).toString();
    }

}
