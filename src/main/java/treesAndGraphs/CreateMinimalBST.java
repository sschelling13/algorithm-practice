package treesAndGraphs;

import java.util.LinkedList;

public class CreateMinimalBST {

    public static TreeNode createMinimalBST(int[] array) {
        return createMinimalBST(array, 0, array.length -1);
    }

    public static TreeNode createMinimalBST(int[] arr, int start, int end) {
        if (end < start)
            return null;

        int mid = (start + end) / 2;
        TreeNode node = new TreeNode(arr[mid]);
        node.left = createMinimalBST(arr, start, mid - 1);
        node.right = createMinimalBST(arr, mid + 1, end);
        return node;
    }

//    public static void printTree(TreeNode root) {
//        LinkedList<LinkedList<TreeNode>> printLayer = new LinkedList<LinkedList<TreeNode>>();
//
//        TreeNode[] currentChildren = root.;
//        for (TreeNode child : currentChildren) {
//            System.out.println("| " + child.value + " |");
//        }
//
//    }


    public static void printTree(TreeNode node, String prefix)
    {
        if(node == null) return;

        System.out.println(prefix + " + " + node.value);
        printTree(node.left , prefix + "   ");
        printTree(node.right , prefix + "   ");
    }

    public static void main(String[] args) {
        int[] input = {-1, 2, 5, 7, 8, 11, 15};
        TreeNode root = createMinimalBST(input);
        printTree(root, "");
    }
}
