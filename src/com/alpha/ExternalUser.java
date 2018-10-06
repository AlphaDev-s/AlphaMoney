package com.alpha;

import java.util.List;

public class ExternalUser extends User {

    private double uid = Math.random();

    public ExternalUser() {
        setUID(uid);
    }

}
