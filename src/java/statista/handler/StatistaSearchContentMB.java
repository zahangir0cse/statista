package statista.handler;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import statista.model.StatistaSearchContent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import statista.exception.JSONDownloaderException;
import statista.model.StatistaArticleList;
import statista.service.StatistaService;

@ManagedBean
@SessionScoped
public class StatistaSearchContentMB {

    BufferedReader br = null;
    StringBuilder sb = new StringBuilder();
    List<String> list = new ArrayList<>();
    Map<String, String> map = new HashMap<>();
    Map<String, String> titleMap = new HashMap<>();
    StatistaSearchContent statistaSearchContent = new StatistaSearchContent();

    public StatistaSearchContent getStatistaSearchContent() {
        return statistaSearchContent;
    }

    public void setStatistaSearchContent(StatistaSearchContent statistaSearchContent) {
        this.statistaSearchContent = statistaSearchContent;
    }

    public List<String> getList() {
        if (list !=null) {
            return list;
        }else{
            return null;
        }
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public Map<String, String> getMap() {
        if (map !=null) {
            return map;
        }else{
            return null;
        }
    }

    public void setMap(Map<String, String> map) {
        this.map = map;
    }

    public Map<String, String> getTitleMap() {
        return titleMap;
    }

    public void setTitleMap(Map<String, String> titleMap) {
        this.titleMap = titleMap;
    }
    
    
    
    public String loadSearchContent() throws JSONDownloaderException {
        statistaSearchContent.setSearchContent(statistaSearchContent.getSearchContent());
        statistaSearchContent.setLimit(statistaSearchContent.getLimit());
        statistaSearchContent.setLanguage(statistaSearchContent.getLanguage());
        if (statistaSearchContent.getSearchContent() == null || statistaSearchContent.getLimit() == null || statistaSearchContent.getLanguage() == null) {
            return null;
        } else if (statistaSearchContent.getSearchContent() != null && statistaSearchContent.getLimit() != null && statistaSearchContent.getLanguage() != null) {
            try {
                String searchContent = statistaSearchContent.getSearchContent();
                String limitation = statistaSearchContent.getLimit();
                String language = statistaSearchContent.getLanguage();
                URL url = new URL("https://api.statista.com/searchJson/apiKey/api_key_here/q/" + searchContent + "/sort/1/lang/" + language + "/limit/" + limitation + "/datefrom/0/dateto/0/will");
                HttpURLConnection connection = StatistaService.getHttpURLConnection(url, null);
                br = new BufferedReader(new InputStreamReader(connection.getInputStream(), "utf-8"));
                String line;
                while ((line = br.readLine()) != null) {
                    sb.append(line);
                }
                Gson gson = new Gson();
                JsonReader reader = new JsonReader(new StringReader(sb.toString()));
                reader.setLenient(true);
                StatistaArticleList articleList = gson.fromJson(reader, StatistaArticleList.class);
                for (int i = 0; i < Integer.parseInt(limitation); i++) {
                    String jsn = gson.toJson(articleList.getStatistaArticles().get(i));
                    String title = articleList.getStatistaArticles().get(i).getTitle();
                    map.put(jsn, jsn);
                    titleMap.put("Title: "+ title, jsn);
                }

                return null;

            } catch (MalformedURLException e) {
                throw new JSONDownloaderException("URL not found");
            } catch (IOException e) {
                throw new JSONDownloaderException("HttpURLConnection can't be opened");
            }

        } else {
            return null;
        }
    }
}
