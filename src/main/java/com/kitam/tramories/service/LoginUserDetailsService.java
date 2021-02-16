package com.kitam.tramories.service;

import com.kitam.tramories.domain.user.User;
import com.kitam.tramories.domain.user.UserRepository;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class LoginUserDetailsService implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        Optional<User> user = userRepository.findById(username);
        if (user == null) {
            throw new UsernameNotFoundException("The requested user is not found.");
        }
        return new LoginUserDetails(user.get());
    }
}