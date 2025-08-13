package jp.login.jorge.auth;


import jp.login.jorge.enitty.Rol;
import jp.login.jorge.enitty.User;
import jp.login.jorge.repository.RolRepository;
import jp.login.jorge.repository.UserRepository;
import jp.login.jorge.service.JwtService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
@Slf4j
public class AuthenticationService {

    private final UserRepository userRepository;
    private final RolRepository rolRepository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;


    public AuthenticationResponse register(RegisterRequest requets){
        Rol rol = rolRepository.findByName("User");
        if(rol == null){
            rol = new Rol();
            rol.setName("User");
            rol = rolRepository.save(rol);
        }
        User user = new User();
        user.setName(requets.getName());
        user.setLastname(requets.getLastname());
        user.setEmail(requets.getEmail());
        user.setPasswrod(requets.getPassword());
        user.setRol(rol);


    }


}
