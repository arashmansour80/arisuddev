
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cvssV2",
    "severity",
    "exploitabilityScore",
    "impactScore",
    "obtainAllPrivilege",
    "obtainUserPrivilege",
    "obtainOtherPrivilege",
    "userInteractionRequired"
})
public class BaseMetricV2 implements Serializable
{

    @JsonProperty("cvssV2")
    private CvssV2 cvssV2;
    @JsonProperty("severity")
    private String severity;
    @JsonProperty("exploitabilityScore")
    private double exploitabilityScore;
    @JsonProperty("impactScore")
    private double impactScore;
    @JsonProperty("obtainAllPrivilege")
    private boolean obtainAllPrivilege;
    @JsonProperty("obtainUserPrivilege")
    private boolean obtainUserPrivilege;
    @JsonProperty("obtainOtherPrivilege")
    private boolean obtainOtherPrivilege;
    @JsonProperty("userInteractionRequired")
    private boolean userInteractionRequired;
    private final static long serialVersionUID = 7532603941072729119L;

    @JsonProperty("cvssV2")
    public CvssV2 getCvssV2() {
        return cvssV2;
    }

    @JsonProperty("cvssV2")
    public void setCvssV2(CvssV2 cvssV2) {
        this.cvssV2 = cvssV2;
    }

    @JsonProperty("severity")
    public String getSeverity() {
        return severity;
    }

    @JsonProperty("severity")
    public void setSeverity(String severity) {
        this.severity = severity;
    }

    @JsonProperty("exploitabilityScore")
    public double getExploitabilityScore() {
        return exploitabilityScore;
    }

    @JsonProperty("exploitabilityScore")
    public void setExploitabilityScore(double exploitabilityScore) {
        this.exploitabilityScore = exploitabilityScore;
    }

    @JsonProperty("impactScore")
    public double getImpactScore() {
        return impactScore;
    }

    @JsonProperty("impactScore")
    public void setImpactScore(double impactScore) {
        this.impactScore = impactScore;
    }

    @JsonProperty("obtainAllPrivilege")
    public boolean isObtainAllPrivilege() {
        return obtainAllPrivilege;
    }

    @JsonProperty("obtainAllPrivilege")
    public void setObtainAllPrivilege(boolean obtainAllPrivilege) {
        this.obtainAllPrivilege = obtainAllPrivilege;
    }

    @JsonProperty("obtainUserPrivilege")
    public boolean isObtainUserPrivilege() {
        return obtainUserPrivilege;
    }

    @JsonProperty("obtainUserPrivilege")
    public void setObtainUserPrivilege(boolean obtainUserPrivilege) {
        this.obtainUserPrivilege = obtainUserPrivilege;
    }

    @JsonProperty("obtainOtherPrivilege")
    public boolean isObtainOtherPrivilege() {
        return obtainOtherPrivilege;
    }

    @JsonProperty("obtainOtherPrivilege")
    public void setObtainOtherPrivilege(boolean obtainOtherPrivilege) {
        this.obtainOtherPrivilege = obtainOtherPrivilege;
    }

    @JsonProperty("userInteractionRequired")
    public boolean isUserInteractionRequired() {
        return userInteractionRequired;
    }

    @JsonProperty("userInteractionRequired")
    public void setUserInteractionRequired(boolean userInteractionRequired) {
        this.userInteractionRequired = userInteractionRequired;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cvssV2", cvssV2).append("severity", severity).append("exploitabilityScore", exploitabilityScore).append("impactScore", impactScore).append("obtainAllPrivilege", obtainAllPrivilege).append("obtainUserPrivilege", obtainUserPrivilege).append("obtainOtherPrivilege", obtainOtherPrivilege).append("userInteractionRequired", userInteractionRequired).toString();
    }

}
