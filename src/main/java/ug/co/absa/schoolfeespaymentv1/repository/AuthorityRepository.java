package ug.co.absa.schoolfeespaymentv1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ug.co.absa.schoolfeespaymentv1.domain.Authority;

/**
 * Spring Data JPA repository for the {@link Authority} entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {}
