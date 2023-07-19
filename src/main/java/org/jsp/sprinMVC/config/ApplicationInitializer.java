package org.jsp.sprinMVC.config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class ApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer
{
	//to represent Frontend Controller
	@Override
	protected Class<?>[] getRootConfigClasses() 
	{
		return null;
	}
	@Override
	protected Class<?>[] getServletConfigClasses() 
	{
		Class []  servletConfig = {ApplicationConfiguration.class};
		return servletConfig;
	}
	@Override
	protected String[] getServletMappings() 
	{
		String [] mapping = {"/"};
		return mapping;
	}
}
