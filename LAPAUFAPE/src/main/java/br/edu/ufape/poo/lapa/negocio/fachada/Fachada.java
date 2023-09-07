package br.edu.ufape.poo.lapa.negocio.fachada;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Service;

import br.edu.ufape.poo.lapa.negocio.basico.Animal;
import br.edu.ufape.poo.lapa.negocio.basico.Area;
import br.edu.ufape.poo.lapa.negocio.basico.ExameHistopatologico;
import br.edu.ufape.poo.lapa.negocio.basico.Laudo;
import br.edu.ufape.poo.lapa.negocio.basico.Necropsia;
import br.edu.ufape.poo.lapa.negocio.basico.Orgao;
import br.edu.ufape.poo.lapa.negocio.basico.ParteNecropsia;
import br.edu.ufape.poo.lapa.negocio.basico.Patologista;
import br.edu.ufape.poo.lapa.negocio.basico.Tutor;
import br.edu.ufape.poo.lapa.negocio.basico.Veterinario;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroAnimal;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroArea;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroExameHistopatologico;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroLaudo;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroNecropsia;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroOrgao;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroParteNecropsia;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroPatologista;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroTutor;
import br.edu.ufape.poo.lapa.negocio.cadastro.InterfaceCadastroVeterinario;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.PatologistaNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.TutorNaoExisteException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.UsuarioDuplicadoException;
import br.edu.ufape.poo.lapa.negocio.cadastro.exception.VeterinarioNaoExisteException;

@Service
public class Fachada {
	
	@Autowired
	private InterfaceCadastroVeterinario cadastroVeterinario;
	@Autowired
	private InterfaceCadastroTutor cadastroTutor;
	@Autowired
	private InterfaceCadastroPatologista cadastroPatologista;
	@Autowired
	private InterfaceCadastroParteNecropsia cadastroParteNecropsia;
	@Autowired
	private InterfaceCadastroOrgao cadastroOrgao;
	@Autowired
	private InterfaceCadastroNecropsia cadastroNecropsia;
	@Autowired
	private InterfaceCadastroLaudo cadastroLaudo;
	@Autowired
	private InterfaceCadastroExameHistopatologico cadastroHistoPatologico;
	@Autowired
	private InterfaceCadastroArea cadastroArea;
	@Autowired
	private InterfaceCadastroAnimal cadastroAnimal;
	

	public <S extends Veterinario> S SalvarVeterinario(S entity) throws UsuarioDuplicadoException {
		return cadastroVeterinario.SalvarVeterinario(entity);
	}

	public Optional<Veterinario> procurarVeterinarioPorID(Long id) throws VeterinarioNaoExisteException {
		return cadastroVeterinario.procurarVeterinarioPorID(id);
	}

	public boolean tutorExistePorId(Long id) {
		return cadastroVeterinario.veterinarioExistePorId(id);
	}

	public long contarVeterinarios() {
		return cadastroVeterinario.contarVeterinarios();
	}

	public void deletarVeterinarioPorId(Long id) {
		cadastroVeterinario.deletarVeterinarioPorId(id);
	}

	public List<Veterinario> acharTodosOsVeterinarios() {
		return cadastroVeterinario.acharTodosOsVeterinarios();
	}
	public List<Veterinario> procurarVeterinarioPorNome(String nome)throws VeterinarioNaoExisteException {
		return cadastroVeterinario.procurarVeterinarioPorNome(nome);
	}

	public <S extends Tutor> S salvarTutor(S entity) throws UsuarioDuplicadoException {
		return cadastroTutor.salvarTutor(entity);
	}

	public List<Tutor> procurarTodosOsTutores() {
		return cadastroTutor.procurarTodosOsTutores();
	}

	public Tutor procurarTutorPorId(Long id) throws TutorNaoExisteException {
		return cadastroTutor.procurarTutorPorId(id);
	}

	public <S extends Tutor> boolean tutorExiste(Example<S> example) {
		return cadastroTutor.tutorExiste(example);
	}

	public long contarTutores() {
		return cadastroTutor.contarTutores();
	}

	public void deletarTutorPorId(Long id) {
	    cadastroTutor.deletarTutorPorId(id);
	}

	public void deletarTutor(Tutor entity) {
		cadastroTutor.deletarTutor(entity);
	}
	
	public List<Tutor> procurarTutorPorNome(String nome)throws TutorNaoExisteException{
		return cadastroTutor.procurarTutorPorNome(nome);
	}

	public <S extends Patologista> S salvarPatologista(S entity) throws UsuarioDuplicadoException {
		return cadastroPatologista.salvarPatologista(entity);
	}

	public Optional<Patologista> procurarPatologistaPorId(Long id) throws PatologistaNaoExisteException {
		return cadastroPatologista.procurarPatologistaPorId(id);
	}

	public boolean patologistaexistePorId(Long id) {
		return cadastroPatologista.patologistaexistePorId(id);
	}

	public long contarPatologista() {
		return cadastroPatologista.contarPatologista();
	}

	public void deletarPatologistaPorId(Long id) {
		cadastroPatologista.deletarPatologistaPorId(id);
	}

	public void deletarPatologista(Patologista entity) {
		cadastroPatologista.deletarPatologista(entity);
	}
	
	public List<Patologista> procurarPatologistaPorNome(String nome)throws PatologistaNaoExisteException{
		return cadastroPatologista.procurarPatologistaPorNome(nome);
	}

	public <S extends ParteNecropsia> S salvarParteNecropsia(S entity) {
		return cadastroParteNecropsia.salvarParteNecropsia(entity);
	}

	public List<ParteNecropsia> encontrarTodasPartesNecropsias() {
		return cadastroParteNecropsia.encontrarTodasPartesNecropsias();
	}

	public Optional<ParteNecropsia> encontrarParteNecropsiaPorId(Long id) {
		return cadastroParteNecropsia.encontrarParteNecropsiaPorId(id);
	}

	public long contarPartesNecropsias() {
		return cadastroParteNecropsia.contarPartesNecropsias();
	}

	public void deletarParteNecropsiaPorId(Long id) {
		cadastroParteNecropsia.deletarParteNecropsiaPorId(id);
	}

	public void deletarParteNecropsia(ParteNecropsia entity) {
		cadastroParteNecropsia.deletarParteNecropsia(entity);
	}

	public <S extends Orgao> S save(S entity) {
		return cadastroOrgao.save(entity);
	}

	public List<Orgao> findAll() {
		return cadastroOrgao.findAll();
	}

	public Optional<Orgao> findById(Long id) {
		return cadastroOrgao.findById(id);
	}

	public long count() {
		return cadastroOrgao.count();
	}

	public void deleteById(Long id) {
		cadastroOrgao.deleteById(id);
	}

	public void delete(Orgao entity) {
		cadastroOrgao.delete(entity);
	}

	public <S extends Necropsia> S salvarNecropsia(S entity) {
		return cadastroNecropsia.salvarNecropsia(entity);
	}

	public List<Necropsia> encontrarTodasNecropsias() {
		return cadastroNecropsia.encontrarTodasNecropsias();
	}

	public Optional<Necropsia> encontrarNecropsiasPorId(Long id) {
		return cadastroNecropsia.encontrarNecropsiasPorId(id);
	}

	public long contarNecropsias() {
		return cadastroNecropsia.contarNecropsias();
	}

	public void deletarNecropsiaPorId(Long id) {
		cadastroNecropsia.deletarNecropsiaPorId(id);
	}

	public void deletarNecropsia(Necropsia entity) {
		cadastroNecropsia.deletarNecropsia(entity);
	}

	public <S extends Laudo> S salvarLaudo(S entity) {
		return cadastroLaudo.salvarLaudo(entity);
	}

	public List<Laudo> encontrarTodosLaudos() {
		return cadastroLaudo.encontrarTodosLaudos();
	}

	public Optional<Laudo> encontrarLaudoPorId(Long id) {
		return cadastroLaudo.encontrarLaudoPorId(id);
	}

	public long contarLaudos() {
		return cadastroLaudo.contarLaudos();
	}

	public void deletarLaudoPorId(Long id) {
		cadastroLaudo.deletarLaudoPorId(id);
	}

	public void deletarLaudo(Laudo entity) {
		cadastroLaudo.deletarLaudo(entity);
	}

	public <S extends ExameHistopatologico> S salvarExameHistopatologico(S entity) {
		return cadastroHistoPatologico.salvarExameHistopatologico(entity);
	}

	public List<ExameHistopatologico> encontrarTodosExamesHistopatologicos() {
		return cadastroHistoPatologico.encontrarTodosExamesHistopatologicos();
	}

	public Optional<ExameHistopatologico> encontrarExameHistopatologicoPorId(Long id) {
		return cadastroHistoPatologico.encontrarExameHistopatologicoPorId(id);
	}

	public long contarExamesHistopatologicos() {
		return cadastroHistoPatologico.contarExamesHistopatologicos();
	}

	public void deletarExameHistopatologicoPorId(Long id) {
		cadastroHistoPatologico.deletarExameHistopatologicoPorId(id);
	}

	public void deletarTodosExamesHistopatologicos() {
		cadastroHistoPatologico.deletarTodosExamesHistopatologicos();
	}

	public <S extends Area> S salvarArea(S entity) {
		return cadastroArea.salvarArea(entity);
	}

	public List<Area> encontrarTodasAreas() {
		return cadastroArea.encontrarTodasAreas();
	}

	public Optional<Area> encontrarAreaPorId(Long id) {
		return cadastroArea.encontrarAreaPorId(id);
	}

	public long contarAreas() {
		return cadastroArea.contarAreas();
	}

	public void deletarAreaPorId(Long id) {
		cadastroArea.deletarAreaPorId(id);
	}

	public void deletarArea(Area entity) {
		cadastroArea.deletarArea(entity);
	}

	public <S extends Animal> S salvarAnimal(S entity) {
		return cadastroAnimal.salvarAnimal(entity);
	}

	public List<Animal> encontrarTodosAnimais() {
		return cadastroAnimal.encontrarTodosAnimais();
	}

	public Optional<Animal> encontrarAnimalPorId(Long id) {
		return cadastroAnimal.encontrarAnimalPorId(id);
	}

	public long contarAnimais() {
		return cadastroAnimal.contarAnimais();
	}

	public void deletarAnimaisPorId(Long id) {
		cadastroAnimal.deletarAnimaisPorId(id);
	}

	public void deletarAnimal(Animal entity) {
		cadastroAnimal.deletarAnimal(entity);
	}

}
