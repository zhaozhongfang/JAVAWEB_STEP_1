package csii.com.cn.utils;

import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JDBCUtils {

    private static DataSource ds;


    static {
        Properties ps = new Properties();
        InputStream inputStream = JDBCUtils.class.getResourceAsStream("/druid.properties");
        try {
            ps.load(inputStream);
            ds= DruidDataSourceFactory.createDataSource(ps);
        } catch (IOException e) {
//            e.printStackTrace();
        } catch (Exception e) {
//            e.printStackTrace();
        }
    }

    public static DataSource getDataSource(){
        return ds;
    }


}
