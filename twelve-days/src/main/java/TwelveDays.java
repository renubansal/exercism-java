import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RENU BANSAL
 */
class Days{
    private static List<String> days;
    
    Days(){
        days =  new ArrayList<>(List.of("first","second","third","fourth","fifth","sixth","seventh","eighth","ninth","tenth","eleventh","twelfth"));
 
    }
    public List<String> getDays(){
        return days;
    }
}

class Lyrics{
    private static List<String> lyrics;
    
    Lyrics(){
        lyrics  = new ArrayList<>(List.of("twelve Drummers Drumming","eleven Pipers Piping","ten Lords-a-Leaping","nine Ladies Dancing",
                "eight Maids-a-Milking","seven Swans-a-Swimming","six Geese-a-Laying","five Gold Rings","four Calling Birds","three French Hens",
                "two Turtle Doves","a Partridge in a Pear Tree"));
    }
    public List<String> getLyrics(){
        return lyrics;
    }
}

public class TwelveDays {
    
	String sing() {
        return verses(1,12);    
    }
	
    String verse(int verseNumber) {
        int i = 12 - verseNumber;
        List<String> mysong = new ArrayList<>(new Lyrics().getLyrics());

        // add and if verse number is greater than one
        if(verseNumber > 1){
            mysong.set(11,"and "+mysong.get(11) );
        }
        
        String joined = String.join(", ", mysong.subList(i , 12));
        return String.format("On the %s day of Christmas my true love gave to me: %s.\n",new Days().getDays().get(verseNumber - 1),joined);
    }

    String verses(int startVerse, int endVerse) 
    {
        List<String> mylist = new ArrayList<>();
        
        int j;
        for(j = startVerse; j <= endVerse ; ++j)
            mylist.add(verse(j)); //this adds an element to the l
        return String.join("\n", mylist);
    }    
    
}
