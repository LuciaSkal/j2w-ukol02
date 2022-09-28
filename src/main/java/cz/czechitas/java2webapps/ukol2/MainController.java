package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.Random;

@Controller
public class MainController {
    private final Random random = new Random();

    @GetMapping("/")
    public ModelAndView citaty () {

        List<String> seznamCitatu = List.of("„Nevadí mi žít v mužském světě, pokud v něm mohu být ženou.“\n (Marilyn Monroe)",
                "„Jenom život, který žijeme pro ostatní, stojí za to.“\n  (Albert Einstein)",
                "„Ze života se nikdo nedostane živý.“\n  (Jim Morrison)",
                "„Život je to, co se děje, když se zabýváme jinými věcmi.“\n (John Lennon)",
                "„V životě je jen jedno štěstí - milovat a být milován.“\n (George Sand)",
                "„Tajemstvím života je sedmkrát padnout a osmkrát vstát.“\n (Paulo Coelho)",
                "„Neberte život příliš vážně, stejně z něho nevyváznete živí.“\n (Elbert Hubbard)",
                "„Život by byl tragédií, kdyby nebyl vtipný.“\n (Stephen Hawking)"
        );

        List<String> seznamObrazku = List.of("R_c0vML-BQo", "xMMh-VFGL9M", "urFw0pB8cgw", "odxB5oIG_iA",
                "B-lVzPw5zIg", "1nBvotYiZQI", "fsEohb8sscM", "xYIuqpHD2oQ");

        ModelAndView result = new ModelAndView("index");
        String nahodnyCitat = seznamCitatu.get(random.nextInt(seznamCitatu.size()));
        result.addObject("citat", nahodnyCitat);
        String nahodnyObrazek = seznamObrazku.get(random.nextInt(seznamObrazku.size()));
        result.addObject("obrazek", nahodnyObrazek);
        return result;
    }
}
