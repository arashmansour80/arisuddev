
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "version",
    "vectorString",
    "accessVector",
    "accessComplexity",
    "authentication",
    "confidentialityImpact",
    "integrityImpact",
    "availabilityImpact",
    "baseScore"
})
public class CvssV2 implements Serializable
{

    @JsonProperty("version")
    private String version;
    @JsonProperty("vectorString")
    private String vectorString;
    @JsonProperty("accessVector")
    private String accessVector;
    @JsonProperty("accessComplexity")
    private String accessComplexity;
    @JsonProperty("authentication")
    private String authentication;
    @JsonProperty("confidentialityImpact")
    private String confidentialityImpact;
    @JsonProperty("integrityImpact")
    private String integrityImpact;
    @JsonProperty("availabilityImpact")
    private String availabilityImpact;
    @JsonProperty("baseScore")
    private double baseScore;
    private final static long serialVersionUID = 8753331359728771665L;

    @JsonProperty("version")
    public String getVersion() {
        return version;
    }

    @JsonProperty("version")
    public void setVersion(String version) {
        this.version = version;
    }

    @JsonProperty("vectorString")
    public String getVectorString() {
        return vectorString;
    }

    @JsonProperty("vectorString")
    public void setVectorString(String vectorString) {
        this.vectorString = vectorString;
    }

    @JsonProperty("accessVector")
    public String getAccessVector() {
        return accessVector;
    }

    @JsonProperty("accessVector")
    public void setAccessVector(String accessVector) {
        this.accessVector = accessVector;
    }

    @JsonProperty("accessComplexity")
    public String getAccessComplexity() {
        return accessComplexity;
    }

    @JsonProperty("accessComplexity")
    public void setAccessComplexity(String accessComplexity) {
        this.accessComplexity = accessComplexity;
    }

    @JsonProperty("authentication")
    public String getAuthentication() {
        return authentication;
    }

    @JsonProperty("authentication")
    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    @JsonProperty("confidentialityImpact")
    public String getConfidentialityImpact() {
        return confidentialityImpact;
    }

    @JsonProperty("confidentialityImpact")
    public void setConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    @JsonProperty("integrityImpact")
    public String getIntegrityImpact() {
        return integrityImpact;
    }

    @JsonProperty("integrityImpact")
    public void setIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    @JsonProperty("availabilityImpact")
    public String getAvailabilityImpact() {
        return availabilityImpact;
    }

    @JsonProperty("availabilityImpact")
    public void setAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    @JsonProperty("baseScore")
    public double getBaseScore() {
        return baseScore;
    }

    @JsonProperty("baseScore")
    public void setBaseScore(double baseScore) {
        this.baseScore = baseScore;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("version", version).append("vectorString", vectorString).append("accessVector", accessVector).append("accessComplexity", accessComplexity).append("authentication", authentication).append("confidentialityImpact", confidentialityImpact).append("integrityImpact", integrityImpact).append("availabilityImpact", availabilityImpact).append("baseScore", baseScore).toString();
    }

}
