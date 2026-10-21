public class Pallindrome {
    public static void main(String[] args ){
        String og = "aba";
        String Reverse = "";

        for(int i=og.length()-1; i>=0; i--){
            Reverse = Reverse + og.charAt(i);
        }
        if(og.equals(Reverse)){
            System.out.println("This String is Pallindrome "+Reverse);
        }else{
            System.out.println("Not Pallindrome...");
        }
    }
}
