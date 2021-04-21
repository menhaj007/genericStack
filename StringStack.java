public class StringStack {
    private String[] data;
    private int topIndexLocation;


    public StringStack(int defaultCapacity) {
        data = new String[defaultCapacity];
    }
    public boolean isEmpty() {
        return (topIndexLocation == -1);
         //if (topIndexLocation == -1) {
          //   return false;
         // } else {
            // return true;
        //}
    }
    public boolean isFull() {
        return (topIndexLocation == data.length-1);
        // if (topIndexLocation == data.length -1) {
         //   return true;
        // } else {
         //   return false;
        // }
    }

    public void push(String value) {
        if (!isFull()) {
            topIndexLocation++;
            data[topIndexLocation] = value;
        } else {
            throw new IndexOutOfBoundsException("Stack is full");
        }
       // if (!isFull()) data[++topIndexLocation] = value ;
    }
    public void pop() {
        if (!isEmpty()) {
            data[topIndexLocation] = null;
            topIndexLocation--;
        } else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }
    //second version, you can use pop to return data too.
//    public T pop() {
//        if (!isEmpty()) {
//            T valueToBeRemove = data[topIndexLocation];
//            data[topIndexLocation] = null;
//            topIndexLocation--;
//            return valueToBeRemove;
//        } else {
//            return null;
//        }
//    }
    public String top() {
        if (isEmpty()) return null;
        return data[topIndexLocation];
    }
    public int size() {
        return topIndexLocation+1;
    }

}
