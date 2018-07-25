
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vuln:reference",
    "vuln:source",
    "xml:lang",
    "reference_type"
})
@Document
public class VulnReference implements Serializable
{

    @JsonProperty("vuln:reference")
    private VulnReference_ vulnReference;
    @JsonProperty("vuln:source")
    private String vulnSource;
    @JsonProperty("xml:lang")
    private String xmlLang;
    @JsonProperty("reference_type")
    private String referenceType;
    private final static long serialVersionUID = 7357993151862821565L;

    @JsonProperty("vuln:reference")
    public VulnReference_ getVulnReference() {
        return vulnReference;
    }

    @JsonProperty("vuln:reference")
    public void setVulnReference(VulnReference_ vulnReference) {
        this.vulnReference = vulnReference;
    }

    @JsonProperty("vuln:source")
    public String getVulnSource() {
        return vulnSource;
    }

    @JsonProperty("vuln:source")
    public void setVulnSource(String vulnSource) {
        this.vulnSource = vulnSource;
    }

    @JsonProperty("xml:lang")
    public String getXmlLang() {
        return xmlLang;
    }

    @JsonProperty("xml:lang")
    public void setXmlLang(String xmlLang) {
        this.xmlLang = xmlLang;
    }

    @JsonProperty("reference_type")
    public String getReferenceType() {
        return referenceType;
    }

    @JsonProperty("reference_type")
    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("vulnReference", vulnReference).append("vulnSource", vulnSource).append("xmlLang", xmlLang).append("referenceType", referenceType).toString();
    }

}
