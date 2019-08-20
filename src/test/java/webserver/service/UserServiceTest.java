package webserver.service;

import db.DataBase;
import model.User;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class UserServiceTest {
    @Test
    public void createUserTest() {
        User user = new User("lime","1234","sung","lime@naver.com");
        UserService.addUser(user);
        assertThat(DataBase.findUserById("lime")).isEqualTo(user);
    }
}
