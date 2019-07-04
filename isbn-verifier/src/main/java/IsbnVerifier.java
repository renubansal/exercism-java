public class IsbnVerifier {
	
	private boolean checkLength(String stringToVerify){
        return stringToVerify.length() == 10 | stringToVerify.length() == 11;
    }
    
    private boolean validity(String stringToVerify){
        return stringToVerify.matches("\\d{9}[X|0-9]");
    }
    
	private int getSum(String stringToVerify,int sum){
		int i,x;
		for(i = 0; i < stringToVerify.length() ; i++){
            x = Integer.parseInt(String.valueOf(stringToVerify.charAt(i)));
            sum += x*(10-i);
        }
		return sum;
	}
	
    boolean isValid(String stringToVerify) {
        stringToVerify = stringToVerify.replace("-","");
    
		if(!checkLength(stringToVerify))
            return false;
        
        if(!validity(stringToVerify))
            return false;
        
        int len = stringToVerify.length();
		int sum = 0;
		
		//if last character is 'X' then add
		if(stringToVerify.charAt(len-1) == 'X'){
            stringToVerify = stringToVerify.replace("X","");
            sum += 10;
        }
            
        return getSum(stringToVerify,sum)%11 == 0;      
    }
}
