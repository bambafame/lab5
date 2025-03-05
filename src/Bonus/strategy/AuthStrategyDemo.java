package Bonus.strategy;

public class AuthStrategyDemo {

  public static void main(String[] args) {
    AuthenticationContext context = new AuthenticationContext();

    // Test Username & Password Authentication
    context.setStrategy(new UsernamePasswordAuth());
    context.authenticateUser("user123", "password");

    System.out.println("----------------");

    // Test OAuth Authentication
    context.setStrategy(new OAuthAuth());
    context.authenticateUser("oauthShaban", "");

    System.out.println("----------------");

    // Test Biometric Authentication
    context.setStrategy(new BiometricAuth());
    context.authenticateUser("biometricYaakoub", "");
  }
}
