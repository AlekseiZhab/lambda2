public class Main {
    public static void main(String[] args) {
        Worker.OnTaskDonelistener listener = System.out::println;
        Worker.OnTaskErrorListener errorlistener = System.out::println;
        Worker worker = new Worker(listener, errorlistener);
        worker.start();
    }
}