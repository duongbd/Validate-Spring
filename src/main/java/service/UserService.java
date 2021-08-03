
package service;

import model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import repository.UserRepository;

@Service
public class UserService {
    @Autowired
    @Qualifier("userRepository")
    private UserRepository userRepository;

    @Transactional
    public void addUser(User user){
        userRepository.save(user);
    }
}