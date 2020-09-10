package hh.swd20.demoprojekti.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
//Shift + Control + O päivittää importit kuntoon
//Ctrl + Space hakee lyhenteestä oikean käsken esim kirjoita RequestP ja Ctrl + Space

@Controller
@ResponseBody
public class HelloController {
		// "/hello" on urlin endpoint
		@RequestMapping("/hello")
		public String hello() {
			return "Hello world!";
		}
		/*public String sayHello() {
			return "Hello World and ..... !!";

		}*/
		// http://localhost:8080/hi?firstname=Matti&lastname=Meikä
		@RequestMapping("/hi")
		//otetaan name-parametriin firstname-parametrista ja laitetaan tieto talteen String muuttujaan nimeltä etunimi 
		public String hiYou(@RequestParam( name="firstname") String etunimi, 
				@RequestParam(name="lastname", required = false) String sukunimi) {
			return "Hi " + etunimi + " " + (sukunimi != null ? sukunimi: "") + "!";
		} 

}
