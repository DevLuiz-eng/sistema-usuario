package com.luizdev.sistema_usuario.controller;

import com.luizdev.sistema_usuario.dto.request.UserRequest;
import com.luizdev.sistema_usuario.dto.response.UserResponse;
import com.luizdev.sistema_usuario.service.UserService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    public final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public ResponseEntity<UserResponse> createUser(@RequestBody UserRequest request) {
        return ResponseEntity.status(HttpStatus.CREATED).body(service.createUser(request));
    }

    @GetMapping
    public ResponseEntity<List<UserResponse>> getAllUsers () {
        return ResponseEntity.ok(service.getAllUsers());
    }

    @GetMapping("/{id}")
    public ResponseEntity<UserResponse> getUserById (@PathVariable Long id) {
        return ResponseEntity.ok(service.getUserById(id));
    }

    @PutMapping("/{id}")
    public ResponseEntity<UserResponse> update (@PathVariable Long id, @RequestBody UserRequest request) {
        return ResponseEntity.ok(service.update(id, request));
    }

    @DeleteMapping
    public ResponseEntity<Void> deleteAll () {
        service.deleteAll();
        return ResponseEntity.noContent().build();
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteById (@PathVariable Long id) {
        service.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}
