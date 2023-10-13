public class Worker {
    private final OnTaskDonelistener callback;
    private final OnTaskErrorListener errorCallback;

    public Worker(OnTaskDonelistener callback, OnTaskErrorListener errorCallback) {
        this.callback = callback;
        this.errorCallback = errorCallback;
    }

    public void start() {
        for (int i = 0; i < 100; i++) {
            if (i == 33) {
                errorCallback.onError("Task " + i + " is error");
            } else callback.onDone("Task " + i + " is done");
        }
    }

    @FunctionalInterface
    public interface OnTaskDonelistener {
        void onDone(String result);
    }

    @FunctionalInterface
    public interface OnTaskErrorListener {
        void onError(String result);
    }
}
