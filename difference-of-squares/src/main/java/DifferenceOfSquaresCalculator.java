class DifferenceOfSquaresCalculator {
    
    private int computeSum(int n){
        return n*(n+1)/2;
    }

    int computeSquareOfSumTo(int n) {
        return (int) Math.pow(computeSum(n), 2);
    }

    int computeSumOfSquaresTo(int n) {
        return (n*(n+1)*(2*n+1))/6;
    }

    int computeDifferenceOfSquares(int input) {
        return (computeSquareOfSumTo(input) - computeSumOfSquaresTo(input));
    }
}
