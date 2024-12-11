class Solution {
    Node addNode(Node head, int p, int x) {
        Node ref=head;
        Node n1 =new Node(x);
        // if(p==-1){
        //   n1.next=ref;
        //   ref.prev=n1;
        //   return n1;
        // }
        for(int i=1;i<=p;i++){
            ref=ref.next;
        }
        n1.next=ref.next;
        ref.next=n1;
        n1.prev=ref;
        if(n1.next!=null){
            n1.next.prev=n1;
        }
        return head;
    }
}
