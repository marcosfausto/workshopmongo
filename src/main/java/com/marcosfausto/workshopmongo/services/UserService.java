package com.marcosfausto.workshopmongo.services;

import com.marcosfausto.workshopmongo.domain.User;
import com.marcosfausto.workshopmongo.dto.UserDTO;
import com.marcosfausto.workshopmongo.repository.UserRepository;
import com.marcosfausto.workshopmongo.services.exception.ObjectNotFoundException;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class UserService {

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

    public void delete(String id) {
        findById(id);
        userRepository.deleteById(id);
    }

    public User update(User user){
        User updatedUser = findById(user.getId());
        updateData(updatedUser,user);
        return userRepository.save(updatedUser);
    }

    private void updateData(User updatedUser, User user) {
        updatedUser.setEmail(user.getEmail());
        updatedUser.setName(user.getName());
    }


}
