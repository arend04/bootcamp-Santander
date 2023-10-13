package arend.bootcamp.Santander.service;


import arend.bootcamp.Santander.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
