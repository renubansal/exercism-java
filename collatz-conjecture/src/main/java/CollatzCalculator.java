class CollatzCalculator {

    private boolean isEven(int n){
        return n%2 == 0;
    }
    private int doubleNumberIfEven(int n){
        return n/2;
    }
    private int performIfOdd(int n){
        return 3*n + 1;
    }
	
	private boolean checkValidity(int n){
		return n < 1;
	}
    int computeStepCount(int start) {
		if(checkValidity(start))
			throw new IllegalArgumentException("Only natural numbers are allowed");
        int i = 0;
        while(start != 1){
            if(isEven(start))
                start = doubleNumberIfEven(start);
            else
                start = performIfOdd(start);
            i++;
        }
        return i;
    }

}
