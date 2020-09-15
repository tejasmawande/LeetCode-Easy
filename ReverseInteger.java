class Solution {
    public int reverse(int x) {
        
        int rever_num = 0;
        int prev_num = 0;
        
        boolean negativeFlag = false;
        if( x<0 ){
            negativeFlag = true;
            x = -x;
        }
        
        while(x!=0){
            int curr_digit = x%10;
            rever_num = (rever_num *10) + curr_digit ;
            
            if((rever_num - curr_digit)/10 != prev_num){
             System.out.println("Sytem Overloaded");
                 return 0;
            }
            prev_num = rever_num;
            x = x /10;
           
        }  
        return negativeFlag? -rever_num:rever_num;
        
    }
    
}
