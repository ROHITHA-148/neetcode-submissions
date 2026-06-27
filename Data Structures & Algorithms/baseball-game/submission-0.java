class Solution {
    public int calPoints(String[] operations) {
        Stack<Integer> stack=new Stack<>();
        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("C")){
                stack.pop();
            }
            else if(operations[i].equals("D"))
            {
                int p=stack.peek();
                p=p*2;
                stack.push(p);
            }
            else if(operations[i].equals("+")){
                int p1=stack.peek();
                stack.pop();
                int p2=stack.peek();
                stack.push(p1);
                p2=p2+p1;
                stack.push(p2);
            }
            else{
                stack.push(Integer.parseInt(operations[i]));
            }
        }
        int sum=0;
        while(!stack.isEmpty()){
           sum=sum+stack.peek();
           stack.pop();
        }
        return sum;
    }
}