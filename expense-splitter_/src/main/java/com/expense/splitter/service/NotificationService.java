package com.expense.splitter.service;

import com.expense.splitter.model.Notification;
import com.expense.splitter.repository.NotificationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class NotificationService {
    @Autowired
    private NotificationRepository notificationRepository;

    public Notification createNotification(Notification notification) {
        return notificationRepository.save(notification);
    }

    public Notification getNotificationById(Long id) {
        return notificationRepository.findById(id).orElse(null);
    }
    public void deleteNotification(Long id) {
        notificationRepository.deleteById(id);
    }
}
