import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Solution {

    // 给定一个二叉树，找出其最大深度。
    //二叉树的深度为根节点到最远叶子节点的最长路径上的节点数。
    //说明: 叶子节点是指没有子节点的节点。
    public int maxDepth(TreeNode root) {
        if (root == null) {
            return 0;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

    // 给定一个二叉树，判断它是否是高度平衡的二叉树。
    //本题中，一棵高度平衡二叉树定义为：
    //一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过 1 。
    public boolean isBalanced(TreeNode root) {
        if (root == null) {
            return true;
        }
        int leftHeight = maxDepth(root.left);
        int rightHeight = maxDepth(root.right);
        if (leftHeight - rightHeight > 1 || rightHeight - leftHeight > 1) {
            return false;
        }
        return isBalanced(root.right) && isBalanced(root.left);
    }

    // 判断两个二叉树是否为镜像的
    public boolean isSymmetric1(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return true;
        }
        if (t1 == null || t2 == null) {
            return false;
        }
        if (t1.val != t2.val) {
            return false;
        }
        return isSymmetric1(t1.left, t2.right) && isSymmetric1(t1.right, t2.left);
    }


    //给定一个二叉树，检查它是否是镜像对称的。
    public boolean isSymmetric(TreeNode root) {
        if (root == null) {
            return true;
        }
        return isSymmetric1(root.left, root.right);
    }

}



public class Test {

    public static void main(String[] args) {
        TreeNode a = new TreeNode(1);
        TreeNode b = new TreeNode(2);
        TreeNode c = new TreeNode(3);
        TreeNode d = new TreeNode(4);
        TreeNode e = new TreeNode(5);
        TreeNode f = new TreeNode(6);
        TreeNode g = new TreeNode(7);
        a.left = b;
        a.right = g;
        b.left = d;
        g.left = e;
        g.right = f;
        b.right = c;
        levelOrderTraversal(a);
        System.out.println(isCompleteTree(a));

    }

    // 层序遍历
    public static void levelOrderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        TreeNode cur = root;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(cur);
        while (true) {
            cur = queue.poll();
            System.out.print(cur.val + " ");
            if (cur.left != null) {
                queue.offer(cur.left);
            }
            if (cur.right != null) {
                queue.offer(cur.right);
            }
            if (queue.isEmpty() == true) {
                break;
            }
        }
    }

    // 判断二叉树是否为完全二叉树
    public static boolean isCompleteTree(TreeNode root) {
        if (root == null) {
            return true;
        }
        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode cur = root;
        queue.offer(cur);
        while (true) {
            cur = queue.poll();
            if (cur.left != null && cur.right != null) {
                queue.offer(cur.left);
                queue.offer(cur.right);
                continue;
            }else if (cur.left == null && cur.right != null) {
                return false;
            }else {
                if (cur.left != null) {
                    queue.offer(cur.left);
                }
                while (true) {
                    cur = queue.poll();
                    if (!(cur.left == null && cur.right == null)){
                        return false;
                    }
                    if (queue.isEmpty() == true) {
                        break;
                    }
                }
            }
            if (queue.isEmpty() == true) {
                break;
            }
        }
        return true;
    }
}
