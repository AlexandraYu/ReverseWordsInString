public class ReverseWordsInString{
    public String reverseWords(String s) {
        if (s==null) return null; 
        String finalString="";
        String[] splitedStr = s.split("\\s+"); 
        for(int i = 0; i<splitedStr.length; i++) {
            finalString=finalString+" "+reverseString(splitedStr[i]);
        }
        finalString=finalString.trim(); //instead of worrying about getting either an extra space in the front or end of the string due to that finalString=finalString+" "+reverseString(...), I'm too lazy to count how to append space, I'll just use trim() method to trim off the leading and ending space of the final string, and it works. 
        return finalString; 
    }
    private static String reverseString(String s) {
        char tmp='a'; 
        int i=0, j=s.length()-1; 
        char[] charArray = s.toCharArray(); //this turns the string into individual characters and you can swap the characters 
        while(i<j) {
/* this wont' work b/c string is immutable
            tmp=s.charAt(i);
            s.charAt(i)=s.charAt(j); 
            s.charAt(j)=tmp; 
*/
            tmp = charArray[i]; 
            charArray[i]=charArray[j];
            charArray[j]=tmp; 
            i++; 
            j--;
        } 
//      return s;
        String swappedString = new String(charArray); //this turns character array into a new string
        return swappedString; 
    }
     public static void main(String []args){
        String inputStr = "A Hello World!";
        ReverseWordsInString rwis = new ReverseWordsInString(); 
        String answer = rwis.reverseWords(inputStr); 
        System.out.println(answer);
     }
}
