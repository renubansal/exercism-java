class RaindropConverter {
    
    private boolean isNegative(int number){
        return number <0;
    }
    private boolean isMultipleof3(int number){
        return number%3 == 0;
    }
    private boolean isMultipleof5(int number){
        return number%5 == 0;
    }
    private boolean isMultipleof7(int number){
        return number%7 == 0;
    }
    private boolean notMultipleof357(int number){
        return number%3 != 0 & number%5 != 0 & number%7 != 0;
	}
    String convert(int number) {

        String convertStr = new String();
        if(notMultipleof357(number))
			return String.valueOf(number);
        
        if(isMultipleof3(number))
            convertStr += "Pling";
        if(isMultipleof5(number))
            convertStr += "Plang";
        if(isMultipleof7(number))
            convertStr += "Plong";
        if("".equals(convertStr))
            String.valueOf(number);
        return convertStr;     
    }
}
