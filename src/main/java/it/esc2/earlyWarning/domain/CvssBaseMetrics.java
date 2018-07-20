
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "cvss:confidentiality-impact",
    "cvss:generated-on-datetime",
    "cvss:integrity-impact",
    "cvss:source",
    "cvss:score",
    "cvss:authentication",
    "cvss:availability-impact",
    "cvss:access-vector",
    "cvss:access-complexity"
})
public class CvssBaseMetrics implements Serializable
{

    @JsonProperty("cvss:confidentiality-impact")
    private CvssConfidentialityImpact cvssConfidentialityImpact;
    @JsonProperty("cvss:generated-on-datetime")
    private String cvssGeneratedOnDatetime;
    @JsonProperty("cvss:integrity-impact")
    private CvssIntegrityImpact cvssIntegrityImpact;
    @JsonProperty("cvss:source")
    private String cvssSource;
    @JsonProperty("cvss:score")
    private int cvssScore;
    @JsonProperty("cvss:authentication")
    private CvssAuthentication cvssAuthentication;
    @JsonProperty("cvss:availability-impact")
    private CvssAvailabilityImpact cvssAvailabilityImpact;
    @JsonProperty("cvss:access-vector")
    private CvssAccessVector cvssAccessVector;
    @JsonProperty("cvss:access-complexity")
    private CvssAccessComplexity cvssAccessComplexity;
    private final static long serialVersionUID = 5963248154691982493L;

    @JsonProperty("cvss:confidentiality-impact")
    public CvssConfidentialityImpact getCvssConfidentialityImpact() {
        return cvssConfidentialityImpact;
    }

    @JsonProperty("cvss:confidentiality-impact")
    public void setCvssConfidentialityImpact(CvssConfidentialityImpact cvssConfidentialityImpact) {
        this.cvssConfidentialityImpact = cvssConfidentialityImpact;
    }

    @JsonProperty("cvss:generated-on-datetime")
    public String getCvssGeneratedOnDatetime() {
        return cvssGeneratedOnDatetime;
    }

    @JsonProperty("cvss:generated-on-datetime")
    public void setCvssGeneratedOnDatetime(String cvssGeneratedOnDatetime) {
        this.cvssGeneratedOnDatetime = cvssGeneratedOnDatetime;
    }

    @JsonProperty("cvss:integrity-impact")
    public CvssIntegrityImpact getCvssIntegrityImpact() {
        return cvssIntegrityImpact;
    }

    @JsonProperty("cvss:integrity-impact")
    public void setCvssIntegrityImpact(CvssIntegrityImpact cvssIntegrityImpact) {
        this.cvssIntegrityImpact = cvssIntegrityImpact;
    }

    @JsonProperty("cvss:source")
    public String getCvssSource() {
        return cvssSource;
    }

    @JsonProperty("cvss:source")
    public void setCvssSource(String cvssSource) {
        this.cvssSource = cvssSource;
    }

    @JsonProperty("cvss:score")
    public int getCvssScore() {
        return cvssScore;
    }

    @JsonProperty("cvss:score")
    public void setCvssScore(int cvssScore) {
        this.cvssScore = cvssScore;
    }

    @JsonProperty("cvss:authentication")
    public CvssAuthentication getCvssAuthentication() {
        return cvssAuthentication;
    }

    @JsonProperty("cvss:authentication")
    public void setCvssAuthentication(CvssAuthentication cvssAuthentication) {
        this.cvssAuthentication = cvssAuthentication;
    }

    @JsonProperty("cvss:availability-impact")
    public CvssAvailabilityImpact getCvssAvailabilityImpact() {
        return cvssAvailabilityImpact;
    }

    @JsonProperty("cvss:availability-impact")
    public void setCvssAvailabilityImpact(CvssAvailabilityImpact cvssAvailabilityImpact) {
        this.cvssAvailabilityImpact = cvssAvailabilityImpact;
    }

    @JsonProperty("cvss:access-vector")
    public CvssAccessVector getCvssAccessVector() {
        return cvssAccessVector;
    }

    @JsonProperty("cvss:access-vector")
    public void setCvssAccessVector(CvssAccessVector cvssAccessVector) {
        this.cvssAccessVector = cvssAccessVector;
    }

    @JsonProperty("cvss:access-complexity")
    public CvssAccessComplexity getCvssAccessComplexity() {
        return cvssAccessComplexity;
    }

    @JsonProperty("cvss:access-complexity")
    public void setCvssAccessComplexity(CvssAccessComplexity cvssAccessComplexity) {
        this.cvssAccessComplexity = cvssAccessComplexity;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cvssConfidentialityImpact", cvssConfidentialityImpact).append("cvssGeneratedOnDatetime", cvssGeneratedOnDatetime).append("cvssIntegrityImpact", cvssIntegrityImpact).append("cvssSource", cvssSource).append("cvssScore", cvssScore).append("cvssAuthentication", cvssAuthentication).append("cvssAvailabilityImpact", cvssAvailabilityImpact).append("cvssAccessVector", cvssAccessVector).append("cvssAccessComplexity", cvssAccessComplexity).toString();
    }

}
