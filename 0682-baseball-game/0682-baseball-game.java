class Solution {
    public int calPoints(String[] operations) {

        Stack<Integer> st = new Stack<>();
        for(int i=0;i<operations.length;i++){
            String op=operations[i];
            if(op.equals("C")){
                st.pop();
            }
            else if(op.equals("D")){
                st.push(st.peek()*2);
            }
            else if(op.equals("+")){
                int prev1 = st.pop();
                int prev2 = st.peek();
                int next = prev1+prev2;

                st.push(prev1);
                st.push(next);
            }
            else{
                st.push(Integer.parseInt(op));
            }
        }
        int sum=0;
        while(st.size()>0){
            sum+=st.pop();
        }
        return sum;
        
    }
}