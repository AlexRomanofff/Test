package com.testingTask.client;

import com.google.gwt.core.client.GWT;
import com.google.gwt.user.client.rpc.RemoteService;
import com.google.gwt.user.client.rpc.RemoteServiceRelativePath;

@RemoteServiceRelativePath("TestingTaskService")
public interface TestingTaskService extends RemoteService {
    // Sample interface method of remote interface
    String getMessage(String msg);

    /**
     * Utility/Convenience class.
     * Use TestingTaskService.App.getInstance() to access static instance of TestingTaskServiceAsync
     */
    public static class App {
        private static TestingTaskServiceAsync ourInstance = GWT.create(TestingTaskService.class);

        public static synchronized TestingTaskServiceAsync getInstance() {
            return ourInstance;
        }
    }
}
