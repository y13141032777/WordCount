package hyg;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class SchemaA {


    boolean isColId =false;
    Integer dstLabel = null;
    Integer srcLabel = 0;
    List<String> property = new ArrayList<>();


    public SchemaA(List<String> properties) {
        this.property = properties;
    }

    // edge里面用这个方法
    public SchemaA(Integer dstLabel) {
        this.dstLabel = dstLabel;
    }

    public List<String> getProperties() {
        return property;
    }

    public void setProperties(List<String> properties) {
        this.property = properties;
    }

    public boolean isColId() {
        return isColId;
    }

    public void setColId(boolean colId) {
        isColId = colId;
    }

    public Integer getDstLabel() {
        return dstLabel;
    }

    public void setDstLabel(Integer dstLabel) {
        this.dstLabel = dstLabel;
    }

    public Integer getSrcLabel() {
        return srcLabel;
    }

    public void setSrcLabel(Integer srcLabel) {
        this.srcLabel = srcLabel;
    }



}
