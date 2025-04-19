package security;

import com.nimbusds.openid.connect.sdk.AuthenticationResponse;
import dto.AuthenticationRequest;
import dto.RegisterRequest;
import entity.User;
import enums.Role;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;
import reponsitory.UserRepository;
import security.jwt.JwtService;

// cai nay tao cuoi cung(dcm gay nham lan vcl )
@Service


public class AuthenticationService {
    @Autowired
    private  UserRepository userRepository;
    @Autowired
    private  PasswordEncoder passwordEncoder;
    @Autowired
    private  JwtService jwtService;
    @Autowired
    private  AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request){
        var user = User.builder()
                .userName(request.getUserName())
                .firstName(request.getFirstName())
                .lastName(request.getLastName())
                .email(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .numberPhone(request.getNumberPhone())
                .role(Role.USER)
                .build();

       userRepository.save(user);
        var jwtToken = jwtService.generateToken(user);
       return (AuthenticationResponse) dto.AuthenticationResponse.builder()
               .token(jwtToken)
               .build();

    }
    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        authenticationManager.authenticate(
                new UsernamePasswordAuthenticationToken(
                        request.getEmail(),
                        request.getPassword()
                )
        );
        var user = userRepository.findByEmail(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return (AuthenticationResponse) dto.AuthenticationResponse.builder()
                .token(jwtToken)
                .build();
    }
}
