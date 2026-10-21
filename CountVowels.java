public class CountVowels{
    public static void main(String[] args){
        String sample = "education";
        int count=0;
        for(int i=0; i<sample.length()-1; i++){
            if(sample.charAt(i) == 'a' ||  sample.charAt(i) == 'e' ||
        sample.charAt(i) == 'i' || sample.charAt(i) == 'o' ||
         sample.charAt(i) == 'u'){
             count++;
        }
        }
        System.out.println(count);
    }
}