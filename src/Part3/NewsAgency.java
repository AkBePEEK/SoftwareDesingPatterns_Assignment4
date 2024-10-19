package Part3;

import java.util.ArrayList;
import java.util.List;

public class NewsAgency implements Observable{
    private final List<Observer> observers = new ArrayList<>();
    private String newsAgency;

    public void setNewsAgency(String newsAgency) {
        this.newsAgency = newsAgency;
        notifyObservers();
    }


    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers){

        }
    }
}
