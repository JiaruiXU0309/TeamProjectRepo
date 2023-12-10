import java.util.Scanner;
public class Driver {
    private Scanner input = new Scanner(System.in);
    private House house;

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        house = new House();
        chooseCharacter();
        runMenu();
    }

    //////////////////////////////////////////////////////////////////////////////////
    private void runMenu() {
        int option = mainMenu();

        while (option != 0) {

            switch (option) {
                case 1 -> hideGifts();
                case 2 -> findGifts();
                case 3 -> characterMenu();
                default -> System.out.println("Invalid option entered: " + option);
            }
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine();

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
    String chosenCharacter;

    private void chooseCharacter() {
        prologue();

        characterMenu();

        if ( (chosenCharacter == "e") || (chosenCharacter == "E") ){
            System.out.println("Exiting...bye");
            System.exit(0);
        }
        else {
            System.out.println("\nPress enter key to continue...");
            input.nextLine();
            input.nextLine();
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
        input.nextLine();
        chosenCharacter = input.nextLine();
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
        int more = input.nextInt();

        for (int i = 0; i < more ; i++){
            addGifts();
        }
    }

    private void addGifts() {
        input.nextLine();

        String giver = chosenCharacter;

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
                 Map
                 ---------
                    1) Under the Christmas tree
                    2) Near the hearth
                    3) On the shelf
                    4) Behind the sofa cushion
                 Where do you want to hide this gift? Please enter on the next line:
                """);
        input.nextLine();
        String location = input.nextLine();

        boolean isHidden = house.add(new Gift(giver, receiver, content, wrapper, shape, prize, location));
        if (isHidden) {
            System.out.println("Gifts Hidden Successfully");
        }
    }
    ///////////////////////////////////////////////////////////////////////////////////
    private void findGifts(){
        while (true) {
            input.nextLine();
            System.out.print("""
                     Map
                     ---------
                        1) Under the Christmas tree
                        2) Near the hearth
                        3) On the shelf
                        4) Behind the sofa cushion
                     Which area do you want to explore? Please enter on the next line:
                    """);

            String location = input.nextLine();
            System.out.println(house.listSpecificGift(location));
            if (house.listSpecificGift(location) != "No gift here, try other places"){
            openGift();
            }

            System.out.print("Do you want to continue searching for more gifts? (y/n): ");
            char response = input.next().charAt(0);
            if (response != 'y' && response != 'Y') {
                break;
            }
        }
    }

    private void openGift(){
        System.out.print("Please enter the number of the gift you want to open: ");
        int giftIndex = input.nextInt() - 1;
        if (giftIndex >= 0 && giftIndex < house.getSpecificLength()){
            Gift spcificGift = house.getSpecificGifts(giftIndex);
            System.out.println("You find " +spcificGift.getContent()+" here");
            System.out.println("It is from "+spcificGift.getGiver());
        }
        else {
            System.out.println("Invalid input. Please try again.");
        }
    }

}