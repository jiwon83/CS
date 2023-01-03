package DesignPattern.observer;

import java.util.ArrayList;

public class TopicSubscriber implements Observer{

    private String name;
//    private Subject topic;
    private ArrayList<Subject> topic;


    public TopicSubscriber(String name, Subject topic){
        this.name = name;
        this.topic = new ArrayList<>();
        this.topic.add(topic);
//        this.topic = topic;
    }
    @Override
    public void addTopic(Subject topic){
        this.topic.add(topic);
    }
    @Override
    public void update() {
        for (Subject t : topic ){
            String msg = (String) t.getUpdate(this); //topic의 msg를 받아서
            System.out.println(name + ":: got message >> "+msg); //구독자들에서 출력
        }

    }
}
