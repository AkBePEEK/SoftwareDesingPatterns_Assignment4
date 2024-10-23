package Part3;

public class NewsChannel implements Observer {
    private final String channel;
    private String currentHeadline;
    public NewsChannel(String channel) {
        this.channel = channel;
    }
    private void display(){
        System.out.println(channel + " - Breaking news: " + currentHeadline);
    }
    @Override
    public void update(String headline) {
        this.currentHeadline = headline;
        display();
    }
}
