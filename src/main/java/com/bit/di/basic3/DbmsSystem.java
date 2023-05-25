package com.bit.di.basic3;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class DbmsSystem {
    @Value("${com.bit.serverName}")
    private String serverName;
    @Value("${com.bit.serverPort}")
    private int serverPort;
    @Value("${com.bit.serverUrl}")
    private String serverUrl;
    @Value("${com.bit.connectionCount}")
    private int connectionCount;

    public DbmsSystem() {
        System.out.println("DbmsSystem()");
    }

    @PostConstruct
    public void initDbms() {
        System.out.println("initDbms");
    }

    @PreDestroy
    public void destroyDbms() {
        System.out.println("destroyDbms");
    }

    public DbmsSystem(String serverName, int serverPort, String serverUrl, int connectionCount) {
        this.serverName = serverName;
        this.serverPort = serverPort;
        this.serverUrl = serverUrl;
        this.connectionCount = connectionCount;
    }

    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public int getServerPort() {
        return serverPort;
    }

    public void setServerPort(int serverPort) {
        this.serverPort = serverPort;
    }

    public String getServerUrl() {
        return serverUrl;
    }

    public void setServerUrl(String serverUrl) {
        this.serverUrl = serverUrl;
    }

    public int getConnectionCount() {
        return connectionCount;
    }

    public void setConnectionCount(int connectionCount) {
        this.connectionCount = connectionCount;
    }

    @Override
    public String toString() {
        return "DbmsSystem{" +
                "serverName='" + serverName + '\'' +
                ", serverPort=" + serverPort +
                ", serverUrl='" + serverUrl + '\'' +
                ", connectionCount=" + connectionCount +
                '}';
    }
}
