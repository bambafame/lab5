package Bonus.strategy;

public class OAuthAuth implements AuthenticationStrategy{

  @Override
  public boolean authenticate(String login, String password) {
    if ("oauthShaban".equals(login)) {
      System.out.println("Authenticated using OAuth (Google/Facebook)");
      return true;
    }
    System.out.println("OAuth authentication failed");
    return false;
  }
}
