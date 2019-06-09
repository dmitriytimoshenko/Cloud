package Splitter.DB;

import Splitter.entity.Splitter;
import org.springframework.jdbc.core.JdbcTemplate;

public class JdbcSplitterDAO implements SplitterDAO {
    private static final String SQL_INSERT_USER = "insert into splitter (login, password, fullname, email, updateByEmail) values (?,?,?,?,?)";
    private JdbcTemplate template;

    public JdbcSplitterDAO(JdbcTemplate template) {
        this.template = template;
    }

    @Override
    public void addSplitter(Splitter splitter) {
        template.update(SQL_INSERT_USER,
               splitter.getLogin(),
               splitter.getPassword(),
               splitter.getFullname(),
               splitter.getEmail(),
               splitter.getUpdatebyemail());
    }
}
