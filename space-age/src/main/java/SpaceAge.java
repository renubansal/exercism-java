import java.math.RoundingMode;
import java.text.NumberFormat;

/**
 *
 * @author RENU BANSAL
 */
class SpaceAge {

    private double seconds;
    private final static long EARTH = 31557600;
    private final static double MERCURY = 0.2408467;
    private final static double VENUS = 0.61519726;
    private final static double MARS = 1.8808158;
    private final static double JUPITER = 11.862615;
    private final static double SATURN = 29.447498;
    private final static double URANUS = 84.016846;
    private final static double NEPTUNE = 164.79132;
    
    
    double convertor(double seconds){
        NumberFormat nf = NumberFormat.getInstance();
        nf.setMaximumFractionDigits(2);
        return Double.valueOf(nf.format(seconds));
    }
        
    SpaceAge(double seconds) {
        this.seconds = seconds;
    }

    double getSeconds() {
        return seconds;
    }

    double onEarth() {
        double x = (double)(getSeconds()/EARTH); 
        return convertor(x);
    }

    double onMercury() {       
        return convertor(onEarth()/MERCURY);
    }

    double onVenus() {
        return convertor(onEarth()/VENUS);
    }

    double onMars() {
        return convertor(onEarth()/MARS);
    }
 
    double onJupiter() {
        return convertor(onEarth()/JUPITER);
    }

    double onSaturn() {
        return convertor(onEarth()/SATURN);
    }

    double onUranus() {
        return convertor(onEarth()/URANUS);
    }

    double onNeptune() {
        return convertor(onEarth()/NEPTUNE);
    }
}
