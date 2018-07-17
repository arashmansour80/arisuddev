package it.esc2.earlyWarning.domain;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

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
@Document(collection = "cves")
public class Cve implements Serializable {

    @Id
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
        return "Cve{" + "id=" + id + ", vulnVulnerableConfiguration=" + vulnVulnerableConfiguration + ", vulnCwe=" + vulnCwe + ", vulnLastModifiedDatetime=" + vulnLastModifiedDatetime + ", vulnVulnerableSoftwareList=" + vulnVulnerableSoftwareList + ", vulnCvss=" + vulnCvss + ", vulnReferences=" + vulnReferences + ", idCve=" + idCve + ", vulnSummary=" + vulnSummary + ", vulnPublishedDatetime=" + vulnPublishedDatetime + ", vulnCveId=" + vulnCveId + '}';
    }

}
