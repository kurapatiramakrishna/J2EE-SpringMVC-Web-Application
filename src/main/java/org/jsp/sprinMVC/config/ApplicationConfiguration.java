package org.jsp.sprinMVC.config;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configurable
@ComponentScan(basePackages = "org.jsp.springMVC")
public class ApplicationConfiguration 
{
	@Bean
	public DriverManagerDataSource getDataSource()
	{
		DriverManagerDataSource ds = new DriverManagerDataSource();
		ds.setDriverClassName("com.mysql.cj.jdbc.Driver");
		ds.setUrl("jdbc:mysql://localhost:3306/krk");
		ds.setUsername("root");
		ds.setPassword("12345");
		return ds;
	}
	@Bean
	public JdbcTemplate getConnection()
	{
		JdbcTemplate jdbcTemplate = new JdbcTemplate(getDataSource());
		return jdbcTemplate;
	}
	@Bean
	public InternalResourceViewResolver getViewResolver()
	{
		InternalResourceViewResolver vs = new InternalResourceViewResolver();
		vs.setPrefix("/views/");
		vs.setSuffix(".jsp");
		return vs;
	}
}
