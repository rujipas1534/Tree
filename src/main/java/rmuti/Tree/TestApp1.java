package rmuti.Tree;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class TestApp1 
{
    public static void main( String[] args )
    {
         
                        
            Node e = new Node("e",null,null);
            Node f = new Node("f",null,null);
            Node g = new Node("g",null,null);
            Node f1 = new Node("f",null,null);
            
            Node b = new Node("b",e,f); 
            Node c = new Node("c",g,f1);
            Node root = new Node ("a",b,c);   
            
            TreeDraw drawTree = new TreeDraw(root);
            drawTree.binaryTreeDraw();
          }
}