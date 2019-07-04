public class Darts {  
    private double x;
    private double y;
    
    Darts(double x, double y) {
        this.x = x;
        this.y = y;
    }
    
    private double distance(double x, double y){
        return Math.sqrt((Math.pow(x,2)+Math.pow(y,2)));
    }

    int score() {
        double distance = distance(x,y);
        if(distance <=1)
            return 10;
        else if (distance<=5)
            return 5;
        else if (distance <=10)
            return 1;
        else
            return 0;
    }
}
