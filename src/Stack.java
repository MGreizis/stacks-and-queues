public class Stack<T extends Comparable<T>> extends SLL<T> {
   public void push(T data) {
      addHead(data);
   }

   public T pop() {
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
