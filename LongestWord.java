public class LongestWord {
	/**
	 * @
	 */	
	public String getLongestWord(String para) {
		
        String [] words = para.split(" ");
        String longestWord = "";
        for(int i = 0; i < words.length; i++){
        	if(words[i].length() >= longestWord.length()){
        		longestWord = words[i];
        	} 
        }
		return longestWord.length() + " and " + longestWord;
	}
}
