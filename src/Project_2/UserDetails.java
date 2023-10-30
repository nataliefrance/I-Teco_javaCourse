package Project_2;

public class UserDetails {
    private final Role role;
    private final String login;
    private final String password;
    private final String name;

    public UserDetails(Role role, String login, String password, String name) {
        this.role = role;
        this.login = login;
        this.password = password;
        this.name = name;
    }

    public Role getRole() {
        return role;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public String getName() {
        return name;
    }
}
