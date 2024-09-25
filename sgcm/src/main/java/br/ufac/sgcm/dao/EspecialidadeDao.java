package br.ufac.sgcm.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import br.ufac.sgcm.model.Especialidade;

public class EspecialidadeDao implements IDao<Especialidade> {
    Connection conexao;
    PreparedStatement ps;
    ResultSet rs;

    // Construtor
    public EspecialidadeDao() {
        conexao = new ConexaoDB().getConexao();
    }

    // Métodos de acesso aos dados das Especialidades (MySQL)
    // Get para retornar uma única especialidade
    public Especialidade get(Long id) {
        Especialidade esp = new Especialidade();
        String sql = "SELECT * FROM especialidade WHERE id=?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, id);
            rs = ps.executeQuery();
            if (rs.next()) {
                esp.setId(rs.getLong("id"));
                esp.setNome(rs.getString("nome"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return esp;
    }

    // Listar todas as especialidades
    public List<Especialidade> get() {
        List<Especialidade> registros = new ArrayList<>();
        String sql = "SELECT * FROM especialidade";
        try {
            ps = conexao.prepareStatement(sql);
            rs = ps.executeQuery();
            while (rs.next()) {
                Especialidade obj = new Especialidade();
                obj.setId(rs.getLong("id"));
                obj.setNome(rs.getString("nome"));
                registros.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registros;
    }

    // Listar Especialidades por termo de busca
    public List<Especialidade> get(String termoBusca) {
        List<Especialidade> registros = new ArrayList<>();
        String sql = "SELECT * FROM especialidade WHERE nome LIKE ?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, "%" + termoBusca + "%");
            rs = ps.executeQuery();
            while (rs.next()) {
                Especialidade obj = new Especialidade();
                obj.setId(rs.getLong("id"));
                obj.setNome(rs.getString("nome"));
                registros.add(obj);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registros;
    }

    // Inserir Especialidade
    public int insert(Especialidade objeto) {
        int registrosAfetados = 0;
        String sql = "INSERT INTO especialidade (nome) VALUES (?)";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            registrosAfetados = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrosAfetados;
    }

    // Atualizar Especialidade
    public int update(Especialidade objeto) {
        int registrosAfetados = 0;
        String sql = "UPDATE especialidade SET nome=? WHERE id=?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setString(1, objeto.getNome());
            ps.setLong(2, objeto.getId());
            registrosAfetados = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrosAfetados;
    }

    // Excluir Especialidade
    public int delete(Especialidade objeto) {
        int registrosAfetados = 0;
        String sql = "DELETE FROM especialidade WHERE id=?";
        try {
            ps = conexao.prepareStatement(sql);
            ps.setLong(1, objeto.getId());
            registrosAfetados = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return registrosAfetados;
    }
}
