package mc.springboot.rest.example.springbootjpawithhibernateandh2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import mc.springboot.rest.example.springbootjpawithhibernateandh2.model.Users;

@Repository
public interface UserReppository extends JpaRepository<Users, Long> {

}
