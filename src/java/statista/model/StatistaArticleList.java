/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statista.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/**
 *
 * @author Zahangir Alam
 */
public class StatistaArticleList {

    @SerializedName("data")
    @Expose
    private List<StatistaArticle> statistaArticles;

    public StatistaArticleList() {
    }

    public StatistaArticleList(List<StatistaArticle> statistaArticles) {
        this.statistaArticles = statistaArticles;
    }

    public List<StatistaArticle> getStatistaArticles() {
        return statistaArticles;
    }

    public void setStatistaArticles(List<StatistaArticle> statistaArticles) {
        this.statistaArticles = statistaArticles;
    }
    
    
    
    

}
