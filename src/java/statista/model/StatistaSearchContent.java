package statista.model;

public class StatistaSearchContent {
    private String searchContent;
    private String limit;
    private String language;

    public StatistaSearchContent(String searchContent, String limit, String language) {
        this.searchContent = searchContent;
        this.limit = limit;
        this.language = language;
    }

    public StatistaSearchContent() {
    }

    public String getLimit() {
        return limit;
    }

    public void setLimit(String limit) {
        this.limit = limit;
    }

    public String getSearchContent() {
        return searchContent;
    }

    public void setSearchContent(String searchContent) {
        this.searchContent = searchContent;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
    
    

}
