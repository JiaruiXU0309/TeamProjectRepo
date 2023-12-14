import java.util.Arrays;

public class House {
    private Gift[] gifts = new Gift[12];
    private Gift[] specificGifts = new Gift[0];
    int total = 0;

    public House() {
    }

    private boolean isFull() {
        return total == gifts.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }

    public boolean add(Gift gift) {
        if (isFull()) {
            return false;
        } else {
            gifts[total] = gift;
            total++;
            return true;
        }
    }

    public String listGift() {
        if (isEmpty()) {
            return "No gifts here";
        } else {
            String listOfGifts = "";
            for (int i = 0; i < gifts.length; i++) {
                listOfGifts += i + ": " + gifts[i] + "\n";
            }
            return listOfGifts;
        }
    }

    public String listSpecificGift(String location) {
        if (isEmpty()) {
            return "No Gifts in the house, please choose one person to hide gift first";
        } else {
            String str = "";
            int index = 1;
            for (int i = 0; i < gifts.length; i++) {
                if (gifts[i] != null) {
                    boolean result = gifts[i].getLocation().contains(location);
                    if (result) {
                            str += (index++) + ": " + gifts[i].toString() + "\n";
                        specificGifts = Arrays.copyOf(specificGifts, specificGifts.length + 1);
                        specificGifts[specificGifts.length - 1] = gifts[i];
                    }
                }
            }
            if (str.equals("")) {
                return "No gift here, try other places";
            } else {
                return str;
            }
        }
    }

    public int getSpecificLength() {
        return specificGifts.length;
    }

    public Gift getSpecificGifts(int index) {
        return specificGifts[index];
    }



}
