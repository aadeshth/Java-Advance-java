package com.advance.collection.list;

public class DoublyLinkedList {
    Node head;
    Node tail;

    public DoublyLinkedList(){
        this.tail=null;
        this.head=null;
    }
    public void addFirst(int data)
    {
        Node temp = new Node(data);
        if(head==null)
        {
            head = temp;
            tail = temp;
        }else
        {
            temp.next = head;
            head.prev = temp;
            head = temp;
        }
    }

    public void addLast(int data)
    {
        Node temp = new Node(data);
        if(tail == null)
        {
            head = temp;
            tail = temp;
        }else
        {
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
    }


    public void set(int position, int data)
    {
        Node newNode = new Node(data);
        if(position == 1)
        {
            addFirst(data);
        }else {

        Node temp = new Node();
        temp = head;
        for(int n= 1; n<position-1;n++)
        {
            temp = temp.next;
        }

        if(temp != null)
            {
                temp.next = newNode;
                newNode.prev = temp;
                newNode.next = temp.next;
                temp.next.prev = newNode;
            }
        }
    }


     public void delete(int position)
     {
         Node temp ;
         temp = head;
         for(int n= 1; n<position-1;n++)
         {
             temp = temp.next;
         }
         if(temp.next ==null)
         {
             System.out.println("cant delete");
         }if(temp.next.next == null)
        {
            temp.next = null;
         }else {
              Node nod = temp.next;
              nod.next.prev =temp;
              temp.next = nod.next;
     }
     }
     

}
