package hyg;

import java.util.ArrayList;
import java.util.List;

public class HyNode {

    HyData data ;

    String lable = "unset";

    List groups = new ArrayList<>();

    public HyNode() {
    }

    public HyNode(HyData data, String lable) {
        this.data = data;
        this.lable = lable;
    }

    public HyData getData() {
        return data;
    }

    public void setData(HyData data) {
        this.data = data;
    }

    public String getLable() {
        return lable;
    }

    public void setLable(String lable) {
        this.lable = lable;
    }

    public List getGroups() {
        return groups;
    }

    public void setGroups(List groups) {
        this.groups = groups;
    }
}
