class MinStack {

    int min;
    Stack<Integer> stack=new Stack<>();
    Stack<Integer> minS=new Stack<>();

    public MinStack() {
        
    }
    
    public void push(int val) {
        stack.push(val);

        if(minS.isEmpty() || val<=minS.peek()){
            minS.push(val);
        }
    }
    
    public void pop() {
        if(!stack.isEmpty()){
        int x=stack.pop();
        if(minS.peek()==x){
            minS.pop();
        }
        }


    }
    
    public int top() {
        if(!stack.isEmpty()){
       return stack.peek();
      }
      else {
        return 0;
      }
    }
    
    public int getMin() {
       return minS.peek();
    }
    
}
