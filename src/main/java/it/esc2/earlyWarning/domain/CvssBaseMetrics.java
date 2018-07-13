/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.domain;

import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author a.mansour
 */
public class CvssBaseMetrics {

    @Field("cvss:confidentiality-impact")
    private String confidentialityImpact;

    @Field("cvss:generated-on-datetime")
    private String generatedOnDatetime;

    @Field("cvss:integrity-impact")
    private String integrityImpact;

    @Field("cvss:source")
    private String source;

    @Field("cvss:score")
    private Double score;

    @Field("cvss:authentication")
    private String authentication;

    @Field("cvss:availability-impact")
    private String availabilityImpact;

    @Field("cvss:access-vector")
    private String accessVector;

    @Field("cvss:access-complexity")
    private String accessComplexity;

    public String getConfidentialityImpact() {
        return confidentialityImpact;
    }

    public void setConfidentialityImpact(String confidentialityImpact) {
        this.confidentialityImpact = confidentialityImpact;
    }

    public String getGeneratedOnDatetime() {
        return generatedOnDatetime;
    }

    public void setGeneratedOnDatetime(String generatedOnDatetime) {
        this.generatedOnDatetime = generatedOnDatetime;
    }

    public String getIntegrityImpact() {
        return integrityImpact;
    }

    public void setIntegrityImpact(String integrityImpact) {
        this.integrityImpact = integrityImpact;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public Double getScore() {
        return score;
    }

    public void setScore(Double score) {
        this.score = score;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }

    public String getAvailabilityImpact() {
        return availabilityImpact;
    }

    public void setAvailabilityImpact(String availabilityImpact) {
        this.availabilityImpact = availabilityImpact;
    }

    public String getAccessVector() {
        return accessVector;
    }

    public void setAccessVector(String accessVector) {
        this.accessVector = accessVector;
    }

    public String getAccessComplexity() {
        return accessComplexity;
    }

    public void setAccessComplexity(String accessComplexity) {
        this.accessComplexity = accessComplexity;
    }

    @Override
    public String toString() {
        return "CvssBaseMetrics{" + "confidentialityImpact=" + confidentialityImpact + ", generatedOnDatetime=" + generatedOnDatetime + ", integrityImpact=" + integrityImpact + ", source=" + source + ", score=" + score + ", authentication=" + authentication + ", availabilityImpact=" + availabilityImpact + ", accessVector=" + accessVector + ", accessComplexity=" + accessComplexity + '}';
    }

}
