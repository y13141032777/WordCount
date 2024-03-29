package hyg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Properties;


public class HyData {

   List<Instance> instances = new ArrayList<Instance>();

    SchemaB schema = null;

    public HyData(List<Instance> instances) {
        this.instances = instances;
    }

    public HyData(List<Instance> instances ,SchemaB schema) {
        this.schema = schema;
        this.instances = instances;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public SchemaB getSchema() {
        return schema;
    }

    public void setSchema(SchemaB schema) {
        this.schema = schema;
    }
}

