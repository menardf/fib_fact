/**
 * Created by IntelliJ Idea.
 * User: Menard Feko
 * Date: 2/11/18
 * Time: 6:31 PM
 * Contact: fekomenard@yahoo.fr
 * .java was created for...
 */
public class recursiveBinarytree {
        Node root;

        // Tree Node
        static class Node {
            int data;
            Node left, right;
            Node(int data)
            {
                this.data = data;
                this.left = null;
                this.right = null;
            }
        }

        // Function to insert nodes in level order
        public Node insertLevelOrder(int[] arr, Node root,
                                     int i)
        {
            // Base case for recursion
            if (i < arr.length) {
                Node temp = new Node(arr[i]);
                root = temp;

                // insert left child
                root.left = insertLevelOrder(arr, root.left,
                        2 * i + 1);

                // insert right child
                root.right = insertLevelOrder(arr, root.right,
                        2 * i + 2);
            }
            return root;
        }

        // Function to print tree nodes in InOrder fashion
        public void inOrder(Node root)
        {
            if (root != null) {
                inOrder(root.left);
                System.out.print(root.data + " ");
                inOrder(root.right);

            }

        }
    // Function to print tree nodes in preOrder fashion
        public void preOrder(Node root){
            if(root != null){
                System.out.print(root.data +" ");
                preOrder(root.left);
                preOrder(root.right);

            }
        }
    // Function to print tree nodes in postOrder fashion
        public void postOrder(Node root){

            if(root != null){
                postOrder(root.right);
                postOrder(root.left);
                System.out.print(root.data +" ");
            }
        }


        // Driver program to test above function
        public static void main(String args[])
        {
            recursiveBinarytree t2 = new recursiveBinarytree();
            int arr[] = {47,32,59,62,21};
            t2.root = t2.insertLevelOrder(arr, t2.root, 0);
            t2.inOrder(t2.root);
            System.out.println("");
            t2.preOrder(t2.root);
            System.out.println("");
            t2.postOrder(t2.root);

        }
    }

