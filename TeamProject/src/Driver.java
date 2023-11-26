import java.util.Scanner;
public class Driver {
    private Scanner input = new Scanner(System.in);
    private House house;

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        processOrder();
        runMenu();
    }

    private int mainMenu(){
        System.out.print("""
               What do you want to do?🎅
               ---------
                  1) Hide gifts
                  2) find gifts
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }


    private void runMenu() {
        int option = mainMenu();

        while (option != 0) {

            switch (option) {
                case 1 -> test();
                case 2 -> test();
                case 3 -> test();
                case 4 -> test();
                case 5 -> test();
                default -> System.out.println("Invalid option entered: " + option);
            }

            //pause the program so that the user can read what we just printed to the terminal window
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine(); //second read is required - bug in Scanner class; a String read is ignored straight after reading an int.

            //display the main menu again
            option = mainMenu();
        }
    }

        private void processOrder () {
            //prologue开场白
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Christmas is coming.");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Each family member has prepared gifts for each other.");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Now please control each character to hide their gifts for each other.");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            System.out.println("Which character do you want to control now? :)");

            try {
                Thread.sleep(1000);
            } catch (Exception e) {
            }
            chooseCharacterMenu();

            int userCharacter = input.nextInt();

        }

        private int chooseCharacterMenu() {
            System.out.print("""
                    Character Menu
                    ---------
                       1) Father
                       2) Mother
                       3) Eldest child
                       4) Youngest child
                       0) Exit
                   ==>> """);
            int character = input.nextInt();
            return character;
        }

        private void test(){
            System.out.println("Need to be created");
        }
}

