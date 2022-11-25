package com.PersistenciaPostgrest.practica.repository;
import com.PersistenciaPostgrest.practica.model.UserDto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<UserDto, Long>{
}
