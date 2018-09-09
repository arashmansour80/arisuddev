/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.dto;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import it.esc2.earlyWarning.domain.Check;
import it.esc2.earlyWarning.domain.Cpe23Cpe23Item;
import it.esc2.earlyWarning.domain.Notes;
import it.esc2.earlyWarning.domain.References;
import it.esc2.earlyWarning.domain.Title;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author a.mansour
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "notes",
    "references",
    "deprecation_date",
    "deprecated",
    "name",
    "cpe-23:cpe23-item",
    "check",
    "title"
})
@Document(collection = "cpe")
public class CpeDTO implements Serializable {

    private final static long serialVersionUID = -7342632403321724494L;

    @JsonProperty("_id")
    @Field("_id")
    private String id;
    @JsonProperty("notes")
    private Notes notes;
    @JsonProperty("references")
    private References references;
    @JsonProperty("deprecation_date")
    @Field("deprecation_date")
    private String deprecationDate;
    @JsonProperty("deprecated")
    private boolean deprecated;
    @JsonProperty("name")
    private String name;
    @JsonProperty("cpe-23:cpe23-item")
    @Field("cpe-23:cpe23-item")
    private Cpe23Cpe23Item cpe23Cpe23Item;
    @JsonProperty("check")
    private Check check;
    @JsonProperty("title")
    private Title title;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("notes")
    public Notes getNotes() {
        return notes;
    }

    @JsonProperty("notes")
    public void setNotes(Notes notes) {
        this.notes = notes;
    }

    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    @JsonProperty("deprecation_date")
    public String getDeprecationDate() {
        return deprecationDate;
    }

    @JsonProperty("deprecation_date")
    public void setDeprecationDate(String deprecationDate) {
        this.deprecationDate = deprecationDate;
    }

    @JsonProperty("deprecated")
    public boolean isDeprecated() {
        return deprecated;
    }

    @JsonProperty("deprecated")
    public void setDeprecated(boolean deprecated) {
        this.deprecated = deprecated;
    }

    @JsonProperty("name")
    public String getName() {
        return name;
    }

    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    @JsonProperty("cpe-23:cpe23-item")
    public Cpe23Cpe23Item getCpe23Cpe23Item() {
        return cpe23Cpe23Item;
    }

    @JsonProperty("cpe-23:cpe23-item")
    public void setCpe23Cpe23Item(Cpe23Cpe23Item cpe23Cpe23Item) {
        this.cpe23Cpe23Item = cpe23Cpe23Item;
    }

    @JsonProperty("check")
    public Check getCheck() {
        return check;
    }

    @JsonProperty("check")
    public void setCheck(Check check) {
        this.check = check;
    }

    @JsonProperty("title")
    public Title getTitle() {
        return title;
    }

    @JsonProperty("title")
    public void setTitle(Title title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("notes", notes).append("references", references).append("deprecationDate", deprecationDate).append("deprecated", deprecated).append("name", name).append("cpe23Cpe23Item", cpe23Cpe23Item).append("check", check).append("title", title).toString();
    }

}
