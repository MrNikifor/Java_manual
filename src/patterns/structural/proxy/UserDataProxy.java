package patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class UserDataProxy implements UserData {
    private UserDataImpl userData;
    private Map<String,String> cache;

    public UserDataProxy() {
        this.userData = new UserDataImpl();
        this.cache = new HashMap<>();
    }

    public String getUserInfo(String userId) {
        if (cache.containsKey(userId)) {
            System.out.println("Data from the cache for the user:");
            return cache.get(userId);
        }

        System.out.println("Data from the Database for the user:");

        String userInfo = userData.getUserInfo(userId);

        cache.put(userId,userInfo);

        return userInfo;
    }
}
