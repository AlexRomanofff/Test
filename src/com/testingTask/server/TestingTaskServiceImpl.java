package com.testingTask.server;

import com.google.gwt.user.server.rpc.RemoteServiceServlet;
import com.testingTask.client.TestingTaskService;

public class TestingTaskServiceImpl extends RemoteServiceServlet implements TestingTaskService {
    // Implementation of sample interface method
    public String getMessage(String msg) {
        return "Client said: \"" + msg + "\"<br>Server answered: \"Hi!\"";
    }
}