/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.domain;

import java.util.ArrayList;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author a.mansour
 */
@Document(collection = "cves")

public class Cve {

    @Id
    private String id;

    @Field("vuln:vulnerable-configuration")
    private Object configuration;

    @Field("vuln:cwe")
    private Object cwe;

    @Field("vuln:last-modified-datetime")
    private String lastModifiedDate;

    @Field("vuln:vulnerable-software-list")
    private VulnVulnerableSoftwareList softwareList;

    @Field("vuln:cvss")
    private VulnCvss cvss;

    @Field("vuln:references")
    private ArrayList<VulnReferences> references;

    @Field("id")
    private String idCve;

    @Field("vuln:summary")
    private String summary;

    @Field("vuln:published-datetime")
    private String publishedDate;

    @Field("vuln:cve-id")
    private String cveId;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getIdCve() {
        return idCve;
    }

    public void setIdCve(String idCve) {
        this.idCve = idCve;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public Object getCwe() {
        return cwe;
    }

    public void setCwe(Object cwe) {
        this.cwe = cwe;
    }

    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    public VulnVulnerableSoftwareList getSoftwareList() {
        return softwareList;
    }

    public void setSoftwareList(VulnVulnerableSoftwareList softwareList) {
        this.softwareList = softwareList;
    }

    public Object getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Object configuration) {
        this.configuration = configuration;
    }

    public VulnCvss getCvss() {
        return cvss;
    }

    public void setCvss(VulnCvss cvss) {
        this.cvss = cvss;
    }

    public ArrayList<VulnReferences> getReferences() {
        return references;
    }

    public void setReferences(ArrayList<VulnReferences> references) {
        this.references = references;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getCveId() {
        return cveId;
    }

    public void setCveId(String cveId) {
        this.cveId = cveId;
    }

    @Override
    public String toString() {
        return "Cve{" + "id=" + id + ", configuration=" + configuration + ", cwe=" + cwe + ", lastModifiedDate=" + lastModifiedDate + ", softwareList=" + softwareList + ", cvss=" + cvss + ", references=" + references + ", idCve=" + idCve + ", summary=" + summary + ", publishedDate=" + publishedDate + ", cveId=" + cveId + '}';
    }

}
