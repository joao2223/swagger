package br.com.descomplica.projeto.documentacao.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.descomplica.projeto.documentacao.entity.Aluno;
import br.com.descomplica.projeto.documentacao.repository.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public List<Aluno> getAllAlunos() {
		return alunoRepository.findAll();
	}

	public Aluno getAlunoById(Long id) {
		return alunoRepository.findById(id).orElse(null);
	}

	public Aluno saveAluno(Aluno aluno) {
		return alunoRepository.save(aluno);
	}

	public Aluno updateAluno(Long id, Aluno aluno) {
		Aluno alunoExistente = alunoRepository.findById(id).orElse(null);
		if (alunoExistente != null) {
			alunoExistente.setNome(aluno.getNome());
			alunoExistente.setIdade(aluno.getIdade());
			// Defina outros atributos conforme necessário
			return alunoRepository.save(alunoExistente);
		} else {
			return null;
		}
	}

	public void deleteAluno(Long id) {
		alunoRepository.deleteById(id);
	}
}
