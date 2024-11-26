class Node {
    int data;
    Node next;
    Node(int value) {
        this.value = value;
    }
}

*/

class Solution {
    // Function to reverse a linked list.
    Node reverseList(Node head) {
        // code here
        //System.out.println(head.data);
        Node rev2=null,rev1=null,temp=head;
        while(temp!=null){
            rev2=temp.next;
            temp.next=rev1;
            rev1=temp;
            temp=rev2;
        }
        
        return rev1;
    }
    
}
