package treesAndGraphs;

public class ValidateBST {
    Integer lastPrinted = null;

    public boolean checkBST(TreeNode n){
        if (n == null) return true;

        if (!checkBST(n.left)) return false;

        if (lastPrinted != null && n.value <= lastPrinted) return false;
        lastPrinted = n.value;

        if (!checkBST(n.right)) return false;

        return true;
    }
}
