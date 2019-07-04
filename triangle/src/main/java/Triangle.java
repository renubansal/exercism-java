class Triangle {

    private double a;
    private double b;
    private double c;
    
    private boolean checkSides(){
        return (a > 0 & b > 0) & (c > 0);
    }
    
    private boolean checkSumOfSides(){
        return ((a + b) < c);
    }
    Triangle(double a, double b, double c) throws TriangleException  {
        this.a = (a<b) ? (a<c)  ? a : c : (b<c)?b:c;
        this.b = Math.max(Math.min(a,b), Math.min(Math.max(a,b),c));
        this.c = (a>b) ? ((a>c)?a:c):((b>c)?b:c);

        if(!checkSides()){
            throw new TriangleException();
        }
        if(checkSumOfSides() == true)
            throw new TriangleException();
       
        }

    boolean isEquilateral() {
        return a == b & a == c;
    }

    boolean isIsosceles() {
        return a == b | b == c;
    }

    boolean isScalene() {
        return a != b & b != c & c != a;
    }
    
    boolean isDegenerate() {
        return a + b == c;
    }
    
}
