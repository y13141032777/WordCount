package hyg;

import java.util.ArrayList;
import java.util.List;

public class HyEdge {

    HyData_e data ;

    String relatinship = "unset";


    public HyEdge() {
    }

    public HyEdge(HyData_e data, String relatinshipName) {
        this.data = data;
        this.relatinship = relatinshipName;
    }

    public HyData_e getData() {
        return data;
    }

    public void setData(HyData_e data) {
        this.data = data;
    }

    public String getRelatinship() {
        return relatinship;
    }

    public void setRelatinship(String relatinship) {
        this.relatinship = relatinship;
    }
}
