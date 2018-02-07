package rmuti.Tree;


import rmuti.ds.Node;
import rmuti.ds.TreeDraw;

public class App2 
{
    public static void main( String[] args )
    {
         
            Node e = new Node("e",null,null); 
            Node d = new Node("f",null,null);
            
            Node c = new Node("c",null,null);
            Node b = new Node("a",e,d);
           
            Node root = new Node ("a",b,c);
            
            TreeDraw drawTree = new TreeDraw(root);
            drawTree.binaryTreeDraw();
          }
}
