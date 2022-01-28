package Lab5;

public class Task1_and_Task2 {
    void countVowels(String arg){

        String s = arg;
        int count = 0;

        for(int i=0; i<s.length(); i++){
            char letter = s.charAt(i);
            if(letter=='a'||letter=='e'||letter=='i'||letter=='o'||letter=='u'||letter=='A'||letter=='E'||letter=='I'||letter=='O'||letter=='U'){
                count++;
            }
        }
        System.out.print("Number of Vowels: "+count);
    }
    void isPalindrome(String arg){
        String sen = arg;
        String reversed = "";
        char[] str = sen.toCharArray();

        for(int i=sen.length()-1; i>=0;i--){

            reversed = reversed + str[i];
        }
        if(sen.equals(reversed)){
            System.out.println(sen+" is a Palindrome");
        }
        else{
            System.out.println(sen+" is not a Palindrome");
        }
    }
}