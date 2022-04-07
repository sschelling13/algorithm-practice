package treesAndGraphs;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;

public class CreateLevelLinkedList {

    public static void createLevelLinkedList (TreeNode root, ArrayList<LinkedList<TreeNode>> lists, int level) {
        if (root == null) return;

        LinkedList<TreeNode> list = null;
        if (lists.size() == level) {
            list = new LinkedList<TreeNode>();
            lists.add(list);
        } else {
            list = lists.get(level);
        }
        list.add(root);
        createLevelLinkedList(root.left, lists, level + 1);
        createLevelLinkedList(root.right, lists, level + 1);
    }

    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedListBFS(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> result = new ArrayList<LinkedList<TreeNode>>();

        LinkedList<TreeNode> current = new LinkedList<TreeNode>();
        if (root != null) {
            current.add(root);
        }

        while (current.size() > 0) {
            result.add(current);
            LinkedList<TreeNode> parents = current;
            current = new LinkedList<TreeNode>();
            for (TreeNode parent : parents) {
                if (parent.left != null) {
                    current.add(parent.left);
                }
                if (parent.right != null) {
                    current.add(parent.right);
                }
            }
        }

        return result;
    }

    public static ArrayList<LinkedList<TreeNode>> createLevelLinkedList(TreeNode root) {
        ArrayList<LinkedList<TreeNode>> lists = new ArrayList<LinkedList<TreeNode>>();
        createLevelLinkedList(root, lists, 0);
        return lists;
    }

    public static void printLevelLinkedList(ArrayList<LinkedList<TreeNode>> lists) {
        for (LinkedList<TreeNode> list : lists) {
            StringBuilder layerString = new StringBuilder();
            for (int i = 0; i < list.size(); i++) {
                int val = list.get(i).value;
                layerString.append("| " + val + " |");
            }

            System.out.println(layerString.toString());
        }
    }

    public static void main(String[] args) {
        int[] input = {-1, 2, 5, 7, 8, 11, 15};
        TreeNode root = CreateMinimalBST.createMinimalBST(input);
        ArrayList<LinkedList<TreeNode>> levelLinkedList = createLevelLinkedList(root);
        printLevelLinkedList(levelLinkedList);

    }
}
