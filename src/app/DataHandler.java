package app;
import java.util.List;
import java.util.function.Consumer;
public class DataHandler {
    public void handleData(List<User> list, Consumer <User> consumer) {
        for (User user : list) {
            consumer.accept(user);
        }
    }
    public Consumer <User> getConsumer() {
        return User -> new Outputter().getAllUser(User.toString());
    }
}
