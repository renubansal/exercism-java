class PrimeCalculator {
    private boolean isPrime(int number){
        int i;
        for(i = 2 ; i < number ; i++){
            if(number%i == 0)
                return false;
        }
        return true;
    }
	
	private boolean checkValidity(int num){
		return num < 1;
	}
    int nth(int nth) {
		if(checkValidity(nth))
			throw new IllegalArgumentException();

        int i,count;
        for(i = 2 , count = 0 ; count < nth ; ++i){
            if(isPrime(i))
                ++count;
        }
        return i-1;
    }
}
