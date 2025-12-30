package com.luizdev.sistema_usuario.repository;


import com.luizdev.sistema_usuario.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
