package nz.allthethings.wharehauora.controllers;

public class AuthController {

    public static boolean signIn(String username, String password, Runnable onSuccess, Runnable onFailure) {
        onSuccess.run();
        return true;
    }

    public static boolean isSignedIn() {
        return false;
    }
}
