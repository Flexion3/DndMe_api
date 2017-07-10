package api.inputs;

public class RegisterInput {
    private String email;
    private String password;

    public RegisterInput() {
    }

    public RegisterInput(String email, String password) {
        this.email = email;
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }
}
