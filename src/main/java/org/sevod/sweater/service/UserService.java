package org.sevod.sweater.service;

import org.sevod.sweater.repos.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserDetailsService {
//    @Autowired  //это не обязательно, отработает конструктор
//    private final UserRepo userRepo;
//
//    public UserService(UserRepo userRepo) {
//        this.userRepo = userRepo;
//    }

//но для обучения оставляем так

    @Autowired  //это не обязательно, отработает конструктор
    private UserRepo userRepo;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return userRepo.findByUsername(username);
    }
}
