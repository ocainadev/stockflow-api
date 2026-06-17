package dev.ocaina.stockflowapi.service;

import dev.ocaina.stockflowapi.dto.LoginRequest;
import dev.ocaina.stockflowapi.dto.LoginResponse;
import dev.ocaina.stockflowapi.dto.RegisterRequest;
import dev.ocaina.stockflowapi.entity.User;
import dev.ocaina.stockflowapi.models.UserRole;
import dev.ocaina.stockflowapi.exception.BusinessException;
import dev.ocaina.stockflowapi.repository.UserRepository;
import dev.ocaina.stockflowapi.security.JwtService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class AuthService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;

    public void register(RegisterRequest request) {
        if (userRepository.findByEmail(request.email()).isPresent()) {
            throw new BusinessException("Email already exists");
        }

        User user = User.builder()
                .name(request.name())
                .email(request.email())
                .passwordHash(passwordEncoder.encode(request.password()))
                .role(UserRole.USER)
                .build();

        userRepository.save(user);
    }

    public LoginResponse login(LoginRequest request){
        User user = userRepository.findByEmail(request.email())
                .orElseThrow(() -> new BusinessException("Invalid email or password"));

        boolean passwordMatches = passwordEncoder.matches(request.password(), user.getPasswordHash());

        if (!passwordMatches) {
            throw new BusinessException("Invalid password");
        }
        String token = jwtService.generateToken(user);

        return new LoginResponse(token);
    }
}
