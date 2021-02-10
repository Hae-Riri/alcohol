package kr.co.theplay.zzz;

import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ZUserRepository extends JpaRepository<ZUser, Long> {

    Optional<ZUser> findById(Long id);

    List<ZUser> findAll();
}
