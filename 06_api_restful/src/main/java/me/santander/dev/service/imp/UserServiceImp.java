package me.santander.dev.service.imp;

import me.santander.dev.model.User;
import me.santander.dev.repository.UserRepository;
import me.santander.dev.service.UserService;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public class UserServiceImp implements UserService {

    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository){
        this.userRepository= userRepository;
    };

    @Override
    public User findById(Long id) {
        return userRepository.findById(id).orElseThrow(NoSuchElementException::new);
    }

    @Override
    public User create(User userToCreate) {
            if (userRepository.existsByAccountNumber(userToCreate.getAccount().getNumber())) {
                throw new IllegalArgumentException("This User ID ");
            }
            return userRepository.save(userToCreate);
        }
}
