package com.alpha;

public enum Currency {

    USD(111),
    RUB(000),
    EUR(010);

    Currency(int code) {
        this.code = code;
    }

    public int getCode() {
        return code;
    }

    private int code;
}
