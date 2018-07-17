
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cpe-lang:logical-test",
    "id"
})
public class VulnVulnerableConfiguration implements Serializable
{

    @JsonProperty("cpe-lang:logical-test")
    private CpeLangLogicalTest cpeLangLogicalTest;
    @JsonProperty("id")
    private String id;
    private final static long serialVersionUID = 7141343879617671592L;

    @JsonProperty("cpe-lang:logical-test")
    public CpeLangLogicalTest getCpeLangLogicalTest() {
        return cpeLangLogicalTest;
    }

    @JsonProperty("cpe-lang:logical-test")
    public void setCpeLangLogicalTest(CpeLangLogicalTest cpeLangLogicalTest) {
        this.cpeLangLogicalTest = cpeLangLogicalTest;
    }

    @JsonProperty("id")
    public String getId() {
        return id;
    }

    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cpeLangLogicalTest", cpeLangLogicalTest).append("id", id).toString();
    }

}
