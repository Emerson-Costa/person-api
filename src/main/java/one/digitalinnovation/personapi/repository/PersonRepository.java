package one.digitalinnovation.personapi.repository;

import one.digitalinnovation.personapi.entity.Person;
import org.springframework.data.jpa.repository.JpaRepository;

// Implementa a JpaRepository onde abre e fecha a conexão com o Banco de Dados com o CRUD incluso
public interface PersonRepository extends JpaRepository<Person, Long> {

}
