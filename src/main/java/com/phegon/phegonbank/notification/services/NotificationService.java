package com.phegon.phegonbank.notification.services;

//package com.phegon.phegonbank.notification.services;

import com.phegon.phegonbank.auth_users.entity.User;
import com.phegon.phegonbank.notification.dtos.NotificationDTO;
import org.springframework.boot.webmvc.autoconfigure.WebMvcProperties;

public interface NotificationService {
    void sendEmail(NotificationDTO notificationDTO, User user);
}


//public interface NotificationService {
//}
