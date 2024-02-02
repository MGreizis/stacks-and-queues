public class Queue<T extends Comparable<T>> extends SLL<T> {
   public void enqueue(T data) {
      addHead(data);
   }

   public T dequeue() {
      return deleteHead();
   }

   public T peek() {
      return getHead();
   }

   public boolean isEmpty() {
      return size() == 0;
   }

   public int size() {
      return super.size();
   }
}
