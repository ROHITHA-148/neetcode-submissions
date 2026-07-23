class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> s=new Stack<>();
        int result=0;
        for(String c:tokens){
        if(c.equals("+") || c.equals("*") || c.equals("-") || c.equals("/")){
           int n1=s.peek();
            s.pop();
            int n2=s.peek();
            s.pop();
            switch(c){
                case "*":
                {
                   result= n2*n1;
                   break;
                }
                case "/":
                {
                   result= n2/n1;
                   break;
                }
                case "-":
                {
                   result= n2-n1;
                   break;
                }
                case "+":
                {
                   result= n2+n1;
                   break;
                }
            }
            s.push(result);
        }
        else {
           s.push(Integer.parseInt(c));
        }
        }
        return s.peek();
    }
}
