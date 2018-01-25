package com.developer.SpringMySQL.repo;

import com.developer.SpringMySQL.models.User;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by Bala on 6/25/2017.
 */
public interface UserRepo extends CrudRepository<User,Integer>{
}
