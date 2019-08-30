package edu.up.bsi.conv.gip;

import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.orm.jpa.JpaVendorAdapter;
import org.springframework.orm.jpa.vendor.Database;
import org.springframework.orm.jpa.vendor.HibernateJpaVendorAdapter;

import javax.sql.DataSource;

import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

@Configuration
public class DataConfiguration {
	// Define as configurações do banco de dados
	@Bean
	public DataSource dataSource() {
		DriverManagerDataSource dataSource = new DriverManagerDataSource();
		// versão antiga do driver do mysql
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		/*
		 * definir local do banco de dados, onde 3306 - porta do mysql gip_db - nome do
		 * banco localhost - endereço do banco de dados
		 */
		//dataSource.setUrl("jdbc:mysql://localhost:3306/gip_db");
		// nome de usuário do banco de dados onde root corresponde ao nome de usuário do
		// banco de dados
		// ativar essa linha com o usuário do seu banco
		//dataSource.setUsername("root");
		// senha do banco da up angelo
		// ativar essa linha com a senha do seu banco
		//dataSource.setPassword("");
		return dataSource;
	}

	// Configuração do JPA
	@Bean
	public JpaVendorAdapter jpaVendorAdapter() {
		HibernateJpaVendorAdapter adapter = new HibernateJpaVendorAdapter();
		// qual banco de dados irá usar
		adapter.setDatabase(Database.MYSQL);
		// mostrar comandos sql no console
		adapter.setShowSql(true);
		// poder criar estrutura do banco de dados na entidade
		adapter.setGenerateDdl(true);
		// utiliza o dialeto SQL específicos para o Mysql5
		adapter.setDatabasePlatform("org.hibernate.dialect.MySQL5Dialect");
		// versão antiga
		// adapter.setDatabasePlatform("org.hibernate.dialect.MySQLDialect");
		adapter.setPrepareConnection(true);
		return adapter;
	}

	@Bean
	public FilterRegistrationBean<CorsFilter> corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		CorsConfiguration config = new CorsConfiguration().applyPermitDefaultValues();
		config.addAllowedMethod(HttpMethod.POST);
		config.addAllowedMethod(HttpMethod.DELETE);
		source.registerCorsConfiguration("/**", config);
		FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
		bean.setOrder(0);
		return bean;
	}
}
