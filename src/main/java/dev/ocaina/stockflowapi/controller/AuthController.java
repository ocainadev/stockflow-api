package dev.ocaina.stockflowapi.controller;

import dev.ocaina.stockflowapi.dto.LoginRequest;
import dev.ocaina.stockflowapi.dto.LoginResponse;
import dev.ocaina.stockflowapi.dto.RegisterRequest;
import dev.ocaina.stockflowapi.models.ApiResponse;
import dev.ocaina.stockflowapi.service.AuthService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthController {
    private final AuthService authService;

    @PostMapping("/register")
    public ResponseEntity<ApiResponse<Void>> register(@RequestBody RegisterRequest request) {
        authService.register(request);
        return ResponseEntity.ok(ApiResponse.ok("Registrado com sucesso!"));
    }

    @PostMapping("/login")
    public ResponseEntity<ApiResponse<LoginResponse>> login(@RequestBody LoginRequest request) {
        LoginResponse token = authService.login(request);
        return ResponseEntity.ok(ApiResponse.success("Login Realizado com sucesso!", token));
    }
}
