import java.util.Scanner;
public class Driver {
    private Scanner input = new Scanner(System.in);
    private House house;

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        chooseCharacter();
        runMenu();
    }

//////////////////////////////////////////////////////////////////////////////////
    private void runMenu() {
        int option = mainMenu();

        while (option != 0) {

            switch (option) {
                case 1 -> test();
                case 2 -> test();
                case 3 -> chooseCharacterMenu();
                default -> System.out.println("Invalid option entered: " + option);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine();

            //display the main menu again
            option = mainMenu();
        }
        System.out.println("Exiting...bye");
        System.exit(0);
    }

    private int mainMenu(){
        System.out.print("""
               What do you want to do?🎅
               ---------
                  1) Hide gifts
                  2) find gifts
                  3) Exchange the character
                  0) Exit
               ==>> """);
        int option = input.nextInt();
        return option;
    }
//////////////////////////////////////////////////////////////////////////////////
int chosenCharacter;
    private void chooseCharacter () {
        prologue();//see on Line 76


        chooseCharacterMenu();

        System.out.println("\nPress enter key to continue...");
        input.nextLine();
        input.nextLine();

        if (chosenCharacter == 0) {
            System.out.println("Exiting...bye");
            System.exit(0);
        }
    }

        private void chooseCharacterMenu() {
            System.out.print("""
                    Character Menu
                    ---------
                       1) Father
                       2) Mother
                       3) Eldest child
                       4) Youngest child
                       0) Exit
                   ==>> """);
            chosenCharacter = input.nextInt();
        }
//////////////////////////////////////////////////////////////////////////////////
        private void test(){
            System.out.println("Need to be created");
        }
//////////////////////////////////////////////////////////////////////////////////
        private void prologue(){
            try {Thread.sleep(1000);}
            catch (Exception e) {}
            System.out.println("Christmas is coming.");

            try {Thread.sleep(1000);}
            catch (Exception e) {}
            System.out.println("Each family member has prepared gifts for each other.");

            try {Thread.sleep(1000);}
            catch (Exception e) {}
            System.out.println("Now please control each character to hide their gifts for each other.");

            try {Thread.sleep(1000);}
            catch (Exception e) {}
            System.out.println("Which character do you want to control now? :)");

            try {Thread.sleep(1000);}
            catch (Exception e) {}
        }
}

