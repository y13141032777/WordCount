package hyg;

import com.alibaba.fastjson.JSON;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) {

        List<HyNode> nodes = new ArrayList<>();

        HyNode node = HyUtils.getNode("a.txt",3,3,"endname");

        nodes.add(node);

//        String nodesString = JSON.toJSONString(nodes);
//        System.out.println(nodesString);

        //边
        List<HyEdge> edges = HyUtils.getEdges("a.txt", 3, 2, "edgename");

        //最终规则
        HyRules rules = (HyRules) HyRules.getHyRules(nodes,edges);
        String ruString = JSON.toJSONString(rules);
        System.out.println(ruString);
    }
}
