package Bonus.strategy;

public class AuthenticationContext {
  private AuthenticationStrategy strategy;

  public AuthenticationContext() {
  }

  public void setStrategy(AuthenticationStrategy strategy) {
    this.strategy = strategy;
  }

  // Execute authentication based on the selected strategy
  public boolean authenticateUser(String username, String password) {
    return strategy.authenticate(username, password);
  }
}
