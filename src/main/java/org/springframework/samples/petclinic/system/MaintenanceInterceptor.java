package org.springframework.samples.petclinic.system;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.HandlerInterceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Configuration
public class MaintenanceInterceptor implements HandlerInterceptor {

	private String maintenanceMode;

	public MaintenanceInterceptor() {
	}

	public MaintenanceInterceptor(String maintenanceMode) {
		this.maintenanceMode = maintenanceMode;
	}

	@Override
	public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler)
			throws Exception {
		// System.out.println("maintenance: " + maintenanceMode);
		// System.out.println("request.getRequestURI(): " + request.getRequestURI() + ";
		// ends: " + request.getRequestURI().endsWith("maintenance"));
		if ("true".equalsIgnoreCase(maintenanceMode)) {
			response.sendRedirect("/maintenance");
			return false;
		}
		else {
			return true;
		}
	}

}