import java.util.*;
public class stringbuilderexample {
    public static void main(string[] args)
    {
        StringBuilder sb2=new StringBuilder();
        StringBuilder sb1=new StringBuilder("this is java");

        Scanner sc=new Scanner(System.in);
        System.out.println("enter a string");
        String str=sc.nextLine();
        StringBuilder sb=new StringBuilder(str);

        sb.append("  hello");
        System.out.println(sb);
        System.out.println(sb.insert(3,  "hello  "));

        System.out.println(sb1.reverse());
        System.out.println(sb.replace(1,6,"java"));
        System.out.println(sb.delete(5,10));
        System.out.println(sb.capacity());
        
    }
}