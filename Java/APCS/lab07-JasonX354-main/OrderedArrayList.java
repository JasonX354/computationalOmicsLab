import java.util.ArrayList;
public class OrderedArrayList<T extends Comparable<T>> extends NoNullArrayList<T>{

  public OrderedArrayList() {
    super();
  }

  public OrderedArrayList(int size) {
    super(size);
  }

  private int whereToPlace(T value){
     /*return the index that the value should be placed
     when inserting into the OrderedArrayList .*/
     for (int i = 0; i < size(); i ++) {
       if (get(i).compareTo(value) > 0) {
         return i;
       }
     }
     return size();
   }

  @Override
  public boolean add(T x) {
    if (x == null) {
      super.add(null);
    }
    super.add(whereToPlace(x), x);
    return true;
  }

  public void add(int i, T x) {
    if (x == null) {
      super.add(null);
    }
    add(x);
  }

  public T set(int i, T x) {
    T removed = get(i);
    super.remove(i);
    add(x);
    return removed;
  }
}
