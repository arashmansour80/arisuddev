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
public class VulnVulnerableConfiguration {

    @Field("id")
    private String id;

    @Field("cpe-lang:logical-test")
    private Object logicalTest;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Object getLogicalTest() {
        return logicalTest;
    }

    public void setLogicalTest(Object logicalTest) {
        this.logicalTest = logicalTest;
    }

    @Override
    public String toString() {
        return "VulnVulnerableConfiguration{" + "id=" + id + ", logicalTest=" + logicalTest + '}';
    }


}
