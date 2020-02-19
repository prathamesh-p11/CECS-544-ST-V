/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package binarytree;

public class BinaryTree {
  
    double[] lines =  new double[200];
    
    
   private Node root;
   
   public BinaryTree(){
      
	root = null;
    }
	
    public void insert(int val){
        root=insert(root, val);
    }

    public void printPostOrder(){
            printPostOrder(root);
    }

    public void printInOrder(){
            printInOrder(root);
    }

    public void printPreOrder(){
            printPreOrder(root);
    }

    public int size(){
            return size(root);
    }

    public int maxDepth(){
            return maxDepth(root);
    }

    public boolean isBST(){
            return isBST(root, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private	boolean isBST(Node node, int min, int max){
        lines[51]++;
        if(node == null)
        {   lines[52]++;  return true;}
        lines[54]++;
        if(node.data<min || node.data>max) 
        {          return false;}
        lines[57]++;
        return isBST(node.left, min, node.data) &&
                   isBST(node.right, node.data, max);
    }
    private Node NewNode(int val){
        Node root = new Node();
        root.data = val;
        root.left = null;
        root.right = null;
        return root;
	}
    private void printInOrder(Node node){
        lines[69]++;
        if(node == null) {
            lines[70]++;
            return;
        }
        printInOrder(node.left);
        System.out.println(node.data);
        printInOrder(node.right);
	}

    private void printPostOrder(Node node){
       lines[79]++;
        if(node == null)
        {   lines[82]++; return;
        }
        printInOrder(node.left);
        printInOrder(node.right);
        System.out.println ( node.data );
    }
    private void printPreOrder(Node node) {
       lines[88]++;
        if(node==null){lines[89]++;
           return;
        }
        System.out.println(node.data);
        printPreOrder(node.left);
        printPreOrder(node.right);
	}


    private int size(Node node){
       lines[99]++;
        if(node==null){  lines[100]++;
           return 0;
        }
        else {lines[103]++;
           return (size(node.left) + 1 + size(node.right));
        }
    }

    private Node insert(Node node, int val){
      lines[109]++;
	if(node==null){lines[110]++;
            return NewNode(val);
        }
	lines[113]++;
        if(val <= node.data ){ lines[114]++;
           node.left = insert(node.left, val);
        }
        else {lines[117]++; node.right = insert(node.right, val);
        }
        lines[119]++;
        return node;
	}
    private int maxDepth(Node node){
        lines[124]++;
        if(node==null){
            lines[125]++; return 0;
        }
        else
        {   lines[128]++;
            int leftDepth = maxDepth(node.left);
            int rightDepth = maxDepth(node.right);
            lines[131]++;
             if(leftDepth>rightDepth){
                lines[133]++;
                return leftDepth+1;
            }
            else {lines[136]++;
                return rightDepth+1;
            }
        }
    }
   public void Branch()
    {
        //printBranchNum(lines[], lines[], );
        
        printBranchNum(lines[52], lines[51], 51);
        printBranchNum(0, lines[54], 54);
        printBranchNum(lines[70], lines[69], 69);
        printBranchNum(0, lines[79], 79);
        printBranchNum(lines[89], lines[88], 88);
        printBranchNum(lines[100], lines[99], 99);
        printBranchNum(lines[103], lines[109], 103);
        printBranchNum(lines[114], lines[113], 113);
        printBranchNum(lines[117], lines[119], 117);
        printBranchNum(lines[125], lines[124], 124);
        printBranchNum(lines[128], lines[124], 128);
        printBranchNum(lines[133], lines[131], 131);
        printBranchNum(lines[136], lines[131], 136);
                
                
       //printBranchNum(lines[], lines[], 69);
    }

    public void printBranchNum(double t1,double t2,int linenum)
    {
        System.out.println("Branch at line"+ linenum+" taken "+ (t1/t2) + "%");
    } 

}