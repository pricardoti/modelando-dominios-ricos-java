package br.com.pricardoti.payment.shared.notifications;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public abstract class Notifiable<T> {

    private final List<T> notifications = new ArrayList<>();

    private T toNotificationInstance(String key, String message) {
        return (T) new Object[]{key, message};
    }

    public void addNotification(String key, String message) {
        this.notifications.add(toNotificationInstance(key, message));
    }

    public void addNotification(T notification) {
        this.notifications.add(notification);
    }

    public void addNotification(Collection<T> notifications) {
        this.notifications.addAll(notifications);
    }

    public void addNotifications(T... notifications) {
        List.of(notifications).forEach(this::addNotification);
    }

    public void clear() {
        this.notifications.clear();
    }

    public boolean isInValid() {
        return !isValid();
    }

    public boolean isValid() {
        return this.notifications.isEmpty();
    }
}
