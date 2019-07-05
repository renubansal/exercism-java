import java.util.List;
import java.util.ArrayList;


class DiamondPrinter {
	private int changeCoordinates(int i, int num){
        if( i > num)
            return 2 * num - i;
        return i;
    }

    List<String> printToList(char a) {
        int initial = (int)'A';
        int  i , j , num = (int)a - initial + 1;
        
        ArrayList<String> patternString = new ArrayList<>(2*num-1);
        
        if(num == 1){
            patternString.add(Character.toString((char)a));
            return patternString;
        }
		
        for(i = 1 ; i <= 2*num-1 ; i++){              
            StringBuilder str = new StringBuilder();
        
            for(j = 1 ; j <= 2*num-1  ; j++){
                if( changeCoordinates(i,num) + changeCoordinates(j,num) == num + 1)
                    str.append(Character.toString((char)initial));
                else
                    str.append(" ");
                }
            if(i < num)
                initial++;
            else
                 initial--;            
            patternString.add(str.toString());
        }
        return patternString;
    }
    
}
