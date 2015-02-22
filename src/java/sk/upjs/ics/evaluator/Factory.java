package sk.upjs.ics.evaluator;

import com.mysql.jdbc.jdbc2.optional.MysqlDataSource;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import org.springframework.jdbc.core.JdbcTemplate;

public enum Factory {

    INSTANCE;

    private JdbcTemplate jdbcTemplate;

    public JdbcTemplate jdbcTemplate() {
        if (this.jdbcTemplate == null) {
            this.jdbcTemplate = new JdbcTemplate(dataSource());
        }
        return this.jdbcTemplate;
    }

    public MysqlDataSource dataSource() {
        Properties properties = getProperties();
        MysqlDataSource dataSource = new MysqlDataSource();
        dataSource.setURL((String) properties.get("dataServer"));
        dataSource.setUser((String) properties.get("dataLogin"));
        dataSource.setPassword((String) properties.get("dataPass"));

        return dataSource;
    }

    private Properties getProperties() {
        try {
            String propertiesFile;

            propertiesFile = "/home/todo/todo-test.properties";

            InputStream in;

            try {
                in = new FileInputStream(propertiesFile);
            } catch (FileNotFoundException e) {
                propertiesFile = "C:/todo/todo-test.properties";
                in = new FileInputStream(propertiesFile);
            }

            Properties properties = new Properties();
            properties.load(in);

            return properties;
        } catch (IOException e) {
            throw new IllegalStateException("Nenašiel sa konfiguračný súbor!");
        }
    }
}
