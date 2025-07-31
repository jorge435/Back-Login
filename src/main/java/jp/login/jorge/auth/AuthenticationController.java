package jp.login.jorge.auth;

import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/auth/v1")
@AllArgsConstructor
@CrossOrigin("*")
public class AuthenticationController {

    private final AuthenticationService authservice;

    public ResponseEntity<AuthenticationResponse> register (@RequestBody RegisterRequest request){
        try{
            AuthenticationResponse response = authservice.
        }catch (Exception e){
            e.getMessage();
        }
    }
}
