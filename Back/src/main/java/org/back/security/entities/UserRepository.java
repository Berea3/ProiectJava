package org.back.security.entities;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<User,Long> {
    @Query(value="select user from User user where user.utilizator = ?1")
    User findByUtilizator(String username);

    @Query(value = "select user from User user where user.id=?1")
    List<String> findById(String id);
}
