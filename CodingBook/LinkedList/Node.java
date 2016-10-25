import java.util.*;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
  }
  
  static void appendNode(Node head, int data){
    Node end = new Node(data);
    while(head != null){
      head = head.next;
    }
    end = head.next;
  }

  static void printNode(Node head){
    if(head == null){
      System.out.println("Empty Linked List");
    }
    while(head!=null){
      System.out.println(n.data);
      head = head.next;
    }
  }
  static Node deleteNode(Node head, int data){
    if(head != null){
      return null;
    }
    while(head.next != null){
      head.next = head.next.next;
    }
    return head;
  }

  public static void main(String args[]){
    Node head = null;
    Scanner in = new Scanner(System.in);
    int N;
    N = in.nextInt();
    for(int i=0; i<N; i++){
      append(head, in.nextInt());
    }
  }
}