package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "cpe-23:deprecation"
})
public class Cpe23Cpe23Item implements Serializable {

    private final static long serialVersionUID = -3123279003405404733L;

    @JsonProperty("name")
    private String name;
    @JsonProperty("cpe-23:deprecation")
    @Field("cpe-23:deprecation")
    private Cpe23Deprecation cpe23Deprecation;

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("cpe-23:deprecation")
    public Cpe23Deprecation getCpe23Deprecation() {
        return cpe23Deprecation;
    }

    @JsonProperty("cpe-23:deprecation")
    public void setCpe23Deprecation(Cpe23Deprecation cpe23Deprecation) {
        this.cpe23Deprecation = cpe23Deprecation;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("name", name).append("cpe23Deprecation", cpe23Deprecation).toString();
    }

}
