package org.spring.mvc.repository;

import org.spring.mvc.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

/**
 * @author balexandru
 */
@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}
