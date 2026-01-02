class Solution {
    public static void reverseStack(Stack<Integer> st) {
        // code here
        
        if(st.isEmpty()){
            return;
        }
        int top=st.pop();
        reverseStack(st);
        insertatbot(st,top);
    }
    public static void insertatbot(Stack<Integer> st,int t){
        if(st.isEmpty()){
            st.push(t);
            return;
        }
        int top=st.pop();
        insertatbot(st,t);
        st.push(top);
    }
}
