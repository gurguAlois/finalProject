package com.sda.auction.util;


import com.sda.auction.model.User;
import com.sda.auction.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

@Component
public class AuthenticationFacade  implements IAuthenticationFacade {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Authentication getAuthentication() {
        return SecurityContextHolder.getContext().getAuthentication();
    }

    public User getUser() {
        String email = ((org.springframework.security.core.userdetails.User) this.getAuthentication().getPrincipal()).getUsername();
        return this.userRepository.findByEmail(email);
    }
}
