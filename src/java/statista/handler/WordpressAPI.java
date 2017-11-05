/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package statista.handler;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import statista.service.StatistaService;
import org.apache.commons.codec.binary.Base64;

/**
 *
 * @author Zahangir Alam
 */
@ManagedBean
@SessionScoped
public class WordpressAPI {

    List<String> list = new ArrayList<>();

    public List<String> getList() {
        return list;
    }

    public void setList(List<String> list) {
        this.list = list;
    }

    public String test() {
        if (getList() == null) {
            return null;
        } else {
            return getList().toString();
        }
    }

    public String addPost() {
        try {
            String encoding = Base64.encodeBase64String(("user_name_here" + ":" + "password_here").getBytes());
            URL url = new URL("url_here");
            HttpURLConnection connection = StatistaService.getHttpURLConnection(url, encoding);

        } catch (MalformedURLException e) {
            //I will change it with custom exception later.
        } catch (IOException e) {
            //I will change it with custom exception later.
        }
        return null;//I will change it later
    }
}
