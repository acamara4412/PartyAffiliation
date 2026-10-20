import java.util.Scanner;

public class PartyAffiliation {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);


        String choice = "";


        System.out.print("Choose your party affiliation [D, R, I]: ");


        choice = in.nextLine();


        if (choice.equalsIgnoreCase("D")) {

            System.out.println("You get a Democratic Donkey.");

        } else if (choice.equalsIgnoreCase("R")) {

            System.out.println("You get a Republican Elephant.");

        } else if (choice.equalsIgnoreCase("I")) {
            System.out.println("You get an Independent Person.");
        } else {
            // output "You get an Other."
            System.out.println("You get an Other.");
        } // endIf
    }
}