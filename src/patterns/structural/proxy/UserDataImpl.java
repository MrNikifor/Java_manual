package patterns.structural.proxy;

import java.util.HashMap;
import java.util.Map;

public class UserDataImpl implements UserData {
    private Map<String , String> dataBase;

    public UserDataImpl() {
        dataBase = new HashMap<>();
        dataBase.put("1","Вова Ненасытов");
        dataBase.put("2","Ирина Переоридарога");
        dataBase.put("3","Михаил Многоруков");
    }

    public String getUserInfo(String userId) {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return dataBase.get(userId);
    }
}
