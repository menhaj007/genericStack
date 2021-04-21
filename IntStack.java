public class IntStack {
    private int[] data;
    private int topIndexLocation;

    public IntStack(int defaultCapacity) {
        data = new int[defaultCapacity]; //instantiating the stack array.
        topIndexLocation = -1;
        // Initially, the top-index position points outside of the array.
        // When the push method is called, the topIndexLocation gets incremented first such
        // as -1 + 1 =0, will give the first index then the new value will be added.
        //topIndexLocation = 0; // This an alternative to setting index to -1. If you chose
        // to start from 0, then the value at data[0] will be inserted first,
        // then the topIndexLocation get incremented.
    }
    public boolean isEmpty() {
        return (topIndexLocation == -1);
        // This compares topIndexLocation against -1 and returns either true or false.
        // Below is the alternative of way of writing line 16
         //if (topIndexLocation == -1) {
             //return true;
         //} else {
           //  return false;
        //}
    }
    public boolean isFull() {
        return (topIndexLocation == data.length-1);
    }

    public void push(int value) {
        if (!isFull()) {
            topIndexLocation++;
            // Notice, the topIndexLocation is -1. Adding -1 + 1 = 0.
            // Therefore topIndexLocation must become 0 for the first value to be inserted
           // System.out.println(topIndexLocation + " at location " + value);
            // add print statement to see result
            data[topIndexLocation] = value;
        } else { // This is not necessary, but adding it will help you to see the error
            throw new IndexOutOfBoundsException("Stack is full");
        }
        //if (!isFull()) data[++topIndexLocation] = value;
        // if you prefer one line. Since this is a void method you don't need the else condition
    }
    public void pop() {
        if (!isEmpty()) {
            topIndexLocation--;
            // This is equivalent to topIndexLocation = (topIndexLocation - 1);
        } else {
            throw new IndexOutOfBoundsException("Stack is empty");
        }
    }
    //second version, you can use pop to return data too.
    //public int pop() {
    //  if (!isEmpty()) {
    //      int valueToBeRemove = data[topIndexLocation];
    //      data[topIndexLocation] = 0; // int not is not object.
    //      topIndexLocation--;
    //      return valueToBeRemove;
    //  } else {
    //      throw new IndexOutOfBoundsException("Stack is empty");
    //  }
    //}
    public int top() {
        if (isEmpty()) throw new IndexOutOfBoundsException("Stack is empty, no top value exist");
        return data[topIndexLocation];
    }
    public int size() {
        return topIndexLocation+1;
        // Since the topIndexLocation is set to -1, and it increments with the index numbers,
        // in order to get data.lengthy, we will add 1. Ex. The last array index location is
        // data.length-1, but to get the data.length.
        //Thus, topIndexLocation match the indices of the array, but when the size is required,
        // then topIndexLocation +1 will give a size which counts from 1 up to the inserted elements.
    }
}
