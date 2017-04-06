package xyz.yakdmt.vkphotoviewer.model;

import com.fasterxml.jackson.annotation.JsonAnyGetter;
import com.fasterxml.jackson.annotation.JsonAnySetter;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by yakdmt on 01/04/2017.
 */

@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonPropertyOrder({
        "pid",
        "aid",
        "owner_id",
        "src",
        "src_big",
        "src_small",
        "src_xbig",
        "src_xxbig",
        "width",
        "height",
        "text",
        "created"
})
public class Photo {
    @JsonProperty("pid")
    private Integer pid;
    @JsonProperty("aid")
    private Integer aid;
    @JsonProperty("owner_id")
    private Integer ownerId;
    @JsonProperty("src")
    private String src;
    @JsonProperty("src_big")
    private String srcBig;
    @JsonProperty("src_small")
    private String srcSmall;
    @JsonProperty("src_xbig")
    private String srcXbig;
    @JsonProperty("src_xxbig")
    private String srcXxbig;
    @JsonProperty("width")
    private Integer width;
    @JsonProperty("height")
    private Integer height;
    @JsonProperty("text")
    private String text;
    @JsonProperty("created")
    private Integer created;
    @JsonIgnore
    private Map<String, Object> additionalProperties = new HashMap<String, Object>();

    @JsonProperty("pid")
    public Integer getPid() {
        return pid;
    }

    @JsonProperty("pid")
    public void setPid(Integer pid) {
        this.pid = pid;
    }

    @JsonProperty("aid")
    public Integer getAid() {
        return aid;
    }

    @JsonProperty("aid")
    public void setAid(Integer aid) {
        this.aid = aid;
    }

    @JsonProperty("owner_id")
    public Integer getOwnerId() {
        return ownerId;
    }

    @JsonProperty("owner_id")
    public void setOwnerId(Integer ownerId) {
        this.ownerId = ownerId;
    }

    @JsonProperty("src")
    public String getSrc() {
        return src;
    }

    @JsonProperty("src")
    public void setSrc(String src) {
        this.src = src;
    }

    @JsonProperty("src_big")
    public String getSrcBig() {
        return srcBig;
    }

    @JsonProperty("src_big")
    public void setSrcBig(String srcBig) {
        this.srcBig = srcBig;
    }

    @JsonProperty("src_small")
    public String getSrcSmall() {
        return srcSmall;
    }

    @JsonProperty("src_small")
    public void setSrcSmall(String srcSmall) {
        this.srcSmall = srcSmall;
    }

    @JsonProperty("src_xbig")
    public String getSrcXbig() {
        return srcXbig;
    }

    @JsonProperty("src_xbig")
    public void setSrcXbig(String srcXbig) {
        this.srcXbig = srcXbig;
    }

    @JsonProperty("src_xxbig")
    public String getSrcXxbig() {
        return srcXxbig;
    }

    @JsonProperty("src_xxbig")
    public void setSrcXxbig(String srcXxbig) {
        this.srcXxbig = srcXxbig;
    }

    @JsonProperty("width")
    public Integer getWidth() {
        return width;
    }

    @JsonProperty("width")
    public void setWidth(Integer width) {
        this.width = width;
    }

    @JsonProperty("height")
    public Integer getHeight() {
        return height;
    }

    @JsonProperty("height")
    public void setHeight(Integer height) {
        this.height = height;
    }

    @JsonProperty("text")
    public String getText() {
        return text;
    }

    @JsonProperty("text")
    public void setText(String text) {
        this.text = text;
    }

    @JsonProperty("created")
    public Integer getCreated() {
        return created;
    }

    @JsonProperty("created")
    public void setCreated(Integer created) {
        this.created = created;
    }

    @JsonAnyGetter
    public Map<String, Object> getAdditionalProperties() {
        return this.additionalProperties;
    }

    @JsonAnySetter
    public void setAdditionalProperty(String name, Object value) {
        this.additionalProperties.put(name, value);
    }
}
