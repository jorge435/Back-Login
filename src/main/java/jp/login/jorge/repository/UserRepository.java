package jp.login.jorge.repository;

import jp.login.jorge.enitty.Rol;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Rol, Long> {
    Rol findByName(String name);
}
