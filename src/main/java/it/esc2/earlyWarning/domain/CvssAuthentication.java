
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "approximated",
    "content"
})
public class CvssAuthentication implements Serializable
{

    @JsonProperty("approximated")
    private boolean approximated;
    @JsonProperty("content")
    private String content;
    private final static long serialVersionUID = 5052134790559305197L;

    @JsonProperty("approximated")
    public boolean isApproximated() {
        return approximated;
    }

    @JsonProperty("approximated")
    public void setApproximated(boolean approximated) {
        this.approximated = approximated;
    }

    @JsonProperty("content")
    public String getContent() {
        return content;
    }

    @JsonProperty("content")
    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("approximated", approximated).append("content", content).toString();
    }

}
