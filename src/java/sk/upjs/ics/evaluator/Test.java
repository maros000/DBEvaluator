package sk.upjs.ics.evaluator;

import java.io.Serializable;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import org.springframework.jdbc.core.JdbcTemplate;

@ManagedBean(name = "test")
@SessionScoped
public class Test implements Serializable {

    private final JdbcTemplate jdbcTemplate = Factory.INSTANCE.jdbcTemplate();
    private static final KategoriaRowMapper mapovac
            = new KategoriaRowMapper();

    public List<Kategoria> getKategorie() {
        return jdbcTemplate.query("SELECT * FROM KATEGORIE", mapovac);
    }
}
