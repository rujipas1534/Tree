package rmuti.Tree;

import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class TestApp2 
{
    public static void main( String[] args )
    {
         
                        
            
            Node f = new Node("f",null,null);
            Node g = new Node("g",null,null);
            Node f1 = new Node("f",null,null);
            Node i = new Node("i",null,null);
            Node h = new Node("h",null,null);
           
            Node e = new Node("e",h,i);
            Node b = new Node("b",e,f); 
            Node c = new Node("c",g,f1);
            
            Node root = new Node ("a",b,c);   
            
            TreeDraw drawTree = new TreeDraw(root);
            drawTree.binaryTreeDraw();
          }
}