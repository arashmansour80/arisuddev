package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "href",
    "content"
})
public class Reference implements Serializable {

    private final static long serialVersionUID = -6310557015461301818L;

    @JsonProperty("href")
    private String href;
    @JsonProperty("content")
    private String content;

    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @JsonProperty("href")
    public void setHref(String href) {
        this.href = href;
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
        return new ToStringBuilder(this).append("href", href).append("content", content).toString();
    }

}
