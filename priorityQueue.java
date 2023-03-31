public interface priorityQueue<E extends Comparable<E>> {
    //Creacion de la interfance PriorityQueue
    public E getFirst();
    public boolean isEmpty();
    public int size();
    public void clear();
    public void add(E value);
    public E remove();
  }
