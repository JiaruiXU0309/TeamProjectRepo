public class House {
    private Gift[] gifts;
    int total = 0;

    public House(){}
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
            for(int i = 0; i < gifts.length; i++){
                listOfGifts+= i + ": " + gifts[i] + "\n";
            }
            return listOfGifts;
        }
    }

    public String listSpecificGift(String location){
        if (isEmpty()) {
            return "No Gifts in the house, please choose one person to hide gift first";
        }
        else {
            String str = "";
            for (int i = 0; i < gifts.length; i++) {
                if (gifts[i].getLocation().equals(location))
                    str += (i+1) + ": " + gifts[i].toString() + "\n";
            }
            if (str.equals("")) {
                return "No gift here, try other places";
            }
            else {
                return str;
            }
        }
    }

    public void setTotal(int total) {
        this.total = total;
    }
    public int getTotal() {
        return total;
    }
}
