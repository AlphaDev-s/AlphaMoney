package com.alpha;

import java.util.List;

/**
 * класс для внешних пользователей, т.е. это клиенты компании
 */
public class ExternalUser extends User {

    private double uid = Math.random() * 1000000000;

    public ExternalUser() {
        setUID(uid);
    }

}
