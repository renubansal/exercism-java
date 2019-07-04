import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

class HandshakeCalculator {

   private String decimalToBinary (int number){
       return Integer.toString(number,2);
   }
    
    List<Signal> calculateHandshake(int number) {
        List<Signal> newlist = new ArrayList<>();
        
        String binaryNumber = decimalToBinary(number);
        int i,length = binaryNumber.length() - 1;
        
        for(i = length ; i >= 0 ; i--){
            int x = length  - i;
            if(i == 0 & length==4){
                Collections.reverse(newlist);
            }
            else if(binaryNumber.charAt(i) == '1'){
                newlist.add(Signal.values()[x]);
            }                   
        }
        return newlist;
    }
}
