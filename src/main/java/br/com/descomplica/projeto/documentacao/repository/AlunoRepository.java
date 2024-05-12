package br.com.descomplica.projeto.documentacao.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.descomplica.projeto.documentacao.entity.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

    Optional<Aluno> findById(Long id);

    List<Aluno> findAll();

    Aluno save(Aluno aluno);

    void deleteById(Long id);
}
