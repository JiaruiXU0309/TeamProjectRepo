public class House {
    private Gift[] gifts;
    int total = 0;

    public House(int total) {
        gifts = new Gift[total];
    }
    private boolean isFull() {
        return total == gifts.length;
    }
    private boolean isEmpty(){
        return total == 0;
    }
}
