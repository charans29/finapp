// package com.springboot.finapp.config;

// import org.springframework.beans.factory.annotation.Value;
// import org.springframework.context.annotation.Configuration;
// import org.springframework.data.cassandra.config.AbstractCassandraConfiguration;
// import org.springframework.data.cassandra.repository.config.EnableCassandraRepositories;

// @Configuration
// @EnableCassandraRepositories(basePackages = "com.springboot.finapp.repository")
// public class CassandraConfig extends AbstractCassandraConfiguration {

//     @Value("${spring.data.cassandra.keyspace-name}")
//     private String keyspaceName;

//     @Value("${spring.data.cassandra.contact-points:cassandra}")
//     private String contactPoints;

//     @Value("${spring.data.cassandra.port:9042}")
//     private int port;

//     @Override
//     protected String getKeyspaceName() {
//         return keyspaceName;
//     }

//     @Override
//     protected String getContactPoints() {
//         return contactPoints;
//     }

//     @Override
//     protected int getPort() {
//         return port;
//     }

//     @Override
//     public String[] getEntityBasePackages() {
//         return new String[] { "com.springboot.finapp.model" };
//     }
// }