package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;
import org.springframework.data.mongodb.core.mapping.Document;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "cve",
    "configurations",
    "impact",
    "publishedDate",
    "lastModifiedDate"
})

@Document(collection = "cves")
public class Nvd implements Serializable {

    @JsonProperty("_id")
    private String id;
    @JsonProperty("cve")
    private Cve cve;
    @JsonProperty("configurations")
    private Configurations configurations;
    @JsonProperty("impact")
    private Impact impact;
    @JsonProperty("publishedDate")
    private String publishedDate;
    @JsonProperty("lastModifiedDate")
    private String lastModifiedDate;
    private final static long serialVersionUID = 946378582360095094L;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("cve")
    public Cve getCve() {
        return cve;
    }

    @JsonProperty("cve")
    public void setCve(Cve cve) {
        this.cve = cve;
    }

    @JsonProperty("configurations")
    public Configurations getConfigurations() {
        return configurations;
    }

    @JsonProperty("configurations")
    public void setConfigurations(Configurations configurations) {
        this.configurations = configurations;
    }

    @JsonProperty("impact")
    public Impact getImpact() {
        return impact;
    }

    @JsonProperty("impact")
    public void setImpact(Impact impact) {
        this.impact = impact;
    }

    @JsonProperty("publishedDate")
    public String getPublishedDate() {
        return publishedDate;
    }

    @JsonProperty("publishedDate")
    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @JsonProperty("lastModifiedDate")
    public String getLastModifiedDate() {
        return lastModifiedDate;
    }

    @JsonProperty("lastModifiedDate")
    public void setLastModifiedDate(String lastModifiedDate) {
        this.lastModifiedDate = lastModifiedDate;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("id", id).append("cve", cve).append("configurations", configurations).append("impact", impact).append("publishedDate", publishedDate).append("lastModifiedDate", lastModifiedDate).toString();
    }

}
