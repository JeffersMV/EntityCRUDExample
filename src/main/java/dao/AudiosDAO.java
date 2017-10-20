package dao;

import entity.Audios;

import java.sql.SQLException;
import java.util.List;

public interface AudiosDAO {

    void add(Audios audios) throws SQLException;

    List<Audios> getAll() throws SQLException;

    void update(Audios audios) throws SQLException;

    void remove(Audios audios) throws SQLException;

    Audios getById(Long id) throws SQLException;
}
