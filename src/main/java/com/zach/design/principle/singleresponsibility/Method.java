package com.zach.design.principle.singleresponsibility;

public class Method {
    private void updateUserInfo(String userName, String address) {
        userName = "geely";
        address = "beijing";
    }

    private void updateUserInfo(String userName, String address, boolean b) {
        // 非单一职责
        if (b) {
            // todo something1
        } else {
            // todo something2
        }
        userName = "geely";
        address = "beijing";
    }

}
