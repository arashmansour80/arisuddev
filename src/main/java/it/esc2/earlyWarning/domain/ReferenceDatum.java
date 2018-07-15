
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "url",
    "name",
    "refsource"
})
public class ReferenceDatum implements Serializable
{

    @JsonProperty("url")
    private String url;
    @JsonProperty("name")
    private String name;
    @JsonProperty("refsource")
    private String refsource;
    private final static long serialVersionUID = 364622129065149199L;

    @JsonProperty("url")
    public String getUrl() {
        return url;
    }

    @JsonProperty("url")
    public void setUrl(String url) {
        this.url = url;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("refsource")
    public String getRefsource() {
        return refsource;
    }

    @JsonProperty("refsource")
    public void setRefsource(String refsource) {
        this.refsource = refsource;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("url", url).append("name", name).append("refsource", refsource).toString();
    }

}
