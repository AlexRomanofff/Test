package com.testingTask.client;

import com.google.gwt.user.client.rpc.AsyncCallback;

public interface TestingTaskServiceAsync {
    void getMessage(String msg, AsyncCallback<String> async);
}
