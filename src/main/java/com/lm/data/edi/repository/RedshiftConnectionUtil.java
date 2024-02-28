package com.lm.data.edi.repository;

import com.lm.data.edi.config.EdiSecretsConfig;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class RedshiftConnectionUtil {
    private static final String REDSHIFT_DRIVER_CLASS = "com.amazon.redshift.jdbc42.Driver";
    public Connection getDBconnection() throws ClassNotFoundException, SQLException {
        Class.forName(REDSHIFT_DRIVER_CLASS);
        EdiSecretsConfig secretsConfig = new EdiSecretsConfig();
        secretsConfig.loadSecretDetails();
        return DriverManager.getConnection("jdbc:redshift://" + secretsConfig.getHost() + ":" + secretsConfig.getPort() + "/" +
                secretsConfig.getDatabase(), secretsConfig.getUsername(), secretsConfig.getPassword());

    }
}
