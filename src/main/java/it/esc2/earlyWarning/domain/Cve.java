
package it.esc2.earlyWarning.domain;

import java.io.Serializable;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import org.apache.commons.lang.builder.ToStringBuilder;

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "data_type",
    "data_format",
    "data_version",
    "CVE_data_meta",
    "affects",
    "problemtype",
    "references",
    "description"
})
public class Cve implements Serializable
{

    @JsonProperty("data_type")
    private String dataType;
    @JsonProperty("data_format")
    private String dataFormat;
    @JsonProperty("data_version")
    private String dataVersion;
    @JsonProperty("CVE_data_meta")
    private CVEDataMeta cVEDataMeta;
    @JsonProperty("affects")
    private Affects affects;
    @JsonProperty("problemtype")
    private Problemtype problemtype;
    @JsonProperty("references")
    private References references;
    @JsonProperty("description")
    private Description_ description;
    private final static long serialVersionUID = -5221824655565899898L;

    @JsonProperty("data_type")
    public String getDataType() {
        return dataType;
    }

    @JsonProperty("data_type")
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    @JsonProperty("data_format")
    public String getDataFormat() {
        return dataFormat;
    }

    @JsonProperty("data_format")
    public void setDataFormat(String dataFormat) {
        this.dataFormat = dataFormat;
    }

    @JsonProperty("data_version")
    public String getDataVersion() {
        return dataVersion;
    }

    @JsonProperty("data_version")
    public void setDataVersion(String dataVersion) {
        this.dataVersion = dataVersion;
    }

    @JsonProperty("CVE_data_meta")
    public CVEDataMeta getCVEDataMeta() {
        return cVEDataMeta;
    }

    @JsonProperty("CVE_data_meta")
    public void setCVEDataMeta(CVEDataMeta cVEDataMeta) {
        this.cVEDataMeta = cVEDataMeta;
    }

    @JsonProperty("affects")
    public Affects getAffects() {
        return affects;
    }

    @JsonProperty("affects")
    public void setAffects(Affects affects) {
        this.affects = affects;
    }

    @JsonProperty("problemtype")
    public Problemtype getProblemtype() {
        return problemtype;
    }

    @JsonProperty("problemtype")
    public void setProblemtype(Problemtype problemtype) {
        this.problemtype = problemtype;
    }

    @JsonProperty("references")
    public References getReferences() {
        return references;
    }

    @JsonProperty("references")
    public void setReferences(References references) {
        this.references = references;
    }

    @JsonProperty("description")
    public Description_ getDescription() {
        return description;
    }

    @JsonProperty("description")
    public void setDescription(Description_ description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this).append("dataType", dataType).append("dataFormat", dataFormat).append("dataVersion", dataVersion).append("cVEDataMeta", cVEDataMeta).append("affects", affects).append("problemtype", problemtype).append("references", references).append("description", description).toString();
    }

}
