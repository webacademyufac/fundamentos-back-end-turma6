package br.ufac.sgcm;

import java.sql.Connection;
import java.util.List;

import br.ufac.sgcm.dao.ConexaoDB;
import br.ufac.sgcm.dao.EspecialidadeDao;
import br.ufac.sgcm.dao.ProfissionalDao;
import br.ufac.sgcm.model.Especialidade;
import br.ufac.sgcm.model.Profissional;
import br.ufac.sgcm.model.Unidade;

public class Teste {
    public static void main(String[] args) {
        // Criar um objeto profissional
        Profissional p1 = new Profissional();
        p1.setNome("Limeira");
        p1.setRegistro("123");
        p1.setTelefone("68999999999");
        p1.setEmail("limeira@ufac.br");
        Unidade u1 = new Unidade();
        u1.setNome("Laboratório");
        u1.setEndereco("Av. Getúlio Vargas, nº:100");
        p1.setUnidade(u1);
        Especialidade e1 = new Especialidade();
        e1.setNome("Teste");
        p1.setEspecialidade(e1);
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Especialidade: " + p1.getEspecialidade().getNome());
        System.out.println("Unidade: " + p1.getUnidade().getNome());

        // Objeto da classe ConexaoDB
        // ConexaoDB conexao = new ConexaoDB();
        // Connection instacia = conexao.getConexao();
        // if (instacia != null)
        // System.out.println("Conectou!");
        // else
        // System.out.println("Falha na conexão!");

        EspecialidadeDao edao = new EspecialidadeDao();

        // Inserindo uma especialidade
        // if (edao.insert(e1) == 1)
        // System.out.println("Especialide inserida com sucesso");
        // else
        // System.out.println("Não inseriu");

        // Deletando uma especialidade
        // e1.setId(12L);
        // if (edao.delete(e1) == 1)
        // System.out.println("Especialidade excluída com sucesso!");
        // else
        // System.out.println("Não excluiu");

        // Atualizar uma especialidade
        // e1.setId(11L);
        // if (edao.update(e1) == 1)
        // System.out.println("Especialidade atualizada com sucesso!");
        // else
        // System.out.println("Especialidade não atualizada");
        // Lista das especialidades
        List<Especialidade> lista = edao.get("cardio");
        for (Especialidade e : lista) {
            // System.out.println(e.getId() + ": " + e.getNome());
            System.out.println(e);
        }

        // Teste do get especialidade
        Especialidade esp = edao.get(1L);
        System.out.println(esp.getNome());
        // Listar todos o profissionais
        ProfissionalDao pDao = new ProfissionalDao();
        List<Profissional> pLista = pDao.get();
        for (Profissional p : pLista)
            System.out.println(p.getNome() + ":" + p.getEspecialidade() + ":" +
                    p.getUnidade().getNome());

    }
}
