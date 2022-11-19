package com.marcosfausto.workshopmongo.services;

import com.marcosfausto.workshopmongo.domain.User;
import com.marcosfausto.workshopmongo.dto.UserDTO;
import com.marcosfausto.workshopmongo.repository.UserRepository;
import com.marcosfausto.workshopmongo.services.exception.ObjectNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class UserService {

    @Autowired
    private UserRepository userRepository;

    public List<User> findAll() {
        return userRepository.findAll();
    }
    public User findById(String id) {
        Optional<User> user = userRepository.findById(id);
        return user.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado!"));
    }

    public User fromDTO(UserDTO userDTO) {
        return new User(userDTO.getId(),userDTO.getName(),userDTO.getEmail());
    }

    public User insert(User user) {
        return userRepository.insert(user);
    }


}
