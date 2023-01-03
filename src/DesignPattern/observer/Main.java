package DesignPattern.observer;

public class Main {
    public static void main(String[] args) {
        Topic topic1 = new Topic();
        Observer a = new TopicSubscriber("a", topic1);
        Observer b = new TopicSubscriber("b", topic1);
        Observer c = new TopicSubscriber("c", topic1);
        topic1.register(a);
        topic1.register(b);
        topic1.register(c);
        topic1.postMessage(" wow !!  this if first post in topic1");
        Topic topic2 = new Topic();
        a.addTopic(topic2);
        Observer d = new TopicSubscriber("d",topic2);
        topic2.register(d);
        topic2.register(a);
        topic2.postMessage("hey ~ this is first post in topic2.");

    }
}
