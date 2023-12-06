public class House {
    private Gift[] gifts;
    int total = 0;

    public House(int total) {
        gifts = new Gift[total];
    }
//为House添加gift的数量

    private boolean isFull() {
        return total == gifts.length;
    }

    private boolean isEmpty() {
        return total == 0;
    }

    public boolean add(Gift gift) {
        if (isFull()) {
            return false;
        }
        else {
            gifts[total] = gift;
            total++;
            return true;
        }
    }

    public boolean reduce(Gift gift){
        if (isEmpty()) {
            return false;
        }
        else {
            gifts[total] = gift;
            total--;
            return true;
        }
    }

    public String listGift() {
        if (isEmpty()) {
            return "No gifts here";
        }
        else{
            String listOfGifts = "";
            for(int i = 0; i < total; i++){
                listOfGifts+= i + ": " + gifts[i] + "\n";
            }
            return listOfGifts;
        }
    }

    public String listSpecificProduct(String location){
        if (isEmpty()) {
            return "No Gifts in the house";
        }
        else {
            String str = "";
            for (int i = 0; i < total; i++) {
                if (gifts[i].getLocation().equals(location))
                    str += i + ": " + gifts[i] + "\n";
            }
            if (str.equals("")) {
                return "No gift here, try other places";
            }
            else {
                return str;
            }
        }
    }
}
