package br.com.pricardoti.payment.shared.notifications;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public abstract class Notifiable<T> {

    private final List<T> notifications = new ArrayList<>();

    private T getNotificationInstance(String key, String message) {
        return (T) new Object[]{key, message};
    }

    public void addNotification(String key, String message) {
        this.notifications.add((T) getNotificationInstance(key, message));
    }

    public void addNotification(T notification) {
        this.notifications.add(notification);
    }

    public void addNotification(Collection<T> notifications) {
        this.notifications.addAll(notifications);
    }

    public void addNotifications(T... notifications) {
        Arrays.stream(notifications).forEach(notification -> {
            addNotification(notification);
        });
    }

    public void clear() {
        this.notifications.clear();
    }

    public boolean isValid() {
        return !this.notifications.isEmpty();
    }
}
