package Bonus.strategy;

public class UsernamePasswordAuth implements AuthenticationStrategy{

  @Override
  public boolean authenticate(String login, String password) {
    if ("bambafame".equals(login) && "P@$sw0rd".equals(password)) {
      System.out.println("Authenticated using Username & Password");
      return true;
    }
    System.out.println("Username & Password authentication failed");
    return false;
  }
}
