package mike.htmlGameLib.controllers;

import mike.htmlGameLib.config.GamesConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

    private final GamesConfig gamesConfig;

    @Autowired
    public AppController(@Qualifier("gameConfig") GamesConfig gamesConfig) {
        this.gamesConfig = gamesConfig;
    }

    @GetMapping("/index")
    public String getGamesPage(Model model) {
        model.addAttribute("gamesList", gamesConfig.getGames());
        return "games";
    }

    /*@GetMapping("/")
    public String getGamesPage(Model model) {
        model.addAttribute("gamesList", gamesConfig.getGames());
        return "games";
    }*/
}
