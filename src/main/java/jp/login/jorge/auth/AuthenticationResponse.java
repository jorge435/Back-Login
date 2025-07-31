package jp.login.jorge.auth;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationResponse {

    private Long id;
    private String token;
    private String mensaje;

    public AuthenticationResponse (String mensaje) {this.mensaje = mensaje; }
}
