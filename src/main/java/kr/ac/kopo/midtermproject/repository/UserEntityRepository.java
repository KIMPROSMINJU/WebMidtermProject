package kr.ac.kopo.midtermproject.repository;

import kr.ac.kopo.midtermproject.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserEntityRepository extends JpaRepository<UserEntity, String> {
}
