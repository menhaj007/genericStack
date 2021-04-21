public class Main {
    public static void main(String[] args) {
//        Stack<Integer> intStack = new Stack<>(3);
//        intStack.push(199);
//        intStack.push(200);
//
//        System.out.println(intStack.size());
//
//        System.out.println(intStack.top());
//        intStack.pop();
//        System.out.println(intStack.top());
//        intStack.pop();
        
        
//        intStack.push(200);
//        intStack.pop();
//        intStack.pop();
//        intStack.pop();
//        intStack.push(500);
//        System.out.println(intStack.isEmpty());
//        System.out.println(intStack.isFull());
//        System.out.println(intStack.top());
//        System.out.println(intStack.isFull() + ", isEmpty " + intStack.isEmpty());
//        System.out.println(intStack.top());
//        intStack.pop();
//        intStack.pop();
//        intStack.pop();
//        System.out.println(intStack.isEmpty());

//        Stack<String> stringStack = new Stack<>(4);
//        stringStack.push("Hello world");
//        System.out.println(stringStack.size());
////        stringStack.pop();
//        System.out.println(stringStack.size());
//        System.out.println(stringStack.isEmpty());
        StringStack st = new StringStack(1);
        st.push("Hello world");
        System.out.println(st.isFull());
        System.out.println(st.top());
        System.out.println(st.isEmpty());
        System.out.println(st.top());
        st.pop();


    }
}
