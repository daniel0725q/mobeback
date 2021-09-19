package com.quinterodaniel.mobeback.user.infrastructure.persistence.repository;

import com.quinterodaniel.mobeback.user.infrastructure.persistence.entity.User;
import org.springframework.data.repository.CrudRepository;

public interface UsersRepository extends CrudRepository<Long, User> {
}
