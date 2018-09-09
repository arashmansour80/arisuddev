/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.esc2.earlyWarning.service.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;
import java.io.Serializable;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

/**
 *
 * @author a.mansour
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "_id",
    "cpe",
    "sw_name"
})
@Document(collection = "sw")
public class SwlDTO implements Serializable {

    @Id
    @JsonProperty("_id")
    private String id;
    @JsonProperty("cpe")
    private String cpe;
    @JsonProperty("sw_name")
    @Field("sw_name")
    private String swName;

    @JsonProperty("_id")
    public String getId() {
        return id;
    }

    @JsonProperty("_id")
    public void setId(String id) {
        this.id = id;
    }

    @JsonProperty("cpe")
    public String getCpe() {
        return cpe;
    }

    @JsonProperty("cpe")
    public void setCpe(String cpe) {
        this.cpe = cpe;
    }

    @JsonProperty("sw_name")
    public String getSwName() {
        return swName;
    }

    @JsonProperty("sw_name")
    public void setSwName(String swName) {
        this.swName = swName;
    }
}
