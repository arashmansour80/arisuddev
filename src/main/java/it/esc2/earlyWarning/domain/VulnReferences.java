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
public class VulnReferences {

    @Field("vuln:reference")
    private VulnReference reference;

    @Field("vuln:source")
    private String source;

    @Field("xml:lang")
    private String xmlLang;

    @Field("reference_type")
    private String referenceType;

    public VulnReference getReference() {
        return reference;
    }

    public void setReference(VulnReference reference) {
        this.reference = reference;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public String getXmlLang() {
        return xmlLang;
    }

    public void setXmlLang(String xmlLang) {
        this.xmlLang = xmlLang;
    }

    public String getReferenceType() {
        return referenceType;
    }

    public void setReferenceType(String referenceType) {
        this.referenceType = referenceType;
    }

    @Override
    public String toString() {
        return "VulnReferences{" + "reference=" + reference + ", source=" + source + ", xmlLang=" + xmlLang + ", referenceType=" + referenceType + '}';
    }

}
