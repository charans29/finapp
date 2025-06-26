package com.springboot.finapp.repository;

import com.springboot.finapp.model.User;
import org.springframework.data.cassandra.repository.CassandraRepository;

public interface UserRepository extends CassandraRepository<User, String> {

}