class LuhnValidator {
  private boolean checkLength(String str){
          return str.length() <= 1;
    }
    
    private boolean checkIfItContainsCharacterOtherThanDigits(String str){
        return !str.matches("\\d+");
    }
    
    private int secondDigitInfo(char ch){
        int number = Character.getNumericValue(ch);
        number = 2 * number;
        return  (number > 9)?(number-9):number;
    }
    
    boolean isValid(String candidate) {
        candidate = candidate.replace(" ","");
        if(checkLength(candidate))
            return false;
        
        if(checkIfItContainsCharacterOtherThanDigits(candidate))
            return false;
        
        int i,sum = 0,number;
        for(i = candidate.length()-1 ; i >=0 ; i = i - 2)
        {           
            number = Character.getNumericValue(candidate.charAt(i));
            sum += number;
            if(i >0 ){
                sum += secondDigitInfo(candidate.charAt(i-1));
            }
        }
        return sum%10 == 0;
    }
}
