
package org.example.api.beans;

import java.util.Map;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyDescription;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;


/**
 * 
 */
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
    "name",
    "mylong",
    "myint",
    "mymap",
    "id"
})
public class SampleDataType {

    /**
     * 
     */
    @JsonProperty("name")
    @JsonPropertyDescription("")
    private String name;
    /**
     * 
     */
    @JsonProperty("mylong")
    @JsonPropertyDescription("")
    private Long mylong;
    /**
     * 
     */
    @JsonProperty("myint")
    @JsonPropertyDescription("")
    private Integer myint;
    @JsonProperty("mymap")
    private Map<String, String> mymap;
    /**
     * 
     */
    @JsonProperty("id")
    @JsonPropertyDescription("")
    private String id;

    /**
     * 
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    /**
     * 
     */
    @JsonProperty("name")
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 
     */
    @JsonProperty("mylong")
    public Long getMylong() {
        return mylong;
    }

    /**
     * 
     */
    @JsonProperty("mylong")
    public void setMylong(Long mylong) {
        this.mylong = mylong;
    }

    /**
     * 
     */
    @JsonProperty("myint")
    public Integer getMyint() {
        return myint;
    }

    /**
     * 
     */
    @JsonProperty("myint")
    public void setMyint(Integer myint) {
        this.myint = myint;
    }

    @JsonProperty("mymap")
    public Map<String, String> getMymap() {
        return mymap;
    }

    @JsonProperty("mymap")
    public void setMymap(Map<String, String> mymap) {
        this.mymap = mymap;
    }

    /**
     * 
     */
    @JsonProperty("id")
    public String getId() {
        return id;
    }

    /**
     * 
     */
    @JsonProperty("id")
    public void setId(String id) {
        this.id = id;
    }

}