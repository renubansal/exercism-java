import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
class ScrabbleValue{
    private int value;
    private List<Character> lst;
    
    ScrabbleValue(int value, List<Character> lst){
        this.value = value;
        this.lst = lst;
    }
    public int getValue(){
        return value;
    }
    public List<Character> getList(){
        return lst;
    }
}

class ScrabbleValues{
    private List<ScrabbleValue> valueList = new ArrayList<ScrabbleValue>();
    ScrabbleValues(){
        valueList.add(new ScrabbleValue(1,Arrays.asList('A','E','I','O','U','L','N','R','S','T')));
        valueList.add(new ScrabbleValue(2,Arrays.asList('D','G')));
        valueList.add(new ScrabbleValue(3,Arrays.asList('B','C','M','P')));
        valueList.add(new ScrabbleValue(4,Arrays.asList('F','H','V','W','Y')));
        valueList.add(new ScrabbleValue(5,Arrays.asList('K')));
        valueList.add(new ScrabbleValue(8,Arrays.asList('J','X')));
        valueList.add(new ScrabbleValue(10,Arrays.asList('Q','Z')));
    }
    public List<ScrabbleValue> getList(){
        if(valueList.get(0).getList().contains('A'));
        return valueList;
    }
}
class Scrabble {
    private String word;
    List<ScrabbleValue> valueList;
    Scrabble(String word) {
        valueList = new ScrabbleValues().getList();
        this.word = word.toUpperCase();
    }
    private int valueOfChar(Character ch){
        for(ScrabbleValue s: valueList){
            if(s.getList().contains(ch))
                return s.getValue();
        }
         return 0;
    }
    int getScore() {
        int i,score = 0;
        for(i = 0 ; i < word.length() ; i++){     
            Character ch = word.charAt(i);
            score += valueOfChar(ch);
        }
        return score;
    }
}