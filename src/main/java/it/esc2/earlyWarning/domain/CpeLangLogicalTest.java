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
public class CpeLangLogicalTest {

    @Field("cpe-lang:fact-ref")
    private Object factRef;

    @Field("cpe-lang:logical-test")
    private Object logicalTest;

    @Field("negate")
    private Boolean negate;

    @Field("operator")
    private String operator;

    public Boolean getNegate() {
        return negate;
    }

    public void setNegate(Boolean negate) {
        this.negate = negate;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getOperator() {
        return operator;
    }

    public Object getFactRef() {
        return factRef;
    }

    public void setFactRef(Object factRef) {
        this.factRef = factRef;
    }

    public Object getLogicalTest() {
        return logicalTest;
    }

    public void setLogicalTest(Object logicalTest) {
        this.logicalTest = logicalTest;
    }

    @Override
    public String toString() {
        return "CpeLangLogicalTest{" + "factRef=" + factRef + ", logicalTest=" + logicalTest + ", negate=" + negate + ", operator=" + operator + '}';
    }

}
