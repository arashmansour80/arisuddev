
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import java.util.List;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import com.querydsl.core.annotations.QueryEntity;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
@Document(collection = "cve")
public class Cve implements Serializable
{
    @Id
    @JsonProperty("_id")
    @Field("_id")
    private String id;
    @JsonProperty("vuln:cwe")
    @Field("vuln:cwe")    
    private Object vulnCwe;//private VulnCwe vulnCwe;
    @JsonProperty("vuln:security-protection")
    @Field("vuln:security-protection")
    private String vulnSecurityProtection;
    @JsonProperty("vuln:vulnerable-software-list")
    @Field("vuln:vulnerable-software-list")    
    private VulnVulnerableSoftwareList vulnVulnerableSoftwareList;
    @JsonProperty("vuln:cvss")
    @Field("vuln:cvss")
    private VulnCvss vulnCvss;
    @JsonProperty("vuln:published-datetime")
    @Field("vuln:published-datetime")
    private String vulnPublishedDatetime;
    @JsonProperty("vuln:cve-id")
    @Field("vuln:cve-id")
    private String vulnCveId;
    @JsonProperty("vuln:vulnerable-configuration")
    @Field("vuln:vulnerable-configuration")
    private Object vulnVulnerableConfiguration;//private VulnVulnerableConfiguration vulnVulnerableConfiguration;
    @JsonProperty("vuln:discovered-datetime")
    @Field("vuln:discovered-datetime")
    private String vulnDiscoveredDatetime;
    @JsonProperty("vuln:last-modified-datetime")
    @Field("vuln:last-modified-datetime")
    private String vulnLastModifiedDatetime;
    @JsonProperty("vuln:scanner")
    @Field("vuln:scanner")
    private Object vulnScanner;// private VulnScanner vulnScanner;
    @JsonProperty("vuln:assessment_check")
    @Field("vuln:assessment_check")
    private Object vulnAssessmentCheck;//private VulnAssessmentCheck vulnAssessmentCheck;
    @JsonProperty("vuln:references")
    @Field("vuln:references")
    private Object vulnReferences; // private List<VulnReference> vulnReferences = null;
    @Indexed
    @Field("id")
    @JsonProperty("id")
    private String idCve;
    @JsonProperty("vuln:summary")
    @Field("vuln:summary")
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

  /*@JsonProperty("vuln:cwe")
    public VulnCwe getVulnCwe() {
        return vulnCwe;
    }

    @JsonProperty("vuln:cwe")
    public void setVulnCwe(VulnCwe vulnCwe) {
        this.vulnCwe = vulnCwe;
    }*/
    
    //modified to Object
    @JsonProperty("vuln:cwe")
    public Object getVulnCwe() {
        return vulnCwe;
    }
    @JsonProperty("vuln:cwe")
    public void setVulnCwe(Object vulnCwe) {
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

    /*@JsonProperty("vuln:vulnerable-configuration")
    public VulnVulnerableConfiguration getVulnVulnerableConfiguration() {
        return vulnVulnerableConfiguration;
    }

    @JsonProperty("vuln:vulnerable-configuration")
    public void setVulnVulnerableConfiguration(VulnVulnerableConfiguration vulnVulnerableConfiguration) {
        this.vulnVulnerableConfiguration = vulnVulnerableConfiguration;
    }*/    
    
    // modified to Object
    @JsonProperty("vuln:vulnerable-configuration")
    public Object getVulnVulnerableConfiguration() {
        return vulnVulnerableConfiguration;
    }

    @JsonProperty("vuln:vulnerable-configuration")
    public void setVulnVulnerableConfiguration(Object vulnVulnerableConfiguration) {
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

    /*@JsonProperty("vuln:scanner")
    public VulnScanner getVulnScanner() {
        return vulnScanner;
    }

    @JsonProperty("vuln:scanner")
    public void setVulnScanner(VulnScanner vulnScanner) {
        this.vulnScanner = vulnScanner;
    }*/

    // modified to Object
    @JsonProperty("vuln:scanner")
    public Object getVulnScanner() {
        return vulnScanner;
    }
    @JsonProperty("vuln:scanner")
    public void setVulnScanner(Object vulnScanner) {
        this.vulnScanner = vulnScanner;
    }
    
    

    /*@JsonProperty("vuln:assessment_check")
    public VulnAssessmentCheck getVulnAssessmentCheck() {
        return vulnAssessmentCheck;
    }

    @JsonProperty("vuln:assessment_check")
    public void setVulnAssessmentCheck(VulnAssessmentCheck vulnAssessmentCheck) {
        this.vulnAssessmentCheck = vulnAssessmentCheck;
    }*/
    // modified to Object
    @JsonProperty("vuln:assessment_check")
    public Object getVulnAssessmentCheck() {
        return vulnAssessmentCheck;
    }
    
    @JsonProperty("vuln:assessment_check")
    public void setVulnAssessmentCheck(Object vulnAssessmentCheck) {
        this.vulnAssessmentCheck = vulnAssessmentCheck;
    }
    
    /*@JsonProperty("vuln:references")
    public List<VulnReference> getVulnReferences() {
        return vulnReferences;
    }

    @JsonProperty("vuln:references")
    public void setVulnReferences(List<VulnReference> vulnReferences) {
        this.vulnReferences = vulnReferences;
    }*/
    
    //modified to Object
    @JsonProperty("vuln:references")
    public Object getVulnReferences() {
        return vulnReferences;
    }
    @JsonProperty("vuln:references")
    public void setVulnReferences(Object vulnReferences) {
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
