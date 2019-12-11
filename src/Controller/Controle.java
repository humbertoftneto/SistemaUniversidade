package Controller;

import java.util.ArrayList;
import Model.ProfessoresBEAN;
import Model.ProfessoresDAO;
import Model.DisciplinasBEAN;
import Model.DisciplinasDAO;
import Model.TurmasBEAN;
import Model.TurmasDAO;
import Model.AlunosBEAN;
import Model.AlunosDAO;
import Model.FaculdadesBEAN;
import Model.FaculdadesDAO;

public class Controle {

    public Controle() {
    }

    public void addProfessor(ProfessoresBEAN professor) {
        ProfessoresDAO.getInstance().create(professor);
    }

    public void updateProfessor(ProfessoresBEAN professor) {
        ProfessoresDAO.getInstance().update(professor);
    }

    public ProfessoresBEAN findProfessor(int idProfessor) {
        return ProfessoresDAO.getInstance().findProfessor(idProfessor);
    }

    public int findIdProfessor(ProfessoresBEAN professor) {
        return ProfessoresDAO.getInstance().findIdProfessor(professor);
    }

    public Boolean isExistProfessor(int idProfessor) {
        return ProfessoresDAO.getInstance().isExistProfessor(idProfessor);
    }

    public ArrayList<ProfessoresBEAN> listaProfessores() {
        return ProfessoresDAO.getInstance().findAllProfessor();
    }

//----------------------------------------------------------------------------------------------------------------------
    public void addAluno(AlunosBEAN aluno) {
        AlunosDAO.getInstance().create(aluno);
    }

    public void updateAluno(AlunosBEAN aluno) {
        AlunosDAO.getInstance().update(aluno);
    }

    public AlunosBEAN findAluno(int matriculaAluno) {
        return AlunosDAO.getInstance().findAluno(matriculaAluno);
    }

    public int findMatriculaAluno(AlunosBEAN aluno) {
        return AlunosDAO.getInstance().findMatriculaAluno(aluno);
    }

    public Boolean isExistAluno(int matriculaAluno) {
        return AlunosDAO.getInstance().isExistAluno(matriculaAluno);
    }

    public ArrayList<AlunosBEAN> listaAlunos() {
        return AlunosDAO.getInstance().findAllAluno();
    }

//----------------------------------------------------------------------------------------------------------------------
    public void addTurma(TurmasBEAN turma) {
        TurmasDAO.getInstance().create(turma);
    }

    public void updateTurma(TurmasBEAN turma) {
        TurmasDAO.getInstance().update(turma);
    }

    public TurmasBEAN findTurma(int idTurma) {
        return TurmasDAO.getInstance().findTurma(idTurma);
    }

    public int findIdTurma(TurmasBEAN turma) {
        return TurmasDAO.getInstance().findIdTurma(turma);
    }

    public Boolean isExistTurma(int idTurma) {
        return TurmasDAO.getInstance().isExistTurma(idTurma);
    }

    public ArrayList<TurmasBEAN> listaTurmas() {
        return TurmasDAO.getInstance().findAllTurma();
    }

//----------------------------------------------------------------------------------------------------------------------
    public void addDisciplina(DisciplinasBEAN disciplina) {
        DisciplinasDAO.getInstance().create(disciplina);
    }

    public void updateDisciplina(DisciplinasBEAN disciplina) {
        DisciplinasDAO.getInstance().update(disciplina);
    }

    public DisciplinasBEAN findDisciplina(int idDisciplina) {
        return DisciplinasDAO.getInstance().findDisciplina(idDisciplina);
    }

    public int findIdDisciplina(DisciplinasBEAN disciplina) {
        return DisciplinasDAO.getInstance().findIdDisciplina(disciplina);
    }

    public Boolean isExistDisciplina(int idDisciplina) {
        return DisciplinasDAO.getInstance().isExistDisciplina(idDisciplina);
    }

    public ArrayList<DisciplinasBEAN> listaDisciplinas() {
        return DisciplinasDAO.getInstance().findAllDisciplina();
    }

//----------------------------------------------------------------------------------------------------------------------
    public void addFaculdade(FaculdadesBEAN faculdade) {
        FaculdadesDAO.getInstance().create(faculdade);
    }

    public void updateFaculdade(FaculdadesBEAN faculdade) {
        FaculdadesDAO.getInstance().update(faculdade);
    }

    public FaculdadesBEAN findFaculdade(int idFaculdade) {
        return FaculdadesDAO.getInstance().findFaculdade(idFaculdade);
    }

    public int findIdFaculdade(FaculdadesBEAN faculdade) {
        return FaculdadesDAO.getInstance().findIdFaculdade(faculdade);
    }

    public Boolean isExistFaculdade(int idFaculdade) {
        return FaculdadesDAO.getInstance().isExistFaculdade(idFaculdade);
    }

    public ArrayList<FaculdadesBEAN> listaFaculdades() {
        return FaculdadesDAO.getInstance().findAllFaculdade();
    }
}
