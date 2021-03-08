package Beak;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class Node{
    String d;
    Node left=null;
    Node right=null;

    public Node(String d){
        this.d = d;
    }

    public String getD() {
        return d;
    }
}

public class tree_order {
    public Node root;

    public void create(String d, String left, String right){
        if(root ==null){
            root = new Node(d);
            if(!left.equals(".")) {
                root.left = new Node(left);
            }
            else if(!right.equals(".")){
                root.right= new Node(right);
            }
        }else {
            search(root,d,left,right);
        }

    }
    public void search(Node node, String d, String left, String right){
        if(node==null) {
            return;
        }
        else if(node.getD().equals(d)){
            System.out.println("Node 찾기 "+d+" "+left+" "+right);
            if(!left.equals(".")){
                root.left= new Node(left);
            }
            else if(!right.equals(".")){
                root.right= new Node(right);
            }
        }else {
            search(node.left,d,left,right);
            search(node.right,d,left,right);
        }
    }
    public void preorder(Node n){
        if(n !=null){
            System.out.print(n.d+" ");
            if(n.left!=null) preorder(n.left);
            if(n.right!=null) preorder(n.right);
        }
    }
    public void inorder(Node n){
        if(n !=null){
            if(n.left!=null) preorder(n.left);
            System.out.print(n.d+" ");
            if(n.right!=null) preorder(n.right);
        }
    }
    public void postorder(Node n){
        if(n !=null){
            if(n.left!=null) preorder(n.left);
            if(n.right!=null) preorder(n.right);
            System.out.print(n.d+" ");
        }
    }
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());
        String[] s;

        tree_order t = new tree_order();
        for(int i=0; i<node; i++){
            s = br.readLine().split(" ");
            t.create(s[0],s[1],s[2]);
        }
       t.preorder(t.root);
        System.out.println();
       t.inorder(t.root);
        System.out.println();
       t.postorder(t.root);
    }
}
