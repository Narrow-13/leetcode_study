class Solution {
    public boolean isValid(String s) {
        int i;
        char[] in = s.toCharArray();
        Stack<Character> out = new Stack<>();
        
        for (i=0; i<in.length; i++) {
            if (in[i] == '(') {
                out.push(')');
            }
            else if (in[i] == '[') {
                out.push(']');
            }
            else if (in[i] == '{') {
                out.push('}');
            }
            else if (in[i] == ')' || in[i] == ']' || in[i] == '}') {
                if (out.empty() || out.pop() != in[i]) {
                    return false;
                }
            }
        }
        return out.empty();
    }
}