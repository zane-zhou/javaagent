import com.alibaba.fastjson.JSON;

import java.sql.SQLOutput;

/**
 * Created by zane on 2020/5/11
 */
public class User {
    public String name;

    public User(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                '}';
    }
    public static void main(String[] args) {
        User user = new User("zane");
        System.out.println(JSON.toJSON(user));
        System.out.println(user.toString());
    }
}
