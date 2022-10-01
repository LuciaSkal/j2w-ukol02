package cz.czechitas.java2webapps.ukol2;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Controller
public class QuoteController {
    private final List<String> listOfQuotes = List.of("„Nevadí mi žít v mužském světě, pokud v něm mohu být ženou.“\n (Marilyn Monroe)",
            "„Jenom život, který žijeme pro ostatní, stojí za to.“\n  (Albert Einstein)",
            "„Ze života se nikdo nedostane živý.“\n  (Jim Morrison)",
            "„Život je to, co se děje, když se zabýváme jinými věcmi.“\n (John Lennon)",
            "„V životě je jen jedno štěstí - milovat a být milován.“\n (George Sand)",
            "„Tajemstvím života je sedmkrát padnout a osmkrát vstát.“\n (Paulo Coelho)",
            "„Neberte život příliš vážně, stejně z něho nevyváznete živí.“\n (Elbert Hubbard)",
            "„Život by byl tragédií, kdyby nebyl vtipný.“\n (Stephen Hawking)"
    );

    private final List<String> listOfImages = List.of("R_c0vML-BQo", "xMMh-VFGL9M", "urFw0pB8cgw", "odxB5oIG_iA",
            "B-lVzPw5zIg", "1nBvotYiZQI", "fsEohb8sscM", "xYIuqpHD2oQ");

    @GetMapping("/")
    public ModelAndView getQuoteAndImage () {
        ModelAndView result = new ModelAndView("index");
        String randomQuote = listOfQuotes.get(ThreadLocalRandom.current().nextInt((listOfQuotes.size())));
        result.addObject("quote", randomQuote);
        String randomImage = listOfImages.get(ThreadLocalRandom.current().nextInt((listOfImages.size())));
        result.addObject("image", randomImage);
        return result;
    }
}
