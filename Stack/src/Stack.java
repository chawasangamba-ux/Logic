class Stack {

    int arr[];
    int topOfStack;

    public Stack(int Size) {
        this.arr = new int[Size];
        topOfStack = -1;
        System.out.println("The stack has been created of size " + Size);
    }

    public boolean isEmpty() {
        if (topOfStack == -1) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isFull() {
        if (topOfStack == arr.length - 1) {
            return true;
        } else {
            return false;
        }
    }

    public void push(int value) {
        if (isFull()) {
            System.out.println("The stack is full");
        } else {
            arr[topOfStack + 1] = value;
            topOfStack++;
            System.out.println("The value has been sucessfully been inserted");
        }
    }

    public int pop() {
        if (isEmpty()) {
            return -1;
        } else {
            int valueTopOfStack = arr[topOfStack];
            topOfStack--;
            return valueTopOfStack;
        }
    }
    public int peek(){
        if(isEmpty()) {
            System.out.println("The ;stack is empty!");
            return -1;
        }else{
            return arr[topOfStack];
        }
    }
    public void deleteStack(){
        arr = null;
        System.out.println("The stack is successfully deleted");
    }
    public  void printStack(){
        if(isEmpty()){
            System.out.println("the stack is empty");
        }
        System.out.println("Stack values(top to bottom):");
        for (int i =topOfStack; i>=0; i--){
            System.out.println(arr[i]);
        }
    }
}



