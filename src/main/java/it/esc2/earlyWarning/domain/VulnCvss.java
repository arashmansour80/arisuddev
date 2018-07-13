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
public class VulnCvss {

    @Field("cvss:base_metrics")
    private CvssBaseMetrics cvssBaseMetrics;

    public CvssBaseMetrics getCvssBaseMetrics() {
        return cvssBaseMetrics;
    }

    public void setCvssBaseMetrics(CvssBaseMetrics cvssBaseMetrics) {
        this.cvssBaseMetrics = cvssBaseMetrics;
    }

    @Override
    public String toString() {
        return "VulnCvss{" + "cvssBaseMetrics=" + cvssBaseMetrics + '}';
    }

}
