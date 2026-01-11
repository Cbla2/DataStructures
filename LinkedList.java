public class LinkedList<T> {
  private class Node<T> {
    private T data;
    private Node<T> next;

    private Node(T data) {
      this.data = data;
      this.next = next;

    }
  }
   private Node<T> head;
    private Node<T> tail;

    public void add(T data) {
      Node<T> newNode = new Node<>(data);
      if(head == null){
        head = newNode;
        tail = newNode;
      }
      else {
        tail.next=newNode;
        tail = newNode;
      }
    }
    public void print() {
      Node<T> current = head;
      while(current != null){
        System.out.println(current.data);
        current = current.next;

      }
    }
}