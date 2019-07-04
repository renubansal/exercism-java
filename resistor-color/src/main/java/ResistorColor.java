class Colors{
    private String[] colorlist = {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    
    public String[] getColor(){
        return colorlist;
    }
    
    public void setColor(){
        //we can add or remove colors in colorlist
    }    
}
class ResistorColor {  
    
    int colorCode(String color) {
        String[] colorlist =new Colors().getColor();
        int i;
        for(i = 0 ; i<colorlist.length ; i++){
            if(color.equals(colorlist[i]))
                return i;
        }
        // if color not present in the list
        return 0;
    }

    String[] colors() {
        return new Colors().getColor();
    }
}