package hyg;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class HyUtils {

    //获取节点
    public static HyNode getNode(String fileName, Integer idColId, Integer nameColId,String nodeName){

        Instance dataInstance = new Instance(fileName,idColId,nameColId);
        SchemaB dataSchema =new SchemaB();
        List<Instance> instances = new ArrayList<>();
        instances.add(dataInstance);

        HyData nodeData = new HyData(instances,dataSchema);

        HyNode singleNode = new HyNode(nodeData,nodeName);

        List<HyNode> nodes = new ArrayList<>();
        nodes.add(singleNode);

        return singleNode;
    }

    //获取边
    public static List<HyEdge> getEdges(String fileName, Integer idColId, Integer nameColId,String nodeName){

        List<HyEdge> edges = new ArrayList<>();

        Instance dataInstance = new Instance(fileName,idColId,nameColId);
        SchemaA dataSchema =new SchemaA(edges.size()+1);
        List<Instance> instances = new ArrayList<>();
        instances.add(dataInstance);



        HyData_e edgeData = new HyData_e(instances,dataSchema);


        HyEdge singleEdge = new HyEdge(edgeData,nodeName);
        edges.add(singleEdge);

//        String s = JSON.toJSONString(singleEdge);
//        System.out.println(s);


        return edges;
    }

    //获取规则
}
