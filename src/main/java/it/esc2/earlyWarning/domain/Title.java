package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "xml:lang",
    "content"
})
public class Title implements Serializable {

    private final static long serialVersionUID = -9086219983652058831L;

    @JsonProperty("xml:lang")
    @Field("xml:lang")
    private String xmlLang;
    @JsonProperty("content")
    private String content;

    @JsonProperty("xml:lang")
    public String getXmlLang() {
        return xmlLang;
    }

    @JsonProperty("xml:lang")
    public void setXmlLang(String xmlLang) {
        this.xmlLang = xmlLang;
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
        return new ToStringBuilder(this).append("xmlLang", xmlLang).append("content", content).toString();
    }

}
