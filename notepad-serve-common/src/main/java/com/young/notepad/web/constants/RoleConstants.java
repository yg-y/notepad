package com.young.notepad.web.constants;

public enum RoleConstants {
    ADMIN("1"), DEVELOP("2"), AFFILIATE_MANAGER("3"), ADVERTISER_MANAGER("4");

    public String value;

    RoleConstants(String value) {
        this.value = value;
    }
}
