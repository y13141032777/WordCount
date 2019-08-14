package hyg;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Properties;

/**
 * {
 *       "data": {
 *         "instances": [
 *           {
 *             "tabId": "HyperGraph-190813.csv",
 *             "idColId": 4,
 *             "nameColId": 4,
 *             "properties": []
 *           }
 *         ],
 *         "schema": {
 *           "property": []
 *         }
 *       },
 *       "label": "end_customer_name",
 *       "groups": []
 *     }
 */
public class HyData {

    List<Hynode> instances = new ArrayList<Hynode>();


}

 class Hynode{
    String tabId=  "HyperGraph-190813.csv";
    int idColId = 4;
    int nameColId= 4;
    String properties = "[]";
}
