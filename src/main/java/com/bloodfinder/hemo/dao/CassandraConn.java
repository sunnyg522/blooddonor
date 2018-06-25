package com.bloodfinder.hemo.dao;

import com.datastax.driver.core.Cluster;
import com.datastax.driver.core.Session;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @project hemo
 * @authore dgunda on 6/20/18
 */
@ComponentScan
@PropertySource("classpath:configs/cassandra.properties")
public class CassandraConn {
    @Value("${cassandra.host}")
    private String hostIp;

    @Value("${cassandra.port}")
    private int port;

    @Value("${cassandra.username}")
    private String userName;

    @Value("${cassandra.passoword}")
    private String passWord;

    @Bean
    public Cluster cluster(){
        Cluster cluster = Cluster.buildFrom(Cluster.builder()
                .addContactPoint(hostIp)
                .withPort(port)
                .withCredentials(userName, passWord));
        return cluster;
    }
}
