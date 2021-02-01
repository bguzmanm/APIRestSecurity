package cl.awakelab.apirestprod;

import java.text.DateFormat;
import java.util.Date;
import java.util.Locale;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import cl.awakelab.apirestprod.repos.IProductoRepo;

/**
 * Handles requests for the application home page.
 */
@Controller
public class HomeController {
	
	private static final Logger logger = LoggerFactory.getLogger(HomeController.class);
	
	@Autowired
	private IProductoRepo prodRepo; 
	
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String home(Locale locale, Model model) {
		logger.info("Welcome home! The client locale is {}.", locale);
		
		Date date = new Date();
		DateFormat dateFormat = DateFormat.getDateTimeInstance(DateFormat.LONG, DateFormat.LONG, locale);
		
		String formattedDate = dateFormat.format(date);
		
		model.addAttribute("serverTime", formattedDate );
		
		return "home";
	}
	
	@RequestMapping(value="productos", method = RequestMethod.GET)
	public String listaProductos(Model model) {
		
		
		model.addAttribute("productos", prodRepo.findAll());
		
		return "productos";
	}
	
	@RequestMapping(value="/login")
	public String login() {
		return "login";
	}
	
	@RequestMapping(value="/error")
	public String errorLogin(Model model) {
		model.addAttribute("error", "true");
		return "login";
	}
	@RequestMapping(value="/logout")
	public String logout() {
		Authentication au = SecurityContextHolder.getContext().getAuthentication();
		if (au != null) {
			SecurityContextHolder.getContext().setAuthentication(null);
		}
		
		return "redirect:/login";
	}
	
	@RequestMapping(value="/nopermitido")
	public String noPermitido() {
		return "nopermitido";
	}
	
}
