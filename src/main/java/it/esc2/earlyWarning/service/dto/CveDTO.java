
package it.esc2.earlyWarning.service.dto;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import it.esc2.earlyWarning.domain.VulnAssessmentCheck;
import it.esc2.earlyWarning.domain.VulnCvss;
import it.esc2.earlyWarning.domain.VulnCwe;
import it.esc2.earlyWarning.domain.VulnReference;
import it.esc2.earlyWarning.domain.VulnScanner;
import it.esc2.earlyWarning.domain.VulnVulnerableConfiguration;
import it.esc2.earlyWarning.domain.VulnVulnerableSoftwareList;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "vuln:cwe",
    "vuln:security-protection",
    "vuln:vulnerable-software-list",
    "vuln:cvss",
    "vuln:published-datetime",
    "vuln:cve-id",
    "vuln:vulnerable-configuration",
    "vuln:discovered-datetime",
    "vuln:last-modified-datetime",
    "vuln:scanner",
    "vuln:assessment_check",
    "vuln:references",
    "idCve",
    "vuln:summary"
})
public class CveDTO implements Serializable
{

    @JsonProperty("_id")
    private String id;
    @JsonProperty("vuln:cwe")
    private VulnCwe vulnCwe;
    @JsonProperty("vuln:security-protection")
    private String vulnSecurityProtection;
    @JsonProperty("vuln:vulnerable-software-list")
    private VulnVulnerableSoftwareList vulnVulnerableSoftwareList;
    @JsonProperty("vuln:cvss")
    private VulnCvss vulnCvss;
    @JsonProperty("vuln:published-datetime")
    private String vulnPublishedDatetime;
    @JsonProperty("vuln:cve-id")
    private String vulnCveId;
    @JsonProperty("vuln:vulnerable-configuration")
    private VulnVulnerableConfiguration vulnVulnerableConfiguration;
    @JsonProperty("vuln:discovered-datetime")
    private String vulnDiscoveredDatetime;
    @JsonProperty("vuln:last-modified-datetime")
    private String vulnLastModifiedDatetime;
    @JsonProperty("vuln:scanner")
    private VulnScanner vulnScanner;
    @JsonProperty("vuln:assessment_check")
    private VulnAssessmentCheck vulnAssessmentCheck;
    @JsonProperty("vuln:references")
    private List<VulnReference> vulnReferences = null;
    @JsonProperty("id")
    private String idCve;
    @JsonProperty("vuln:summary")
    private String vulnSummary;
    private final static long serialVersionUID = -4821914490890046737L;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("vuln:cwe")
    public VulnCwe getVulnCwe() {
        return vulnCwe;
    }

    @JsonProperty("vuln:cwe")
    public void setVulnCwe(VulnCwe vulnCwe) {
        this.vulnCwe = vulnCwe;
    }

    @JsonProperty("vuln:security-protection")
    public String getVulnSecurityProtection() {
        return vulnSecurityProtection;
    }

    @JsonProperty("vuln:security-protection")
    public void setVulnSecurityProtection(String vulnSecurityProtection) {
        this.vulnSecurityProtection = vulnSecurityProtection;
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

    @JsonProperty("vuln:vulnerable-configuration")
    public VulnVulnerableConfiguration getVulnVulnerableConfiguration() {
        return vulnVulnerableConfiguration;
    }

    @JsonProperty("vuln:vulnerable-configuration")
    public void setVulnVulnerableConfiguration(VulnVulnerableConfiguration vulnVulnerableConfiguration) {
        this.vulnVulnerableConfiguration = vulnVulnerableConfiguration;
    }

    @JsonProperty("vuln:discovered-datetime")
    public String getVulnDiscoveredDatetime() {
        return vulnDiscoveredDatetime;
    }

    @JsonProperty("vuln:discovered-datetime")
    public void setVulnDiscoveredDatetime(String vulnDiscoveredDatetime) {
        this.vulnDiscoveredDatetime = vulnDiscoveredDatetime;
    }

    @JsonProperty("vuln:last-modified-datetime")
    public String getVulnLastModifiedDatetime() {
        return vulnLastModifiedDatetime;
    }

    @JsonProperty("vuln:last-modified-datetime")
    public void setVulnLastModifiedDatetime(String vulnLastModifiedDatetime) {
        this.vulnLastModifiedDatetime = vulnLastModifiedDatetime;
    }

    @JsonProperty("vuln:scanner")
    public VulnScanner getVulnScanner() {
        return vulnScanner;
    }

    @JsonProperty("vuln:scanner")
    public void setVulnScanner(VulnScanner vulnScanner) {
        this.vulnScanner = vulnScanner;
    }

    @JsonProperty("vuln:assessment_check")
    public VulnAssessmentCheck getVulnAssessmentCheck() {
        return vulnAssessmentCheck;
    }

    @JsonProperty("vuln:assessment_check")
    public void setVulnAssessmentCheck(VulnAssessmentCheck vulnAssessmentCheck) {
        this.vulnAssessmentCheck = vulnAssessmentCheck;
    }

    @JsonProperty("vuln:references")
    public List<VulnReference> getVulnReferences() {
        return vulnReferences;
    }

    @JsonProperty("vuln:references")
    public void setVulnReferences(List<VulnReference> vulnReferences) {
        this.vulnReferences = vulnReferences;
    }

    @JsonProperty("id")
    public String getIdCve() {
        return idCve;
    }

    @JsonProperty("id")
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

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("vulnCwe", vulnCwe).append("vulnSecurityProtection", vulnSecurityProtection).append("vulnVulnerableSoftwareList", vulnVulnerableSoftwareList).append("vulnCvss", vulnCvss).append("vulnPublishedDatetime", vulnPublishedDatetime).append("vulnCveId", vulnCveId).append("vulnVulnerableConfiguration", vulnVulnerableConfiguration).append("vulnDiscoveredDatetime", vulnDiscoveredDatetime).append("vulnLastModifiedDatetime", vulnLastModifiedDatetime).append("vulnScanner", vulnScanner).append("vulnAssessmentCheck", vulnAssessmentCheck).append("vulnReferences", vulnReferences).append("idCve", idCve).append("vulnSummary", vulnSummary).toString();
    }

}
