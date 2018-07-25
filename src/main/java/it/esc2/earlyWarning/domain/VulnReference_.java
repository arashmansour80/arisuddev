
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "xml:lang",
    "href",
    "content"
})
@Document
public class VulnReference_ implements Serializable
{

    @JsonProperty("xml:lang")
    private String xmlLang;
    @JsonProperty("href")
    private String href;
    @JsonProperty("content")
    private String content;
    private final static long serialVersionUID = -4121663146896307185L;

    @JsonProperty("xml:lang")
    public String getXmlLang() {
        return xmlLang;
    }

    @JsonProperty("xml:lang")
    public void setXmlLang(String xmlLang) {
        this.xmlLang = xmlLang;
    }

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
        return new ToStringBuilder(this).append("xmlLang", xmlLang).append("href", href).append("content", content).toString();
    }

}
