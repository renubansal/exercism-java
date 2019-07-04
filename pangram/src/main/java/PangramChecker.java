import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RENU BANSAL
 */
class PangramChecker {

    public boolean isPangram(String input) {
        input = input.toUpperCase();
        int i;
        for(i = 65 ; i <=90 ; i++){
            if(input.indexOf((char)i)<0)
                return false;
        }
        return true;
    }

}
