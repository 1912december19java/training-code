package com.revature.appuser;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	
	public List<User> findByUsername(String username);
	
	//We can also write queries
	@Query(value = "SELECT u FROM User u WHERE u.username = :username AND u.password = :password")
	public List<User> checkIfValid(String username, String password);

}
