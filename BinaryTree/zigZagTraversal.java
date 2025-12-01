package BinaryTree;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.Queue;



class Node {
    int data;
    Node left,right;
    Node(int d)
    {
        data=d;
        left=right=null;
    }
}



public class zigZagTraversal {
    class Solution {
    ArrayList<Integer> zigZagTraversal(Node root) {
        ArrayList<Integer> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<Node> q = new LinkedList<>();
        q.add(root);

        boolean leftToRight = true; // for zig-zag direction

        while (!q.isEmpty()) {
            int size = q.size();
            ArrayList<Integer> level = new ArrayList<>();

            // traverse current level
            for (int i = 0; i < size; i++) {
                Node temp = q.poll();
                level.add(temp.data);

                if (temp.left != null) q.add(temp.left);
                if (temp.right != null) q.add(temp.right);
            }

            // reverse for zigzag if needed
            if (!leftToRight) {
                Collections.reverse(level);
            }

            ans.addAll(level);

            // flip direction
            leftToRight = !leftToRight;
        }

        return ans;
    }
}
}
