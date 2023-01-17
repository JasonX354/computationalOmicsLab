public class MyLinkedList{
  private int size;
  private ListNode front,back;

  //You will only write the no argument Constructor, as you do not have a capacity.
  public MyLinkedList(){
    size = 0;
    front = null;
    back = null;
  }

  public int size(){
    //Returns the number of elements in this list.
    return size;
  }


  public String get(int index){
    //Return the value at the specified index.
    ListNode cycle = front;
    for (int x = 0; x < index; x++) {
      cycle = cycle.next();
    }
    return cycle.getData();
  }


  public boolean add(String e){
    //Appends the specified element to the end of this list.
    ListNode addition = new ListNode(e);
    if (size == 0) {
      //set front listnode data to e
      //set back listnode data to e
      front = addition;
      back = addition;
    }
    else if (size == 1) {
      addition.setPrev(front);
      front.setNext(addition);
      back = addition;
    }
    else {
      addition.setPrev(back);
      back.setNext(addition);
      back = addition;
    }
    size ++;
    /*
    System.out.println("front: " + front);
    System.out.println("back: " + back);
    System.out.println(front.next());
    */
    return true;
  }

  public String toString(){
    //same format as ArrayList "[A, B, C]" or "[]"
    String output = "[";
    if (size == 0) {}
    else {
      ListNode cycle = front;
      while (cycle.next() != null) {
        output += cycle.getData();
        if (size != 1) {
          output += ", ";
        }
        cycle = cycle.next();
      }
      output += back.getData();
    }
    return output + "]";
  }


   public void add(int index, String element){
    //Inserts the specified element at the specified position in this list.
    if (size == 0) {
      add(element);
    }
    else {
      ListNode addition = new ListNode(element);
      if (index <= 0) {
        addition.setNext(front);
        front.setPrev(addition);
        front = addition;
      }
      else if (index >= size()) {
        addition.setPrev(back);
        back.setNext(addition);
        back = addition;
      }
      else {
        ListNode cycle = front;
        for (int x = 0; x < index - 1; x++) {
          cycle = cycle.next();
        }
        addition.setNext(cycle.next());
        cycle.next().setPrev(addition);
        cycle.setNext(addition);
        addition.setPrev(cycle);
      }
      size ++;
    }
  }

   public String set(int index, String value){
    //Replaces the value at the specified index in this list with the specified value.
    //Return the original String that was present
    ListNode cycle = front;
    String output;
    for (int x = 0; x < index; x++) {
      cycle = cycle.next();
    }
    output = cycle.getData();
    cycle.setData(value);
    return output;
  }

  public boolean contains(String element){
    //Returns true if this list contains the specified element, false otherwise.
    ListNode cycle = front;
    while (cycle != null) {
      if (cycle.getData().equals(element)) {
        return true;
      }
      cycle = cycle.next();
    }
    return false;
  }

  public String remove(int index){
    //Removes the element at the specified position in this list..
    if (size == 0) {
      return "Nothing to remove!";
    }
    else {
      String output = "";
      if (index <= 0) {
        output = front.getData();
        front = front.next();
        front.setPrev(null);
      }
      else if (index >= size() - 1) {
        output = back.getData();
        back = back.prev();
        back.setNext(null);
      }
      else {
        ListNode cycle = front;
        for (int x = 0; x < index - 1; x++) {
          cycle = cycle.next();
        }
        output = cycle.next().getData();
        cycle.next().next().setPrev(cycle);
        cycle.setNext(cycle.next().next());

      }
      size --;
      return output;
    }
  }

  public boolean remove(String element){
    //Removes the first occurrence of the specified element from this list, if it is present..
    if (front.getData().equals(element)) {
      front = front.next();
      front.setPrev(null);
      return true;
    }
    if (back.getData().equals(element)) {
      back = back.prev();
      back.setNext(null);
      return true;
    }
    ListNode cycle = front;
    while (cycle.next() != null) {
      if (cycle.getData().equals(element)) {
        cycle.prev().setNext(cycle.next());
        cycle.next().setPrev(cycle.prev());
        return true;
      }
      cycle = cycle.next();
    }
    return false;
  }


}
