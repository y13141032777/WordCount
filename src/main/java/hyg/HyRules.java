package hyg;

import java.util.ArrayList;
import java.util.List;

public class HyRules {

     private static HyRules rules ;

     List<HyNode> node = null;

     List garoup = new ArrayList<>();

     List<HyEdge> edge =null;

    private HyRules(List<HyNode> nodes, List<HyEdge> edges) {
        node = nodes;
        edge = edges;
    }

        public static HyRules getHyRules(List<HyNode> nodes, List<HyEdge> edges){

        if(rules==null){
            rules =new HyRules(nodes,edges);
        }
        return rules;
    }

    public List<HyNode> getNode() {
        return node;
    }

    public void setNode(List<HyNode> node) {
        this.node = node;
    }

    public List getGaroup() {
        return garoup;
    }

    public void setGaroup(List garoup) {
        this.garoup = garoup;
    }

    public List<HyEdge> getEdge() {
        return edge;
    }

    public void setEdge(List<HyEdge> edge) {
        this.edge = edge;
    }
}
