package com.zedlab.interest.services;

import com.zedlab.interest.exceptions.UserNotFoundException;
import com.zedlab.interest.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailsService implements org.springframework.security.core.userdetails.UserDetailsService {

    public final UserRepository repository;

    @Autowired
    public UserDetailsService(UserRepository repository) {
        this.repository = repository;
    }

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        return repository.findUserByUsername(username)
                .orElseThrow(() -> new UserNotFoundException(String.format("Username %s not found !", username)));
    }
}
