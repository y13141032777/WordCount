package hyg;

import java.util.ArrayList;
import java.util.List;

public class SchemaB {

    ;
    List<String> property = new ArrayList<>();


    //data里面用这个构造方法
    public SchemaB(){

    }

    public SchemaB(List<String> properties) {
        this.property = properties;
    }


    public List<String> getProperties() {
        return property;
    }

    public void setProperties(List<String> properties) {
        this.property = properties;
    }


}
