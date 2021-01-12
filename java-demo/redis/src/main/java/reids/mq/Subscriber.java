package reids.mq;

import redis.clients.jedis.JedisPubSub;

public class Subscriber extends JedisPubSub {
    public Subscriber() {
    }

    public void onMessage(String channel, String message) {
        System.out.printf("receive redis published message, channel %s, message %s%n", channel, message);
    }

    public void onSubscribe(String channel, int subscribedChannels) {
        System.out.printf("subscribe redis channel success, channel %s, subscribedChannels %d%n",
                channel, subscribedChannels);
    }

    public void onUnsubscribe(String channel, int subscribedChannels) {
        System.out.printf("unsubscribe redis channel, channel %s, subscribedChannels %d%n",
                channel, subscribedChannels);

    }
}
