//public class Stack<T> {
//    private T[] data;
//    private int topIndexLocation;
//
//    @SuppressWarnings("uncheck")
//    public Stack(int defaultCapacity) {
//        data = (T[]) new Object[defaultCapacity]; //instantiating the stack array.
//        topIndexLocation = -1; // Before pushing value, the top-index points outside of the array.
//        // We it is incremented, -1 + 1 =0, will give the first index
//        //location and the new value will be added.
//        //topIndexLocation = 0; // This an alternative to setting to -1. If you chose to start from 0, then the value at data[0] will be inserted first, then increment the topIndexLocation for the next input.
//    }
//    public boolean isEmpty() {
//        return (topIndexLocation == -1); // This just weather topIndexLocation is true or false. Below is the alternative of way of writing
////         if (topIndexLocation == -1) {
////             return false;
////         } else {
////             return true;
////        }
//    }
//    public boolean isFull() {
//        return (topIndexLocation == data.length-1); // Check if the number of elements equals to the size of the array.
//        //Since topIndexLocation is set to -1, it is important to subtract 1 from data.length because index numbers start at 0.
//        //It is also common to start with topIndexLocation = 0. In this case, compare topIndexLocation == data.length.
////        if (topIndexLocation == data.length -1) { // topIndexLocation equals to the index of the last element
////            return true;
////        } else {
////            return false;
////        }
//    }
//
//    public void push(T value) {
//        if (!isFull()) {
//            topIndexLocation++; // Notice, the topIndexLocation is -1, to adding -1 + 1 = 0. Therefore topIndexLocation must become 0 for the first value to be inserted
////            System.out.println(topIndexLocation + " at location " + value); // add print statement to see result
//            data[topIndexLocation] = value;
//        } else { // This is not necessary, but adding it will help you to see the error
//            throw new IndexOutOfBoundsException("Stack is full");
//        }
////        if (!isFull()) data[++topIndexLocation] = value ;//if you prefer one line. Since this is a void method you don't need the else condition
//    }
//    public void pop() {
//        if (!isEmpty()) {
//            data[topIndexLocation] = null; // The point here is to remove the data from the array/stack. In fixed size stack, only topIndexLocation changes, so it important to remove the value from array before decrementing the topIndexLocation
//            topIndexLocation--; // This is equivalent to topIndexLocation = (topIndexLocation - 1);
//        } else {
//            throw new IndexOutOfBoundsException("Stack is empty");
//        }
//    }
//    //second version, you can use pop to return data too.
////    public T pop() {
////        if (!isEmpty()) {
////            T valueToBeRemove = data[topIndexLocation];
////            data[topIndexLocation] = null;
////            topIndexLocation--;
////            return valueToBeRemove;
////        } else {
////            return null;
////        }
////    }
//    public T top() {
//        if (isEmpty()) return null;
//        return data[topIndexLocation];
//    }
//    public int size() {
//        return topIndexLocation+1; // Since the topIndexLocation is set to -1, when it is incremented such as -1+1 = 0, the first value will go to index zero.
//        //Thus, topIndexLocation match the indices of the array, but we the size is required, then topIndexLocation +1 will give a size which counts from 1 up to the inserted elements.
//    }
//
//
//}
