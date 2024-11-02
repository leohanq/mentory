package builder;

public class UserTest {

    public static void main(String[] args) {
        User user = new User.UserBuilder().name("leo").lastName("quintero")
                .age(40).build();
    }
}
