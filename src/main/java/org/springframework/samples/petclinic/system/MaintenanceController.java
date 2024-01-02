package org.springframework.samples.petclinic.system;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
class MaintenanceController {

	@GetMapping("/maintenance")
	public String maintenance() {
		return "maintenance";
	}

}
