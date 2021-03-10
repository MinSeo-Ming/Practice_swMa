package Beak;

import java.io.*;
import java.util.*;

public class tree_order {
    public static void main(String args[]) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int node = Integer.parseInt(br.readLine());

        tree t = new tree();
        char[] s;
        for(int i=0; i<node; i++){
            s = br.readLine().replaceAll(" ","").toCharArray();
            t.create(s[0],s[1],s[2]);
        }
        t.preorder(t.root);
        System.out.println();
        t.inorder(t.root);
        System.out.println();
        t.postorder(t.root);
        br.close();
    }
}
class Node{
    char d;
    Node left,right;
    public Node(char d){
        this.d = d;
    }
}
class tree{
    Node root;
    public void create(char d, char left, char right){
        if(root ==null){
            if(d !='.') root = new Node(d);
            if(left!='.') root.left = new Node(left);
            if(right!='.') root.right= new Node(right);
        }else search(root,d,left,right);
    }
    public void search(Node root, char d, char left, char right){
        if(root==null) return;
         else if(root.d==d){
            if(left!='.') root.left= new Node(left);
            if(right!='.')root.right= new Node(right);
        }else {
            search(root.left,d,left,right);
            search(root.right,d,left,right);
        }
    }
    public void preorder(Node n){
        if(n !=null){
            System.out.print(n.d);
            if(n.left!=null) preorder(n.left);
            if(n.right!=null) preorder(n.right);
        }
    }
    public void inorder(Node n){
        if(n !=null){
            if(n.left!=null) inorder(n.left);
            System.out.print(n.d);
            if(n.right!=null) inorder(n.right);
        }
    }
    public void postorder(Node n){
        if(n !=null){
            if(n.left!=null) postorder(n.left);
            if(n.right!=null) postorder(n.right);
            System.out.print(n.d);
        }
    }
}
