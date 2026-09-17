import java.util.Scanner;
class StringOperation{
   public static void main(String[]args){
     Scanner sc=new Scanner(System.in);
    System.out.print("Enter first string:");
    String str1=sc.nextLine();
    System.out.print("Enter second string:");
    String str2=sc.nextLine();
    System.out.println("\nCharacter at index 0:"+str1.charAt(0));
    System.out.println("Substring from index 1:"+str1.substring(1));
    System.out.println("Concatenation:"+str1.concat(str2));
    System.out.println("Are both strings equal?"+str1.equals(str2));
    System.out.println("Is first string empty?"+str1.isEmpty());
    sc.close();
}
}
    

    
