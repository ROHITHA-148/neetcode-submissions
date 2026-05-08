class Solution {
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character,Character> mapBrackets=new HashMap<>();
        mapBrackets.put(')','(');
        mapBrackets.put(']','[');
        mapBrackets.put('}','{');
        for(char c: s.toCharArray()){
            if(mapBrackets.containsKey(c)){
            if(!stack.isEmpty() && stack.peek()==mapBrackets.get(c)){
               stack.pop();
            }
            else{
                return false;
            }
        }
        else{
            stack.push(c);
        }
        }

        return stack.isEmpty();
    }
}
