package com.bit.dto;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class JsonBody {
    private String userName;
    private String userLoc;
    private String localHost;
    private int wait;

    public JsonBody() {
    }

    public JsonBody(String userName, String userLoc, String localHost, int wait) {
        this.userName = userName;
        this.userLoc = userLoc;
        this.localHost = localHost;
        this.wait = wait;
    }

    @Override
    public String toString() {
        return "JsonBody{" +
                "userName='" + userName + '\'' +
                ", userLoc='" + userLoc + '\'' +
                ", localHost='" + localHost + '\'' +
                ", wait=" + wait +
                '}';
    }
}
