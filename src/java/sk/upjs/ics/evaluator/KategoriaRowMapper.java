package sk.upjs.ics.evaluator;

import java.sql.ResultSet;
import java.sql.SQLException;
import org.springframework.jdbc.core.RowMapper;

public class KategoriaRowMapper implements RowMapper<Kategoria> {

    @Override
    public Kategoria mapRow(ResultSet rs, int i) throws SQLException {
        Kategoria kategoria = new Kategoria();
        kategoria.setId(rs.getInt("kategoria_id"));
        kategoria.setNazov(rs.getString("kategoria_nazov"));
        kategoria.setPopis(rs.getString("kategoria_popis"));
        kategoria.setVlastnik(rs.getString("vlastnik"));
        return kategoria;
    }

}
