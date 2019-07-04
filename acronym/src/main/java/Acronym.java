class Acronym {
    private final String phrase;

    Acronym(String phrase) {      
        this.phrase = phrase.toUpperCase();
    }
    
    private String filterPhrase(String phrase){
        return phrase.replaceAll("[^\\p{L}\\p{Z}']"," ");
    }
    
    String get() {
        String str = filterPhrase(phrase);
        
        //split the phrase into String array whenever there is single/multiple space 
        String[] words = str.split("\\s+");
        String acronym = new String();
        int i;
        
        //append first word on String array in acronym
        for(i = 0 ; i < words.length ; i++){
            acronym+=words[i].charAt(0);
        }
        return acronym;
    }

}
