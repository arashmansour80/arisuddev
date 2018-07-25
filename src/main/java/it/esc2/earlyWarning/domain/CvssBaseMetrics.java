
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

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
@Document
public class CvssBaseMetrics implements Serializable
{

    @JsonProperty("cvss:confidentiality-impact")
    @Field("cvss:confidentiality-impact")
    private Object cvssConfidentialityImpact;// private CvssConfidentialityImpact cvssConfidentialityImpact;
    @JsonProperty("cvss:generated-on-datetime")
    @Field("cvss:generated-on-datetime")
    private String cvssGeneratedOnDatetime;
    @JsonProperty("cvss:integrity-impact")
    @Field("cvss:integrity-impact")
    private Object cvssIntegrityImpact;// private CvssIntegrityImpact cvssIntegrityImpact;
    @JsonProperty("cvss:source")
    @Field("cvss:source")
    private String cvssSource;
    @JsonProperty("cvss:score")
    @Field("cvss:score")
    private int cvssScore;
    @JsonProperty("cvss:authentication")
    @Field("cvss:authentication")
    private Object cvssAuthentication; //private CvssAuthentication cvssAuthentication;
    @JsonProperty("cvss:availability-impact")
    @Field("cvss:availability-impact")
    private Object cvssAvailabilityImpact; // private CvssAvailabilityImpact cvssAvailabilityImpact;
    @JsonProperty("cvss:access-vector")
    @Field("cvss:access-vector")
    private Object cvssAccessVector; // private CvssAccessVector cvssAccessVector;
    @JsonProperty("cvss:access-complexity")
    @Field("cvss:access-complexity")
    private Object cvssAccessComplexity;// private CvssAccessComplexity cvssAccessComplexity;
    private final static long serialVersionUID = 5963248154691982493L;

   /* @JsonProperty("cvss:confidentiality-impact")
    public CvssConfidentialityImpact getCvssConfidentialityImpact() {
        return cvssConfidentialityImpact;
    }

    @JsonProperty("cvss:confidentiality-impact")
    public void setCvssConfidentialityImpact(CvssConfidentialityImpact cvssConfidentialityImpact) {
        this.cvssConfidentialityImpact = cvssConfidentialityImpact;
    }*/
    
    ///modified to Object
    @JsonProperty("cvss:confidentiality-impact")
    public Object getCvssConfidentialityImpact() {
        return cvssConfidentialityImpact;
    }
    @JsonProperty("cvss:confidentiality-impact")
    public void setCvssConfidentialityImpact(Object cvssConfidentialityImpact) {
        this.cvssConfidentialityImpact = cvssConfidentialityImpact;
    }    
    ///
    @JsonProperty("cvss:generated-on-datetime")
    public String getCvssGeneratedOnDatetime() {
        return cvssGeneratedOnDatetime;
    }

    @JsonProperty("cvss:generated-on-datetime")
    public void setCvssGeneratedOnDatetime(String cvssGeneratedOnDatetime) {
        this.cvssGeneratedOnDatetime = cvssGeneratedOnDatetime;
    }

    /*@JsonProperty("cvss:integrity-impact")
    public CvssIntegrityImpact getCvssIntegrityImpact() {
        return cvssIntegrityImpact;
    }

    @JsonProperty("cvss:integrity-impact")
    public void setCvssIntegrityImpact(CvssIntegrityImpact cvssIntegrityImpact) {
        this.cvssIntegrityImpact = cvssIntegrityImpact;
    }*/
    //modified to Object
    @JsonProperty("cvss:integrity-impact")
    public Object getCvssIntegrityImpact() {
        return cvssIntegrityImpact;
    }
    @JsonProperty("cvss:integrity-impact")
    public void setCvssIntegrityImpact(Object cvssIntegrityImpact) {
        this.cvssIntegrityImpact = cvssIntegrityImpact;
    }        
    //

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

   /* @JsonProperty("cvss:authentication")
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
    }*/
    
    //modified to Object
    @JsonProperty("cvss:authentication")
    public Object getCvssAuthentication() {
        return cvssAuthentication;
    }
    @JsonProperty("cvss:authentication")
    public void setCvssAuthentication(Object cvssAuthentication) {
        this.cvssAuthentication = cvssAuthentication;
    }
    @JsonProperty("cvss:availability-impact")
    public Object getCvssAvailabilityImpact() {
        return cvssAvailabilityImpact;
    }
    @JsonProperty("cvss:availability-impact")
    public void setCvssAvailabilityImpact(Object cvssAvailabilityImpact) {
        this.cvssAvailabilityImpact = cvssAvailabilityImpact;
    }
    @JsonProperty("cvss:access-vector")
    public Object getCvssAccessVector() {
        return cvssAccessVector;
    }
    @JsonProperty("cvss:access-vector")
    public void setCvssAccessVector(Object cvssAccessVector) {
        this.cvssAccessVector = cvssAccessVector;
    }
    @JsonProperty("cvss:access-complexity")
    public Object getCvssAccessComplexity() {
        return cvssAccessComplexity;
    }
    @JsonProperty("cvss:access-complexity")
    public void setCvssAccessComplexity(Object cvssAccessComplexity) {
        this.cvssAccessComplexity = cvssAccessComplexity;
    }
    

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("cvssConfidentialityImpact", cvssConfidentialityImpact).append("cvssGeneratedOnDatetime", cvssGeneratedOnDatetime).append("cvssIntegrityImpact", cvssIntegrityImpact).append("cvssSource", cvssSource).append("cvssScore", cvssScore).append("cvssAuthentication", cvssAuthentication).append("cvssAvailabilityImpact", cvssAvailabilityImpact).append("cvssAccessVector", cvssAccessVector).append("cvssAccessComplexity", cvssAccessComplexity).toString();
    }

}
