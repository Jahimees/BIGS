package by.jahimees.bigs.service;

import by.jahimees.bigs.entity.Account;
import by.jahimees.bigs.facade.entity.util.CustomPrincipal;
import lombok.RequiredArgsConstructor;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CustomAuthenticationProvider implements AuthenticationProvider {

    private final AccountService accountService;
    private final BCryptPasswordEncoder passwordEncoder;

    @Override
    public Authentication authenticate(Authentication authentication) throws AuthenticationException {
        String username = authentication.getName();
        String password = authentication.getCredentials().toString();

        Optional<Account> accountOptional = accountService.findByUsername(username);
        if (accountOptional.isEmpty()) {
            throw new UsernameNotFoundException("User with username %s not found".formatted(username));
        }

        Account account = accountOptional.get();
        if (passwordEncoder.matches(password, account.getPassword())) {
            CustomPrincipal principal = new CustomPrincipal(account.getIdAccount());

            return new UsernamePasswordAuthenticationToken(principal, account.getAuthorities());
        } else {
            throw new BadCredentialsException("Password is wrong");
        }
    }

    @Override
    public boolean supports(Class<?> authentication) {
        return false;
    }
}
