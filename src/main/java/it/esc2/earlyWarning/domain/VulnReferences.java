
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "vuln:reference",
    "vuln:source",
    "xml:lang",
    "reference_type"
})
public class VulnReferences implements Serializable
{

    @JsonProperty("vuln:reference")
    private VulnReference vulnReference;
    @JsonProperty("vuln:source")
    private String vulnSource;
    @JsonProperty("xml:lang")
    private String xmlLang;
    @JsonProperty("reference_type")
    private String referenceType;
    private final static long serialVersionUID = -6470851884536287785L;

    @JsonProperty("vuln:reference")
    public VulnReference getVulnReference() {
        return vulnReference;
    }

    @JsonProperty("vuln:reference")
    public void setVulnReference(VulnReference vulnReference) {
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
