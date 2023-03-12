class TreeNode{
    TreeNode left;
    TreeNode right;
    int data;

    public TreeNode(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}

class BinaryTree {

    TreeNode root;

    public void preorder(TreeNode node){
        if (node == null) return;
        System.out.println(node.data + " ");
        preorder(node.left);
        preorder(node.right);
    }
    void preorder(){ preorder(root);}

    public void inorder(TreeNode node){
        if (node == null) return;
        inorder(node.left);
        System.out.println(node.data + " ");
        inorder(node.right);
    }
    void inorder(){ inorder(root);}

    public void postorder(TreeNode node){
        if (node == null) return;
        postorder(node.left);
        postorder(node.right);
        System.out.println(node.data + " ");
    }
    void postorder(){ postorder(root);}


    public static void main(String[] args)
    {
        BinaryTree tree = new createBinaryTree();
        tree.root = new TreeNode(1);
        tree.root.left = new TreeNode(2);
        tree.root.right = new TreeNode(3);
        tree.root.left.left = new TreeNode(4);
        tree.root.left.right = new TreeNode(5);

        // Function call
        System.out.println("Preorder traversal of binary tree is ");
        tree.preorder();
        System.out.println("Inorder traversal of binary tree is ");
        tree.inorder();
        System.out.println("PostOrder traversal of binary tree is ");
        tree.postorder();

    }

    public static class createBinaryTree extends BinaryTree {
        createBinaryTree(){
            root = null;
        }
    }
}
