class MyStack {

        Queue<Integer> queue1=new LinkedList<>();
        Queue<Integer> queue2=new LinkedList<>();
    public MyStack() {
        

    }
    
    public void push(int x) {
        queue1.offer(x);
    }
    
    public int pop() {
        int result=0;
        while(queue1.size()>=1){
            if(queue1.size()==1){
                result=queue1.poll();
            }
            else{
                int x=queue1.poll();
                queue2.offer(x);   
            }
        }
        while(!queue2.isEmpty()){
            int x=queue2.poll();
            queue1.offer(x);
        }
        return result;
    }
    
    public int top() {
        int result=0;
        while(queue1.size()>=1){
            if(queue1.size()==1){
                result=queue1.peek();
                queue1.poll();
                queue2.offer(result);
            }
            else{
                int x=queue1.poll();
                queue2.offer(x);   
            }
        }
        while(!queue2.isEmpty()){
            int x=queue2.poll();
            queue1.offer(x);
        }
        return result;
    }
    
    public boolean empty() {
        return queue1.isEmpty();
    }
}

/**
 * Your MyStack object will be instantiated and called as such:
 * MyStack obj = new MyStack();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.top();
 * boolean param_4 = obj.empty();
 */