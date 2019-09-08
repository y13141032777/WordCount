package hyg;


import com.alibaba.fastjson.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Instance{
    String tabId = "HyperG";
    Integer idColId = 4;
    Integer nameColId = 4;
    List<String> properties = new ArrayList<>();

    public Instance(String tabId, Integer idColId, Integer nameColId) {
        this.tabId = tabId;
        this.idColId = idColId;
        this.nameColId = nameColId;
    }

    private Instance() {
    }

    public String getTabId() {
        return tabId;
    }

    public void setTabId(String tabId) {
        this.tabId = tabId;
    }

    public Integer getIdColId() {
        return idColId;
    }

    public void setIdColId(Integer idColId) {
        this.idColId = idColId;
    }

    public Integer getNameColId() {
        return nameColId;
    }

    public void setNameColId(Integer nameColId) {
        this.nameColId = nameColId;
    }

    public List<String> getProperties() {
        return properties;
    }

    public void setProperties(List<String> properties) {
        this.properties = properties;
    }

    public static void main(String[] args) {

//        System.out.println(JSONObject.toJSON();

        System.out.println(JSONObject.toJSONString(new Instance("gar",111,1)));
    }
}
