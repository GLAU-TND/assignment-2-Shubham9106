/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem2.main;
// executable class
// use problem1.mybst.MyBinarySearchTree class for creating binary tree
public class MyMain {
    package problem02;
    public class PrePostTraversecheckMain {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            PrePostTraversecheck ob=new PrePostTraversecheck();
            ob.insert(40);
            ob.insert(50);
            ob.insert(30);
            ob.insert(35);
            ob.insert(100);
            ob.insert(90);
            ob.insert(12);
            ob.insert(34);
            System.out.println("PRE ORDER TRAVERSING");
            ob.traversePreOrder(ob.getRoot());
            System.out.println();
            System.out.println("POST ORDER TRAVERSING");
            ob.traversePostOrder(ob.getRoot());
            System.out.println("so both condtion are satisfy");
        }

    }
}
