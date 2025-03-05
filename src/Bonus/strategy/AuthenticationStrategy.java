package Bonus.strategy;

public interface AuthenticationStrategy {
  boolean authenticate(String login, String password);
}
