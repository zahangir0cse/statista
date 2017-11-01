package statista.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

public class StatistaArticle {

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("identifier")
    @Expose
    private Integer identifier;
    @SerializedName("Link")
    @Expose
    private String link;
    @SerializedName("creator")
    @Expose
    private String creator;
    @SerializedName("subject")
    @Expose
    private String subject;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("FirstCharacteristic")
    @Expose
    private Object firstCharacteristic;
    @SerializedName("FirstValue")
    @Expose
    private Object firstValue;
    @SerializedName("Premium")
    @Expose
    private Integer premium;
    @SerializedName("date")
    @Expose
    private String date;
    @SerializedName("ImageUrl")
    @Expose
    private String imageUrl;
    @SerializedName("teaserImageUrls")
    @Expose
    private List<TeaserImages> teaserImages = null;
    @SerializedName("Note")
    @Expose
    private Object note;

    public StatistaArticle() {
    }

    public StatistaArticle(String title, Integer identifier, String link, String creator, String subject, String description, Object firstCharacteristic, Object firstValue, Integer premium, String date, String imageUrl, Object note) {
        this.title = title;
        this.identifier = identifier;
        this.link = link;
        this.creator = creator;
        this.subject = subject;
        this.description = description;
        this.firstCharacteristic = firstCharacteristic;
        this.firstValue = firstValue;
        this.premium = premium;
        this.date = date;
        this.imageUrl = imageUrl;
        this.note = note;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getIdentifier() {
        return identifier;
    }

    public void setIdentifier(Integer identifier) {
        this.identifier = identifier;
    }

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }

    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Object getFirstCharacteristic() {
        return firstCharacteristic;
    }

    public void setFirstCharacteristic(Object firstCharacteristic) {
        this.firstCharacteristic = firstCharacteristic;
    }

    public Object getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Object firstValue) {
        this.firstValue = firstValue;
    }

    public Integer getPremium() {
        return premium;
    }

    public void setPremium(Integer premium) {
        this.premium = premium;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public List<TeaserImages> getTeaserImages() {
        return teaserImages;
    }

    public void setTeaserImages(List<TeaserImages> teaserImages) {
        this.teaserImages = teaserImages;
    }

    public Object getNote() {
        return note;
    }

    public void setNote(Object note) {
        this.note = note;
    }

}
