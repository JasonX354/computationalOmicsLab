public class SuperArray {
  private int size;
  private String[] data;

  public SuperArray() {
    data = new String[10];
    size = 0;
  }
  public SuperArray(int initialCapacity) {
    if (initialCapacity < 0) {
      throw new IllegalArgumentException("initial capacity is negative (SuperArray(int))");
    }
    data = new String[initialCapacity];
    size = 0;
  }
  public int size() {
    return size;
  }
  public boolean add(String value) {
    if (!(size < data.length)) {
      resize();
    }
    data[size] = value;
    size ++;
    return true;
  }
  public String toString() {
    String string = "[";
    for (int x = 0; x < size; x ++) {
      string += data[x];
      if (x < size - 1) {
        string += ", ";
      }
    }
    return string + "]";
  }
  public String get(int index) {
    if (index >= 0 && index < size) {
      return data[index];
    }
    else {
      throw new IndexOutOfBoundsException("Index out of bounds (get())");
    }
  }
  public String set(int index, String element) {
    if (index >= 0 && index < size) {
      String string = data[index];
      data[index] = element;
      return string;
    }
    else {
      throw new IndexOutOfBoundsException("Index out of bounds (set())");
    }
  }
  private void resize() {
    String[] x = new String[2 * size() + 1];
    for (int i = 0; i < size(); i++) {
      x[i] = get(i);
    }
    data = x;
  }
  public int indexOf(String target) {
    for (int index = 0; index <  size(); index++) {
      if (target.equals(get(index))) {
        return index;
      }
    }
    return -1;
  }
  public int lastIndexOf(String target) {
    int x = -1;
    for (int index = 0; index <  size(); index++) {
      if (target.equals(get(index))) {
        x = index;
      }
    }
    return x;
  }
  public void add(int index,String value) {
    int num = 0;
    String[] x = new String[size() + 1];
    if (index >= 0 && index <= size()) {
      for (int i = 0; i < index; i++) {
        x[i] = get(i);
        num++;
      }
      x[num] = value;
      for (int i = index; i < size(); i++) {
        x[i + 1] = get(i);
      }
      data = x;
      size ++;
    }
    else {
      throw new IndexOutOfBoundsException("Index is out of bounds (add())");
    }
  }
  public String remove(int index) {
    String[] x = new String[size()];
    int count = 0;
    String removed = get(index);
    if (index >= 0 && index < size()) {
      for (int i = 0; i < index; i++) {
        x[i] = get(i);
        count ++;
      }
      for (int i = index + 1; i < size(); i++) {
        x[count] = data[i];
        count ++;
      }
      data = x;
      size --;
      return removed;
    }
    else {
      throw new IndexOutOfBoundsException("Index is out of bounds (remove())");
    }
  }
  public boolean remove(String target) {
    String[] x = new String[size()];
    int count = 0;
    if (indexOf(target) == -1) {
      return false;
    }
    else {
      for (int index = 0; index < indexOf(target); index++) {
        x[index] = get(index);
        count ++;
      }
      for (int index = indexOf(target) + 1; index < size(); index++) {
        x[count] = data[index];
        count ++;
      }
      data = x;
      size --;
      return true;
    }
  }
}
