package logreg.logreg.service.impl;

import logreg.logreg.model.User;
import logreg.logreg.repository.UserRepository;
import logreg.logreg.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.Banner;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
   private UserRepository userRepository;
    @Override
    public User registerUSer(String login, String password, String email) {
        if (login != null && password !=null){
            User user = new User();
            user.setLogin(login);
            user.setPassword(password);
            user.setEmail(email);

                return userRepository.save(user);


        }
        else {
            return null;
        }
    }

    @Override
    public User authenticate(String login, String password) {
        return userRepository.findByLoginAndPassword(login,password).orElse(null);
    }
}
