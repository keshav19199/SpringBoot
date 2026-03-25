package pathVariable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PathVariable_1 {
	
	@PostMapping("/add/{fname}/{lname}/{City}")
	public String addname(@PathVariable (value="fname") String fname, @PathVariable(value="lname") String lname, @PathVariable(value="city") String City)
	{
		System.out.println(lname+"::::"+"::::"+ lname+"::::"+City);
		return fname;
		
	}

}
