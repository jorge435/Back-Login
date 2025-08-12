package jp.login.jorge.repository;

import jp.login.jorge.enitty.Rol;
import jp.login.jorge.enitty.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface RolRepository extends JpaRepository<Rol, Long> {

    Rol findByName(String name);
};
