public class Gift {
    private String giver;
    private String receiver;
    private String content;
    private String wrapper;
    private String shape;
    private float prize;
    private String location;
    public Gift(String giver,String receiver,String content,String wrapper,String shape,float prize,String location){
        this.giver = giver;
        this.receiver = receiver;
        this.content = content;
        this.wrapper = wrapper;
        this.shape = shape;
        this.prize = prize;
        this.location = location;
    }
    public String getGiver(){return giver;}
    public String getReceiver(){return receiver;}
    public String getContent(){return content;}
    public String getWrapper(){return wrapper;}
    public String getShape(){return shape;};
    public float getPrize() {return prize;}
    public String getLocation() {return location;}

    public String toString() {
        return "Gift{" +
                "wrapper='" + wrapper + '\'' +
                ", shape='" + shape + '\'' +
                ", receiver='" + receiver + '\'' +
                '}';
    }
}
