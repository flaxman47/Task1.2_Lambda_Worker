public class Worker {
    private OnTaskDoneListener callback;
    private OnTaskErrorListener errorCallback;
    public Worker(OnTaskDoneListener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }
    public void start(int a) {
        for (int i = 0; i < 100; i++) {
            if (i == a) {
                errorCallback.onError("Task " + i + " is error");
            }
            callback.onDone("Task " + i + " is done");
        }
    }
}


