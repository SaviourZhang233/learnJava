import java.util.*;

public class TreeNode {

    public int val;
    public TreeNode left;
    public TreeNode right;

    public TreeNode(int val) {
        this.val = val;
    }
}

class Solution {
    // 编一个程序，读入用户输入的一串先序遍历字符串，
    // 根据此字符串建立一个二叉树（以指针方式存储）。
    // 例如如下的先序遍历字符串： ABC##DE#G##F### 其中“#”表示的是null，
    // 代表空树。建立起此二叉树以后，再对二叉树进行中序遍历，输出遍历结果。
    public static int index = 0;
    public static TreeNode buildTree(String string) {
        if (string == null) {
            return null;
        }
        index = 0;
        return _buildTree(string);
    }

    public static TreeNode _buildTree(String string) {
        char val = string.charAt(index);
        if (val == '#') {
            return null;
        }
        TreeNode root = new TreeNode(val);
        index++;
        root.left = _buildTree(string);
        index++;
        root.right = _buildTree(string);
        return root;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            String string = scanner.next();
            TreeNode root = buildTree(string);
            inorderTraversal(root);
            System.out.println();
        }
    }

    public static void inorderTraversal(TreeNode root) {
        if (root == null) {
            return;
        }
        inorderTraversal(root.left);
        System.out.print(root.val + " ");
        inorderTraversal(root.right);
    }

    // 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。
    // （即逐层地，从左到右访问所有节点）。
    // 非递归
    public List<List<Integer>> levelOrder1(TreeNode root) {
        List<List<Integer>> L = new ArrayList<>();
        if (root == null) {
            return L;
        }
        int curNum = 1;
        int nextNum = 1;
        int restNum = curNum;
        TreeNode cur = root;
        Queue<TreeNode> Q = new LinkedList<>();
        Q.offer(cur);
        while (nextNum != 0) {
            List<Integer> line = new ArrayList<>();
            curNum = nextNum;
            restNum = curNum;
            nextNum = 0;
            while (restNum != 0) {
                cur = Q.poll();
                line.add(cur.val);
                restNum--;
                if (cur.left != null) {
                    nextNum++;
                    Q.offer(cur.left);
                }
                if (cur.right != null) {
                    nextNum++;
                    Q.offer(cur.right);
                }
            }
            L.add(line);
        }
        return L;
    }

    // 给你一个二叉树，请你返回其按 层序遍历 得到的节点值。
    // （即逐层地，从左到右访问所有节点）。
    // 递归
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> L = new ArrayList<>();
        if (root == null) {
            return L;
        }
        _levelOrder(root, 0, L);
        return L;
    }

    public void _levelOrder(TreeNode root, int line,List<List<Integer>> L) {

        if (root == null) {
            return;
        }
        if (line == L.size()) {
            L.add(new LinkedList<Integer>());
        }
        L.get(line).add(root.val);
        _levelOrder(root.left, line + 1, L);
        _levelOrder(root.right, line + 1, L);
    }

    // 给定一个二叉树, 找到该树中两个指定节点的最近公共祖先。
    // 有三种情况
    // p 和 q 分别在一个树的左右子树
    // p 为根节点，q 为子树中的节点
    // q 为根节点，p 为子树中的节点
    // 如果上面三种满足两种，那么这个树的根节点就是 q ，p 的最近祖先节点
    public TreeNode an = null;
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return null;
        }
        an = null;
        find(root, p, q);
        return an;
    }

    private boolean find(TreeNode root, TreeNode p, TreeNode q) {
        if (root == null) {
            return false;
        }
        int flag1 = (root == p || root == q) ? 1 : 0;
        int flag2 = find(root.left, p, q) == true ? 1 : 0;
        int flag3 = find(root.right, p, q) == true ? 1 : 0;
        int flag = flag1 + flag2 + flag3;
        if (flag >= 2) {
            an = root;
        }
        return flag > 0 ? true : false;
    }

    // 输入一棵二叉搜索树，将该二叉搜索树转换成一个排序的双向链表。
    // 要求不能创建任何新的结点，只能调整树中结点指针的指向。
    public TreeNode Convert(TreeNode pRootOfTree) {
        if (pRootOfTree == null) {
            return null;
        }
        if (pRootOfTree.left == null && pRootOfTree.right == null) {
            return pRootOfTree;
        }
        TreeNode head = Convert(pRootOfTree.left);
        TreeNode cur = head;
        if (cur != null) {
            while (cur.right != null) {
                cur = cur.right;
            }
            cur.right = pRootOfTree;
            pRootOfTree.left = cur;
        }else {
            head = pRootOfTree;
        }
        TreeNode tail = Convert(pRootOfTree.right);
        if (tail != null) {
            pRootOfTree.right = tail;
            tail.left = pRootOfTree;
        }
        return head;
    }

}
