package br.ufac.sgcm.controller;

import java.util.List;
import java.util.ArrayList;

import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.model.Especialidade;

public class EspecialidadeController implements IController<Especialidade> {
    // Todos os métodos da camada DAO dever estar disponíveis
    // Métodos das regras de negócio da aplicação

    EspecialidadeDao eDao;

    public EspecialidadeController() {
        eDao = new EspecialidadeDao();
    }

    @Override
    public int delete(Especialidade objeto) {
        int registrosAfetados = 0;
        registrosAfetados = eDao.delete(objeto);
        return registrosAfetados;
    }

    @Override
    public List<Especialidade> get() {
        List<Especialidade> registros = new ArrayList<>();
        registros = eDao.get();
        return registros;
    }

    @Override
    public Especialidade get(Long id) {
        Especialidade registro = new Especialidade();
        registro = eDao.get(id);
        return registro;
    }

    @Override
    public List<Especialidade> get(String termoBusca) {
        List<Especialidade> registros = new ArrayList<>();
        registros = eDao.get(termoBusca);
        return registros;
    }

    @Override
    public int save(Especialidade objeto) {
        int registrosAfetados = 0;
        if (objeto.getId() == null) // Se o objeto tem id não existe no banco, logo vamos inserir
            registrosAfetados = eDao.insert(objeto);
        else // caso contrário vamos atualizar
            registrosAfetados = eDao.update(objeto);
        return registrosAfetados;
    }

}
