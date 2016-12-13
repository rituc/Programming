import java.util.*;

class Node{
  int data;
  Node next;

  Node(int data){
    this.data = data;
    this.next = null;

  }
  
  static void appendNode (Node head, int data){
    Node end = new Node(data);
    while(head.next != null){
      head = head.next;
    }
    head.next = end;
  }

  static void printList (Node head){
    if(head == null){
      System.out.println("Empty Linked List");
    }
    while(head!=null){
      System.out.println(head.data);
      head = head.next;
    }
  }

  public static void main(String args[]){
    Node head = null;
    Scanner in = new Scanner(System.in);
    int N;
    System.out.println("Enter number of elements");
    N = in.nextInt();

    for(int i=0; i<N; i++){
      if(head == null) {
        head = new Node(in.nextInt());
      } else {
        appendNode(head, in.nextInt());
      }
      printList(head);
    }

    List<Integer> list = new ArrayList<>();
  }
}