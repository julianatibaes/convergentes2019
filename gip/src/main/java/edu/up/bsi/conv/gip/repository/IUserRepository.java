package edu.up.bsi.conv.gip.repository;

import org.springframework.data.repository.CrudRepository;

import edu.up.bsi.conv.gip.entity.User;

public interface IUserRepository extends CrudRepository<User, Integer>{

}
