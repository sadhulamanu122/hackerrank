import java.io.*;
import java.util.*;
class Node{
    int data;
    Node prev;
    Node next;
}

public class Solution {
    Node head;
     void enqueue(int x)
     {
         Node n=new Node();
         n.data=x;
        if(head==null)
        {
            head=n;
            head.next=null;
            head.prev=null;
        }
         else
         {
            n.next=head;
             n.prev=null;
             head.prev=n;
         }
     }
    int dequeue()
    {
         int k=head.data;
      Node temp;
       temp=head;
        head=head.prev;
        temp.prev=null;
        if(head!=null)
            head.next=null;
        return k;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Solution s=new Solution();
        Scanner sc=new Scanner(System.in);
        int t=sc.nextInt();
        for(int it=0;it<t;it++)
        {
           if(sc.next().equals("Enqueue"))
           {
               s.enqueue(sc.nextInt());
           }
            else
            {
                if(s.head==null)
                {
                    System.out.println("Empty");
                }
                else
                {
                    System.out.println(s.dequeue());
                }
            }
        }
    }
}
