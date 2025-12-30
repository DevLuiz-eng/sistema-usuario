package com.luizdev.sistema_usuario.service;

import com.luizdev.sistema_usuario.domain.User;
import com.luizdev.sistema_usuario.dto.request.UserRequest;
import com.luizdev.sistema_usuario.dto.response.UserResponse;
import com.luizdev.sistema_usuario.repository.UserRepository;
import com.luizdev.sistema_usuario.service.exceptions.NotFoundUserException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private final UserRepository repository;

    public UserService(UserRepository userRepository) {
        this.repository = userRepository;
    }

    public UserResponse createUser(UserRequest request) {
        User user = new User();

        user.setName(request.name());
        user.setAge(request.age());
        user.setEmail(request.email());

        repository.save(user);
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getAge());

    }

    public List<UserResponse> getAllUsers() {

        return repository.
                findAll().stream().
                map(u -> new UserResponse(
                        u.getId(),
                        u.getName(),
                        u.getEmail(),
                        u.getAge())).
                        toList();
    }

    public UserResponse getUserById(Long id) {
        var user = repository.findById(id).orElseThrow(() -> new NotFoundUserException("Nenhum usuário foi encontrado"));
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getAge());
    }

    public UserResponse update (Long id, UserRequest request) {
        var user = repository.findById(id).orElseThrow(() -> new NotFoundUserException("Nenhum usuário foi encontrado"));

        user.setEmail(request.email());
        user.setAge(request.age());
        user.setName(request.name());

        repository.save(user);
        return new UserResponse(user.getId(), user.getName(), user.getEmail(), user.getAge());
    }

    public void deleteAll() {
        repository.deleteAll();
    }

    public void deleteById (Long id) {
        repository.deleteById(id);
    }

}
