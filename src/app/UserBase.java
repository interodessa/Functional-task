package app;

import java.util.Arrays;
import java.util.List;
public class UserBase {
    public List<User> getBase(){
        return Arrays.asList(new User("user1", "0735687771"),
                new User("user2", "0735687772"),
                new User("user3", "0735687773"),
                new User("user4", "0735687774"),
                new User("user5", "0735687775"));
    }
}
