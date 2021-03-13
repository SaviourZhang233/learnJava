class TreeNode {
    public int val;
    public TreeNode left;
    public TreeNode right;
    public TreeNode(int val) {
        this.val = val;
    }

}


public class Test {
    public static void main(String[] args) {
        // 生成二叉树
        TreeNode A = new TreeNode(1);
        TreeNode B = new TreeNode(2);
        TreeNode C = new TreeNode(3);
        TreeNode D = new TreeNode(4);
        TreeNode E = new TreeNode(5);
        TreeNode F = new TreeNode(6);
        TreeNode G = new TreeNode(7);
        TreeNode H = new TreeNode(8);
        A.left = B;
        B.left = D;
        B.right = E;
        E.left = F;
        A.right = C;
        C.right = G;
        C.left = H;
        //preOrderTraversal(A);
        //inOrderTraversal(A);
        //postOrderTraversal(A);
        //System.out.println(getSize(A));
        //System.out.println(getLeafSize(A));
        //System.out.println(getLevelSize(A, 3));
        System.out.println(getHeight(A));


    }

    // 先序遍历
    // 思路为 先打印当前节点，在先序遍历左子树，最后先序遍历右子树
    public static void preOrderTraversal(TreeNode root) {
        // 递归出口
        if(root == null) {
            return;
        }
        System.out.print(root.val);
        preOrderTraversal(root.left);
        preOrderTraversal(root.right);
    }

    // 中序遍历
    // 思路为 先中序遍历左子树，再打印当前节点，最后中序遍历右子树
    public static void inOrderTraversal(TreeNode root){
        // 递归出口
        if(root == null) {
            return;
        }
        inOrderTraversal(root.left);
        System.out.print
                (root.val);
        inOrderTraversal(root.right);
    }

    // 后序遍历
    // 思路为 先后续遍历左子树，再后序遍历右子树，最后打印当前节点
    public static void postOrderTraversal(TreeNode root) {
        if(root == null) {
            return;
        }
        postOrderTraversal(root.left);
        postOrderTraversal(root.right);
        System.out.print(root.val);
    }

    // 求节点个数
    // 思路为 节点个数 = 左子树节点个数 + 右子树结点个数 + 1（根节点）
    public static int getSize(TreeNode root) {
        if(root == null) {
            return 0;
        }
        return getSize(root.left) + getSize(root.right) + 1;
    }

    // 求叶子结点个数
    // 注意递归结束的条件
    public static int getLeafSize(TreeNode root) {
        if(root.left == null && root.right == null) {
            return 1;
        }
        if(root.left == null ) {
            return getLeafSize(root.right);
        }
        if(root.right == null) {
            return getLeafSize(root.left);
        }
        return getLeafSize(root.right) + getLeafSize(root.left);
    }

    // 求第K层节点个数
    // 思路为 根节点为root的树的第K层节点个数 = 其左子树的第K-1层节点数 + 其右子树的第K-1层节点数
    public static int getLevelSize(TreeNode root, int Level) {
        if(root == null) {
            return 0;
        }
        if(Level == 1) {
            return 1;
        }
        return getLevelSize(root.left, Level - 1) + getLevelSize(root.right, Level - 1);
    }

    // 获取二叉树高度
    // 思路为 当前树的高度为 = 1 + 两个子树中高度最大值
    public static int getHeight(TreeNode root) {
        if(root == null) {
            return 0;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);
        return 1 + (leftHeight > rightHeight ? leftHeight : rightHeight);
    }

    // 给你两棵二叉树的根节点 p 和 q ，编写一个函数来检验这两棵树是否相同
    // 思路为 先判断当前根节点是否相等，再比较两个子树是否相等
    public static boolean isSameTree(TreeNode p, TreeNode q) {
        if(p == null && q == null) {
            return true;
        }
        if((p == null && q != null) || (p != null && q == null)) {
            return false;
        }
        if(p.val == q.val) {
            return isSameTree(p.left, q.left) && isSameTree(p.right, q.right);
        }
        return false;
    }

    // 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树
    // 思路为 先判断该树和给定树是否相等若是则直接退出，不是再判断该树的左右子树和给定树是否有子树关系
    public static boolean isSubtree(TreeNode s, TreeNode t) {
        if(s == null && t == null) {
            return true;
        }
        if(s == null || t == null) {
            return false;
        }
        if(isSameTree(s, t) == true) {
            return true;
        }
        return isSubtree(s.left, t) || isSubtree(s.right, t);
    }
 }
