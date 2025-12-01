package BinaryTree;

import java.util.ArrayList;

public class LCABinaryTree {
    Node lca(Node root, int n1, int n2) {

        if (root.data == n1 || root.data == n2) {
            return root;
        }

        ArrayList<Node> arr = new ArrayList<>();
        ArrayList<Node> a1  = new ArrayList<>();
        ArrayList<Node> a2  = new ArrayList<>();

        dfs(root, n1, n2, arr, a1, a2);

        int i = 0;

        while (i < a1.size() && i < a2.size() &&
               a1.get(i).data == a2.get(i).data) {
            i++;
        }

        return a1.get(i - 1);
    }

    private void dfs(Node root, int n1, int n2,
                     ArrayList<Node> arr,
                     ArrayList<Node> a1,
                     ArrayList<Node> a2) {

        if (root == null) return;

        arr.add(root);

        // MATCHED WITH IMAGE
        if (root.data == n1) {
            a1.addAll(new ArrayList<>(arr));    // deep copy
        }

        if (root.data == n2) {
            for (Node ele : arr) a2.add(ele);   // deep copy
        }

        dfs(root.left,  n1, n2, arr, a1, a2);
        dfs(root.right, n1, n2, arr, a1, a2);

        arr.remove(arr.size() - 1); // backtracking
    }
}
