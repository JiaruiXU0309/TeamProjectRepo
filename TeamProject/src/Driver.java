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
                case 1 -> hideGifts();
                case 2 -> test();
                case 3 -> characterMenu();
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

    private int mainMenu() {
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
    char chosenCharacter;

    private void chooseCharacter() {
        prologue();//see on Line 76


        characterMenu();

        System.out.println("\nPress enter key to continue...");
        input.nextLine();
        input.nextLine();

        if (chosenCharacter == 0) {
            System.out.println("Exiting...bye");
            System.exit(0);
        }
    }

    private void characterMenu() {
        System.out.print("""
                 Character Menu
                 ---------
                    1) Father
                    2) Mother
                    3) Eldest child
                    4) Youngest child
                    0) Exit
                ==>> """);
        chosenCharacter = input.next().charAt(0);
    }

    //////////////////////////////////////////////////////////////////////////////////
    private void test() {
        System.out.println("Need to be created");
    }

    //////////////////////////////////////////////////////////////////////////////////
    private void prologue() {
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
    }

    ///////////////////////////////////////////////////////////////////////////////////

    private void hideGifts(){
        System.out.print("How many Gifts would you like to give?  ");
        int numberGifts = input.nextInt();

        house = new House(numberGifts);

        //ask the user for the details of the products and add them to the order
        for (int i = 0; i < numberGifts; i++){
            addGifts();
        }
    }
    private void addGifts() {
        input.nextLine();

        char giver = chosenCharacter;
        System.out.print("Enter the receiver:  ");
        String receiver = input.nextLine();
        System.out.print("Enter the Content inside the gift:  ");
        String content = input.nextLine();
        System.out.print("Enter the Wrapper of the gift:  ");
        String wrapper = input.nextLine();
        System.out.print("Enter the Shape of the gift:  ");
        String shape = input.nextLine();
        System.out.print("Enter the Prize of the gift:  ");
        float prize = input.nextFloat();
        System.out.print("""
                 Location Menu
                 ---------
                    1) Under the Christmas tree
                    2) By the hearth
                    3) On the shelf
                    4) Behind the sofa cushion
                    5) Other places that you think can be used to hide
                """);
        String location = input.nextLine();

        boolean isHidden = house.add(new Gift(giver, receiver, content, wrapper, shape, prize, location));
        if (isHidden) {
            System.out.println("Gifts Hidden Successfully");
        } else {
            System.out.println("No Gift Hidden");
        }
    }
}