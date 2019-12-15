package employer.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import employer.models.Employer;

public interface EmployerRepository extends JpaRepository<Employer, Long>{

}
