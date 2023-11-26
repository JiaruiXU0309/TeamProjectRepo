import java.util.Scanner;
public class Driver {
    private Scanner input = new Scanner(System.in);
    private House house;

    public static void main(String[] args) {
        new Driver();
    }

    public Driver() {
        processOrder();

    }

    private void processOrder(){
        //prologue开场白
        System.out.println("Christmas is coming.");
        System.out.println("Each family member have prepared gifts for each other.");
        System.out.println("Now please control each character to hide their gifts for each other.");
        System.out.println("Which character do you want to control now? :)");
        chooseCharacterMenu();

        int userCharacter = input.nextInt();

    }

        private int chooseCharacterMenu(){
            System.out.print("""
               Character Menu
               ---------
                  1) Father
                  2) Mother
                  3) Eldest child
                  4) Youngest child
                  0) Exit
               ==>> """);
            int option = input.nextInt();
            return option;
        }
}
