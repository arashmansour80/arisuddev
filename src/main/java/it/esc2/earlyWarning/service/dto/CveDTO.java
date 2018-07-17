package it.esc2.earlyWarning.service.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import it.esc2.earlyWarning.domain.VulnCvss;
import it.esc2.earlyWarning.domain.VulnCwe;
import it.esc2.earlyWarning.domain.VulnReferences;
import it.esc2.earlyWarning.domain.VulnVulnerableConfiguration;
import it.esc2.earlyWarning.domain.VulnVulnerableSoftwareList;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "vuln:vulnerable-configuration",
    "vuln:cwe",
    "vuln:last-modified-datetime",
    "vuln:vulnerable-software-list",
    "vuln:cvss",
    "vuln:references",
    "idCve",
    "vuln:summary",
    "vuln:published-datetime",
    "vuln:cve-id"
})
public class CveDTO implements Serializable {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("vuln:vulnerable-configuration")
    private VulnVulnerableConfiguration vulnVulnerableConfiguration;
    @JsonProperty("vuln:cwe")
    private VulnCwe vulnCwe;
    @JsonProperty("vuln:last-modified-datetime")
    private String vulnLastModifiedDatetime;
    @JsonProperty("vuln:vulnerable-software-list")
    private VulnVulnerableSoftwareList vulnVulnerableSoftwareList;
    @JsonProperty("vuln:cvss")
    private VulnCvss vulnCvss;
    @JsonProperty("vuln:references")
    private VulnReferences vulnReferences;
    @JsonProperty("idCve")
    private String idCve;
    @JsonProperty("vuln:summary")
    private String vulnSummary;
    @JsonProperty("vuln:published-datetime")
    private String vulnPublishedDatetime;
    @JsonProperty("vuln:cve-id")
    private String vulnCveId;
    private final static long serialVersionUID = 3717734833228595006L;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("vuln:vulnerable-configuration")
    public VulnVulnerableConfiguration getVulnVulnerableConfiguration() {
        return vulnVulnerableConfiguration;
    }

    @JsonProperty("vuln:vulnerable-configuration")
    public void setVulnVulnerableConfiguration(VulnVulnerableConfiguration vulnVulnerableConfiguration) {
        this.vulnVulnerableConfiguration = vulnVulnerableConfiguration;
    }

    @JsonProperty("vuln:cwe")
    public VulnCwe getVulnCwe() {
        return vulnCwe;
    }

    @JsonProperty("vuln:cwe")
    public void setVulnCwe(VulnCwe vulnCwe) {
        this.vulnCwe = vulnCwe;
    }

    @JsonProperty("vuln:last-modified-datetime")
    public String getVulnLastModifiedDatetime() {
        return vulnLastModifiedDatetime;
    }

    @JsonProperty("vuln:last-modified-datetime")
    public void setVulnLastModifiedDatetime(String vulnLastModifiedDatetime) {
        this.vulnLastModifiedDatetime = vulnLastModifiedDatetime;
    }

    @JsonProperty("vuln:vulnerable-software-list")
    public VulnVulnerableSoftwareList getVulnVulnerableSoftwareList() {
        return vulnVulnerableSoftwareList;
    }

    @JsonProperty("vuln:vulnerable-software-list")
    public void setVulnVulnerableSoftwareList(VulnVulnerableSoftwareList vulnVulnerableSoftwareList) {
        this.vulnVulnerableSoftwareList = vulnVulnerableSoftwareList;
    }

    @JsonProperty("vuln:cvss")
    public VulnCvss getVulnCvss() {
        return vulnCvss;
    }

    @JsonProperty("vuln:cvss")
    public void setVulnCvss(VulnCvss vulnCvss) {
        this.vulnCvss = vulnCvss;
    }

    @JsonProperty("vuln:references")
    public VulnReferences getVulnReferences() {
        return vulnReferences;
    }

    @JsonProperty("vuln:references")
    public void setVulnReferences(VulnReferences vulnReferences) {
        this.vulnReferences = vulnReferences;
    }

    @JsonProperty("idCve")
    public String getIdCve() {
        return idCve;
    }

    @JsonProperty("idCve")
    public void setIdCve(String idCve) {
        this.idCve = idCve;
    }

    @JsonProperty("vuln:summary")
    public String getVulnSummary() {
        return vulnSummary;
    }

    @JsonProperty("vuln:summary")
    public void setVulnSummary(String vulnSummary) {
        this.vulnSummary = vulnSummary;
    }

    @JsonProperty("vuln:published-datetime")
    public String getVulnPublishedDatetime() {
        return vulnPublishedDatetime;
    }

    @JsonProperty("vuln:published-datetime")
    public void setVulnPublishedDatetime(String vulnPublishedDatetime) {
        this.vulnPublishedDatetime = vulnPublishedDatetime;
    }

    @JsonProperty("vuln:cve-id")
    public String getVulnCveId() {
        return vulnCveId;
    }

    @JsonProperty("vuln:cve-id")
    public void setVulnCveId(String vulnCveId) {
        this.vulnCveId = vulnCveId;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("vulnVulnerableConfiguration", vulnVulnerableConfiguration).append("vulnCwe", vulnCwe).append("vulnLastModifiedDatetime", vulnLastModifiedDatetime).append("vulnVulnerableSoftwareList", vulnVulnerableSoftwareList).append("vulnCvss", vulnCvss).append("vulnReferences", vulnReferences).append("idCve", idCve).append("vulnSummary", vulnSummary).append("vulnPublishedDatetime", vulnPublishedDatetime).append("vulnCveId", vulnCveId).toString();
    }

}
