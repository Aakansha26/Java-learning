import java.util.Scanner;


//Taking input in java
//If u want to input only integer use scanner.nextint(), if only string use scanner.nextline() but if both string and integer are to be input in the same program use
//Integer.parseint(scanner.nextline())

public class Main {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        int n = Integer.parseInt(scn.nextLine());
        System.out.println(n);
        String s = scn.nextLine();

        System.out.println(s);
    }
}
