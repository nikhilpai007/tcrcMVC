
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;
public class HelloController extends AbstractController{

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest arg0,
			HttpServletResponse respnse) throws Exception {
		// TODO Auto-generated method stub
		
		ModelAndView modelandview =new ModelAndView("HelloPage");
		modelandview.addObject("Hello");
		
		return modelandview;
	}
	

}
