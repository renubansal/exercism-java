class RotationalCipher {

    private final int NUM = 26;
    private final int LOWER = (int)'a';
    private final int UPPER = (int)'A';
    
    private int key;
    RotationalCipher(int shiftKey) {
        this.key = shiftKey;
    }
    
    private char shiftUpperCaseAlphabet(char ch){
        return (char)(((int)ch + key - UPPER)%NUM + UPPER);
    }
    
    private char shiftLowerCaseAlphabet(char ch){
        return (char)(((int)ch + key - LOWER )%NUM + LOWER);
    }

    String rotate(String data) {
        StringBuilder rotateStr = new StringBuilder();
         
        for(int i = 0 ; i < data.length() ; i++){
            char ch = data.charAt(i);
            if(Character.isLetter(ch)){
                ch = Character.isUpperCase(ch) ? shiftUpperCaseAlphabet(ch) : shiftLowerCaseAlphabet(ch);
            }
            rotateStr.append(ch);
        }
        return rotateStr.toString();
    }

}
