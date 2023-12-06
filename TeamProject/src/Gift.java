public class Gift {
    private String name;
    private String wrapper;
    private String shape;
    private float prize;
    private String location;
<<<<<<< HEAD
    public Gift(char giver,String receiver,String content,String wrapper,String shape,float prize,String location){
        this.giver = giver;
        this.receiver = receiver;
        this.content = content;
        this.wrapper = wrapper;
        this.shape = shape;
        this.prize = prize;
        this.location = location;
=======
    public Gift(String name,String wrapper,String shape,float prize,String location){


>>>>>>> parent of f60b9d3 (create hideGifts and addGifts methods)
    }
    public char getGiver(){
        return giver;
    }
    public String getReceiver(){
        return receiver;
    }
    public String getContent(){
        return content;
    }
    public String getWrapper(){
        return wrapper;
    }
    public String getShape(){return shape;};
    public float getPrize() {return prize;}
    public String getLocation() {return location;}
}
