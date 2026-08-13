import java.util.*;
public class StingggClasss {

    public static String compress(String str) {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < str.length(); i++) {
            int count = 1;

            while (i < str.length() - 1 &&
                str.charAt(i) == str.charAt(i + 1)) {
                count++;
                i++;
            }

            sb.append(str.charAt(i));

            if (count > 1) {
                sb.append(count);
            }
        }

        return sb.toString();
    }
    // Q1 lowercase count 
    public static String lowerCase(String str){
        Integer count=0;
        for(int i=0; i<str.length(); i++){
            if(str.charAt(i)=='a'|| str.charAt(i)=='e'|| str.charAt(i)=='i'|| str.charAt(i)=='o'|| str.charAt(i)=='u'){
                count++;
            }
        }
        return count.toString();
    }
    // my approach which is not good but correct for some case
    public static boolean Anagrams(String s1, String s2){
        Integer count=0;
        if(s1.length()!= s2.length()){
            return false;
        }
        
        for(int i=0; i< s1.length(); i++){
            char ch= s1.charAt(i);
            for(int j=0;j<s2.length() ; j++){
                char ch2=s2.charAt(j);
                if(ch==ch2){
                    count++;
                }
            }
            }
            if(count==s1.length()){
                return true;
            }
            return false;
    }
    // public static void main(String args[]) {
         // Q4 anagrams
         // my approach 
        // String s1="race";
        // String s2="care";
        // if(Anagrams(s1,s2)){
        //     System.out.println(s1 +" "+ s2 + " are anagrams");
        // }
        // else{
        //     System.out.println("they are not anagrams");
        // }

        String s1="earth";
        String s2= "heart";
        // lowercase convert
        s1=s1.toLowerCase();
        s2=s2.toLowerCase();

        // length check
        if(s1.length()== s2.length()){
            // convert char Array
            char[] str1charArray=s1.toCharArray();
            char[] str2charArray = s2.toCharArray();
            // sort both Array
            Arrays.sort(str1charArray);
            Arrays.sort(str2charArray);
             // if they sorted char array are same
            boolean result= Arrays.equals(str1charArray, str2charArray);
            if(result){
                System.out.println(s1 +" "+ s2+" they are angrams");
            }
            else{
                System.out.println("they are not anagrams");
            }

        }
        else{
            System.out.println("they are not Anagrams");
        }
        Scanner sc= new Scanner(System.in);
        // System.out.println("enter your string");
        // String str1=sc.nextLine();
        //System.out.println("count of lowercase will be "+ lowerCase(str1));
        //String str = "abcds";
        //System.out.println(compress(str));
        // String str="khizra";
        // String str11="hello";
        // String str22="khizra";
        //Q2
        //System.out.println(str.equals(str11)+" "+ str.equals(str22));
        //Q3
        // String str33="khizra".replace("z","");
        // System.out.println(str33);
    }
}