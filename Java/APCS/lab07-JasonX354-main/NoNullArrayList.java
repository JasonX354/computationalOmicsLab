import java.util.ArrayList;
public class NoNullArrayList<T> extends ArrayList<T>{
  
  public NoNullArrayList() {
    super();
  }

  public NoNullArrayList(int size) {
    super(size);
  }

  @Override

  public boolean add(T x) {
    if (x == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.add(x);
    }
  }

  public void add(int i, T x) {
    if (x == null) {
      throw new IllegalArgumentException();
    }
    else {
      super.add(i, x);
    }
  }

  public T set(int i, T x) {
    if (x == null) {
      throw new IllegalArgumentException();
    }
    else {
      return super.set(i, x);
    }
  }
}
