class ArmstrongNumbers {  
    
    private int check(int number){
        int res = 0;
        int length = String.valueOf(number).length();
		while(number > 0){
            res += Math.pow(number % 10,length);           
            number = number /10;
		}
        return res;
    }
    
    boolean isArmstrongNumber(int numberToCheck) {
	
        return numberToCheck == check(numberToCheck);
    }
}