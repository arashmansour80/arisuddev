package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Field;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "note",
    "xml:lang"
})
public class Notes implements Serializable {

    private final static long serialVersionUID = 1095577111682934893L;

    @JsonProperty("note")
    private String note;
    @JsonProperty("xml:lang")
    @Field("xml:lang")
    private String xmlLang;

    @JsonProperty("note")
    public String getNote() {
        return note;
    }

    @JsonProperty("note")
    public void setNote(String note) {
        this.note = note;
    }

    @JsonProperty("xml:lang")
    public String getXmlLang() {
        return xmlLang;
    }

    @JsonProperty("xml:lang")
    public void setXmlLang(String xmlLang) {
        this.xmlLang = xmlLang;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("note", note).append("xmlLang", xmlLang).toString();
    }

}
