package hyg;

import java.util.ArrayList;
import java.util.List;


public class HyData_e {

   List<Instance> instances = new ArrayList<Instance>();

    SchemaA schema = null;

    public HyData_e(List<Instance> instances) {
        this.instances = instances;
    }

    public HyData_e(List<Instance> instances , SchemaA schema) {
        this.schema = schema;
        this.instances = instances;
    }

    public List<Instance> getInstances() {
        return instances;
    }

    public void setInstances(List<Instance> instances) {
        this.instances = instances;
    }

    public HyData_e(SchemaA schema) {
        this.schema = schema;
    }
}

