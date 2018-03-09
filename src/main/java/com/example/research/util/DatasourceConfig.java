package com.example.research.util;

import com.zaxxer.hikari.HikariConfig;
import com.zaxxer.hikari.HikariDataSource;

import javax.sql.DataSource;
import java.io.*;
import java.util.Properties;

public class DatasourceConfig {

    private DatasourceConfig() {
    }

    public static DataSource createDataSource(){
        HikariConfig config  = new HikariConfig();
        Properties properties = new Properties();
        ClassLoader classloader = Thread.currentThread().getContextClassLoader();
        InputStream inputStream = classloader.getResourceAsStream("db.properties");
        try {
            properties.load(inputStream);
            Class.forName(properties.getProperty("DB_DRIVER_CLASS"));
            config.setJdbcUrl(properties.getProperty("DB_URL"));
            config.setUsername(properties.getProperty("DB_USER"));
            config.setPassword(properties.getProperty("DB_PASSWORD"));
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
            config.setAutoCommit(true);
            config.setMaximumPoolSize(32);


        return new HikariDataSource(config);
    }


}
