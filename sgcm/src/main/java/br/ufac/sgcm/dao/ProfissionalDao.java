package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufac.sgcm.model.Especialidade;
import br.ufac.sgcm.model.Profissional;

public class ProfissionalDao implements IDao<Profissional> {
    private Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;
    private EspecialidadeDao eDao;
    private UnidadeDao uDao;

    // Construtor
    public ProfissionalDao() {
        conexao = new ConexaoDB().getConexao();
        eDao = new EspecialidadeDao();
        uDao = new UnidadeDao();
    }

    // Excluir
    @Override
    public int delete(Profissional objeto) {
        // TODO Auto-generated method stub
        return 0;
    }

    // Listar todos os profissionais
    @Override
    public List<Profissional> get() {
        List<Profissional> registros = new ArrayList<>();
        String sql = "SELECT * FROM profissional";
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Profissional p = new Profissional();
                p.setId(rs.getLong("id"));
                p.setEmail(rs.getString("email"));
                p.setNome(rs.getString("nome"));
                p.setRegistro(rs.getString("registro_conselho"));
                p.setTelefone(rs.getString("telefone"));

                Long id = rs.getLong("especialidade_id");
                Especialidade esp = eDao.get(id);
                p.setEspecialidade(esp);

                p.setUnidade(uDao.get(rs.getLong("unidade_id")));
                registros.add(p);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        return registros;
    }

    // Listar os profissionais de acordo com um termo de busca
    @Override
    public List<Profissional> get(String termoBusca) {
        // TODO Auto-generated method stub
        return null;
    }

    // Insert
    @Override
    public int insert(Profissional objeto) {
        // TODO Auto-generated method stub
        return 0;
    }

    // Atualizar
    @Override
    public int update(Profissional objeto) {
        // TODO Auto-generated method stub
        return 0;
    }

}
