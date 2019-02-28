package com.cnm.pangu.constant;



public enum ErrNoEnum {
    SUCCESS("0"),
    UNKNOWN("999");
    private String error;

    ErrNoEnum(String error) {
        this.error = error;
    }

    public String getError() {
        return error;
    }

}
