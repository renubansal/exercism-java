class NaturalNumber {
    private int number;
	
    NaturalNumber(int number){
        if(number <=0)
            throw new IllegalArgumentException("You must supply a natural number (positive integer)");
        this.number = number;
    }
	
	
    
	private int computeDigitSum(int number){
		int i,sum=0;
        for(i = 1 ; i < number ; i++){
            if(number%i == 0){
                sum +=i;
            }
        }
		return sum;
	}
	
	private boolean isEqual(int sumOfNumber){
		return this.number == sumOfNumber;
	}
	private boolean isSmaller(int sumOfNumber){
		return this.number < sumOfNumber;
	}
	private boolean isGreater(int sumOfNumber){
		return this.number < sumOfNumber;
	}
	
    Classification getClassification(){
		int sum = computeDigitSum(number);
        if(isEqual(sum))
            return Classification.values()[1];
        else if(isGreater(sum))
            return Classification.values()[2];
        else 
            return Classification.values()[0];
    } 
}