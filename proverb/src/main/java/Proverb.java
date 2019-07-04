class Proverb {
	
	String[] words;
    Proverb(String[] words) {
		this.words = words;
	}

	private boolean checkIfNotEmpty(){
		return words.length == 0;
	}
    String recite() {
        if(checkIfNotEmpty())
			return "";
		
		int i;
		String proverb = new String();
        
		for(i = 1 ;i< words.length;i++){
            proverb +=String.format("For want of a %s the %s was lost.\n",words[i-1],words[i]);
		}
		proverb += String.format("And all for the want of a %s.",words[0]);
		
		return proverb;
    }
}