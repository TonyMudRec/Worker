package com.company;

public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;

    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;

    }

    public void start() {
        for (int i = 0; i < 101; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " - Error!");
            } else {
                callback.onDone("Task " + i + " is done");
            }

        }
    }
}
