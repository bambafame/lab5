package Bonus.strategy;

public class BiometricAuth implements AuthenticationStrategy{

  @Override
  public boolean authenticate(String login, String password) {
    if ("biometricYaakoub".equals(login)) {
      System.out.println("Authenticated using Biometric Authentication");
      return true;
    }
    System.out.println("Biometric authentication failed");
    return false;
  }
}
