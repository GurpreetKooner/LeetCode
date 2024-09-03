class Solution {
    public boolean isValid(String s) {

        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));

        for (int i = 1; i < s.length(); i++) {

            char b = s.charAt(i);
            switch (b) {
                case '(':
                case '{':
                case '[':
                    stack.push(b);
                    break;
                case ')':
                    if (!stack.isEmpty() && stack.peek()=='(') {
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case '}':
                    if (!stack.isEmpty() && stack.peek()=='{') {
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
                case ']':
                    if (!stack.isEmpty() && stack.peek()=='[') {
                        stack.pop();
                    }else{
                        return false;
                    }
                    break;
            }

        }

        if(stack.isEmpty()){
            return true;
        }
        return false;

    }
}