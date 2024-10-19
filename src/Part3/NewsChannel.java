package Part3;

import java.nio.channels.Channel;

public class NewsChannel implements Observer {
    private Channel channel;
    private String currentHeadline;
    public NewsChannel(Channel channel) {
        this.channel = channel;
    }
    private void display(){
        System.out.println("Current Headline: " + currentHeadline);
    }
    @Override
    public void update(String headline) {
        this.currentHeadline = headline;
        display();
    }
}
