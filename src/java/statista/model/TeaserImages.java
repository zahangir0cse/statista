package statista.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class TeaserImages {

    @SerializedName("width")
    @Expose
    private Integer width;
    @SerializedName("src")
    @Expose
    private String src;

    public TeaserImages() {
    }

    public TeaserImages(Integer width, String src) {
        this.width = width;
        this.src = src;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public String getSrc() {
        return src;
    }

    public void setSrc(String src) {
        this.src = src;
    }
    
}
