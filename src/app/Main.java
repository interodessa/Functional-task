package app;

public class Main {
    public static void main(String[] args) {
        DataHandler handler = new DataHandler();
        handler.handleData(new UserBase().getBase(), handler.getConsumer());
    }
}
