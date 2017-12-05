import java.util.*;
import java.io.*;

class LinkedListNode{
  LinkedListNode next = null;
  int data;

  LinkedListNode(int d){
    data = d;
  }

  static void appendAtEnd(data){
    LinkedListNode endNode = new LinkedListNode(data);
    node = this;

    while(node.next!=null){
      node = node.next;
    }
    node.next = endNode;
  }

  // Q. 1 Delete Duplicates
  static void deleteDuplicate(LinkedListNode head){
    if(head == null) return;
    LinkedListNode current = head
    while(current != null){
      LinkedListNode runner = current
      while(runner.next != null){
        if(runner.next.data == current.data){
          runner.next =  runner.next.next;
        }
      }
      current = current.next;
    }
  }

  static void deleteDuplicate(LinkedListNode n){
    HashTable table = new HashTable();
    LinkedListNode prev = null;
    while(n != null){
      if(table.containsKey(n.data)){
        prev.next = n.next;
      }else{
        table.put(n.data, true);
        prev = n;
      }
      n = n.next;
    }
  }

  //Q.2 Find Kth Last  
  static void kthLast(LinkedListNode node, int k){
    if(k<=0) return null;

    LinkedListNode p1 = head;
    LinkedListNode p2 = head;
    for(int i=0; i<k; i++){
      p2 = p2.next;
    }
    if(p2 == null) return null;
    while(p2.next != null){
      p1 = p1.next;
      p2 = p2.next;
    }
    return p1;
  }

  //Q3. Delete given node
  static boolean deleteNode(LinkedListNode n){
    if(n == null || n.next == null) return false
    n.data = n.next.data;
    n.next = n.next.next;
    return true
  }

  // Q4. Partition LinkedList
  static void partionLinkedList(LinkedListNode node, int x){
    if(head == null) return head;
   
    LinkedListNode beforeStart = null;
    LinkedListNode beforeEnd = null;
    LinkedListNode afterStart = null;
    LinkedListNode afterEnd = null;
    
    while(node != null){
      if(node.data < x){
        if(beforeStart == null){
          beforeStart = node;
          beforeEnd = beforeStart;
        }
        else{
          beforeEnd.next = node;
        }
      } else{
        if(afterStart == null){
          afterStart = node;
          afterEnd = afterStart;
        }else{
          afterEnd.next = node;
        }
      }
      node = node.next;
    }
    if(beforeStart == null) return afterStart;
    beforeStart.next = afterStart;
    return beforeStart;
  }

  // Q5. Add LinkedList
  static void addLinkedList(LinkedListNode l1; LinkedListNode l2){
    int carry = 0;
    LinkedListNode l = null;
    while(l1 != null && l2! = null){
      sum = l1.data + l2.data + carry;
      l.data = sum % 10;
      carry = sum / 10;
      l1 = l1.next;
      l2 = l2.next;
      l = l.next;
    }
  }

  //Q6. Find start - Circular LinkedList
  static LinkedListNode findStart(LinkedListNode node){
    if(node == null) return null;
    LinkedListNode runner = node;
    while(node != null && node.next != null){
      if(runner == node) return node;
      runner = runner.next.next;
      node = node.next;
    }
    return 
  }

  // Q7. Check LinkedList is Palindrom or not
  static void checkPalindrom(int data){
    
  }

}
