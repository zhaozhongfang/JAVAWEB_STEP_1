package csii.com.cn.dao;

import csii.com.cn.domain.User;
import csii.com.cn.utils.JDBCUtils;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

public class UserDao {

    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());
    private JdbcTemplate jdbcTemplate = new JdbcTemplate(JDBCUtils.getDataSource());

    public User getConnection(User user){
        String sql = "select * from User where username=? and password = ?";
        User aa = jdbcTemplate.queryForObject(sql,new BeanPropertyRowMapper<User>(User.class),user.getUserName(),user.getPassword());
        System.out.println("345234524244322343");
        System.out.println("3333");

        System.out.println("444444444");
        return aa==null?null:aa;
    }
}
