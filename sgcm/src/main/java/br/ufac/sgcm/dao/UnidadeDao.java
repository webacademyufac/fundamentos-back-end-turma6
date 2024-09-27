package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import br.ufac.sgcm.model.Unidade;

public class UnidadeDao implements IDao<Unidade> {
    private Connection conexao;
    private PreparedStatement ps;
    private ResultSet rs;

    public UnidadeDao() {
        conexao = new ConexaoDB().getConexao();
    }

    public Unidade get(Long id) {
        String sql = "SELECT * FROM unidade WHERE id=?";
        Unidade registro = new Unidade();
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                registro.setId(rs.getLong("id"));
                registro.setNome(rs.getString("nome"));
                registro.setEndereco(rs.getString("endereco"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registro;
    }

    @Override
    public int delete(Unidade objeto) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public List<Unidade> get() {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public List<Unidade> get(String termoBusca) {
        // TODO Auto-generated method stub
        return null;
    }

    @Override
    public int insert(Unidade objeto) {
        // TODO Auto-generated method stub
        return 0;
    }

    @Override
    public int update(Unidade objeto) {
        // TODO Auto-generated method stub
        return 0;
    }

}
