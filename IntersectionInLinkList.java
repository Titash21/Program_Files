public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode ptr=headA;
        
        int length1=0, length2=0;
        while(ptr!=null){
            length1++;
            ptr=ptr.next;
        }
        ptr=headB;
        while(ptr!=null){
            length2++;
            ptr=ptr.next;
        }
        
        while(length1<length2)
        {
            headB=headB.next;
            length2--;
            
        }
        while(length2<length1)
        {
            headA=headA.next;
            length1--;
            
        }
        
        
        while(headA!=null && headB!=null)
        {
            if(headA!=headB)
            {
                headA=headA.next;
                headB=headB.next;
            }
            else
            {
                return headA;
            }
        }
            
        
        
        
            return null;
    
    }
}