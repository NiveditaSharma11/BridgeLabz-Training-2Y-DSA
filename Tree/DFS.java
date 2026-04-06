class Node{
    char data;
    Node left;
    Node right;
    public Node(char data){
        this.data=data;
        this.left=null;
        this.right=null;
    }
}

public class DFS {
    static void PreOrderTraversal(Node root){
        if(root==null){
            return;
        }
        System.out.print(root.data+" ");    

        PreOrderTraversal(root.left);
        PreOrderTraversal(root.right);
    }

    static void InOrderTraversal(Node root){
        if(root==null){
            return;
        }
        InOrderTraversal(root.left);
        System.out.print(root.data+" ");
        InOrderTraversal(root.right);
    }

    static void PostOrderTraversal(Node root){
        if(root==null){
            return;
        }
        PostOrderTraversal(root.left);
        PostOrderTraversal(root.right);
        System.out.print(root.data+" ");
    }

    public static void main(String[] args) {
        // 0 level
        Node root=new Node('A');

        // 1 level
        root.left=new Node('B');
        root.right=new Node('C');

        //2 level
        root.left.left=new Node('D');
        root.left.right=new Node('E');
        root.right.left=new Node('G');
        root.right.right=new Node('H');

        //3 level
        root.left.right.left=new Node('I');
        root.left.right.right=new Node('J');
        root.right.left.left=new Node('K');

        
        PreOrderTraversal(root);
        System.out.println();
        InOrderTraversal(root);
        System.out.println();
        PostOrderTraversal(root);
    }
    
}
