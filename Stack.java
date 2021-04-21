public class Stack<T> {
    private T[] data;
    private int topIndexLocation;

    @SuppressWarnings("uncheck")
    public Stack(int defaultCapacity) {
        data = (T[]) new Object[defaultCapacity];
        topIndexLocation = -1;
    }
    public boolean isEmpty() {
        return (topIndexLocation == -1);
         // if (topIndexLocation == -1) {
         //     return false;
         // } else {
         //     return true;
        // }
    }
    public boolean isFull() {
        return (topIndexLocation == data.length-1);
        // if (topIndexLocation == data.length -1) { // topIndexLocation equals to the index of the last element
        //     return true;
        // } else {
        //     return false;
        // }
    }

    public void push(T value) {
        if (!isFull()) {
            topIndexLocation++;
            data[topIndexLocation] = value;
        } else { // This is not necessary, but adding it will help you to see the error
          throw new IndexOutOfBoundsException("Stack is full");
        }
        //if (!isFull()) data[++topIndexLocation] = value ;//if you prefer one line.
        // Since this is a void method you don't need the else condition
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
    //public T pop() {
    //    if (!isEmpty()) {
    //      T valueToBeRemove = data[topIndexLocation];
    //      data[topIndexLocation] = null;
    //      topIndexLocation--;
    //      return valueToBeRemove;
    //  } else {
    //      return null;
    //  }
    //}
    public T top() {
        if (isEmpty()) return null;
        return data[topIndexLocation];
    }
    public int size() {
        return topIndexLocation+1;
    }


}
