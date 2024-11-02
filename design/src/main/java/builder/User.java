package builder;

public class User {

    private final String name;
    private final String lastName;
    private final int age;

    public User(UserBuilder builder) {
        this.name = builder.name;
        this.lastName = builder.name;
        this.age = builder.age;
    }


    public static class UserBuilder {

        private String name;
        private String lastName;
        private int age;

        public UserBuilder name(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder lastName(String lastName) {
            this.lastName = lastName;
            return this;
        }

        public UserBuilder age(int age) {
            this.age = age;
            return this;
        }

        public User build() {
            return new User(this);
        }
    }
}
