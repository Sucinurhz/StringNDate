public class Login {
    private final String correctUsername = "sucicantik";
    private final String correctPassword = "250825";

    public boolean validateLogin(String username, String password) {
        return username.equals(correctUsername) && password.equals(correctPassword);
    }
}
