package br.com.pricardoti.payment.shared.notifications;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Notifiable<T> extends Notification {

    private final List<T> notifications = new ArrayList<>();

    private T getNotificationInstance(String key, String message) {
        return (T) new Object[]{key, message};
    }

    public void addNotification(String key, String message) {
        Notification notification = (Notification) getNotificationInstance(key, message);
        this.notifications.add((T) notification);
    }

    public void addNotification(T notification) {
        this.notifications.add(notification);
    }

    public void addNotification(Collection<T> notifications) {
        this.notifications.addAll(notifications);
    }

    public void addNotification(T[] notifications) {
        for (T notification : notifications) {
            addNotification(notification);
        }
    }

    public void clear() {
        this.notifications.clear();
    }

    public boolean isValid() {
        return !this.notifications.isEmpty();
    }
}
