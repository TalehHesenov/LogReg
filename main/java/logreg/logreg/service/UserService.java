package logreg.logreg.service;
import logreg.logreg.model.User;
import org.springframework.ui.Model;

public interface UserService {
    User registerUSer(String login, String password, String email);

    User authenticate(String login, String password);
}