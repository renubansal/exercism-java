import java.util.HashMap;

/**
 *
 * @author RENU BANSAL
 */

class RnaTranscription {
    HashMap<Character,Character> map = new HashMap<>();
    RnaTranscription(){
        map.put('G','C');
        map.put('C','G');
        map.put('T','A');
        map.put('A','U');
        
    }
   
   String transcribe(String dnaStrand) {
	StringBuilder rnaStrand = new StringBuilder(dnaStrand);
	int i,n = dnaStrand.length();
	for (i = 0; i < n; i++) {
            rnaStrand.setCharAt(i,map.get(rnaStrand.charAt(i)));
	}
	return rnaStrand.toString();
    }
 
}
