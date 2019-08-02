import java.util.ArrayList;
import java.util.List;

class Tree {
    public Integer root;

    public List<Tree> childrens;

    public Tree(Integer root) {
        this.root = root;
        this.childrens = null;
    }
}

class CountTree {

    public static int countLeafNodes(Tree tree) {
        if (tree == null) {
            return 0;
        }

        if (tree.childrens == null || tree.childrens.isEmpty()) {
            return 1;
        }

        int leafNodes = 0;
        for (Tree child: tree.childrens) {
            leafNodes += countLeafNodes(child);
        }

        return leafNodes;
    }

    public static void main(String args[])
    {
        /* create a tree */
        Tree treeRoot = new Tree(1);
        List<Tree> children = new ArrayList<>();
        children.add(new Tree(2));
        children.add(new Tree(3));

        Tree oneTree = new Tree(4);
        List<Tree> children4 = new ArrayList<>();
        children.add(new Tree(5));
        children.add(new Tree(6));
        oneTree.childrens = children4;

        children.add(oneTree);
        treeRoot.childrens = children;

        int leafNodes = countLeafNodes(treeRoot);

        System.out.println(leafNodes);

    }
}
