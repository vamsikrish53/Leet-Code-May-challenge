// https://leetcode.com/problems/cousins-in-binary-tree/

/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
import java.util.*;
class Solution {
     public class Node
    {
        TreeNode parent = null;
        int depth = 0;
        public Node(TreeNode node, int d)
        {
            parent = node;
            depth = d;
        }
    }
    public boolean isCousins(TreeNode root, int x, int y) {
        ArrayList<Node> nodes = new ArrayList<>();
        check(null,root,x,y,0,nodes);
        if(nodes.get(0).parent!=nodes.get(1).parent && nodes.get(0).depth==nodes.get(1).depth)
            return true;
        else
            return false;        
    }
    
    public void check(TreeNode parent, TreeNode root, int x, int y, int depth, ArrayList<Node> nodes)
    {
        if(root == null)
            return;
        if(root.val==x || root.val==y)
            nodes.add(new Node(parent,depth));
        check(root,root.left,x,y,depth+1,nodes);
        check(root,root.right,x,y,depth+1,nodes);        
    }
}
