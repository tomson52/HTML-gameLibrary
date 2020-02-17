package mike.htmlGameLib.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service("gameConfig")
@Configuration
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "games-cfg")
public class GamesConfig {
    private List<Game> games = new ArrayList<>();

    public List<Game> getGames() {
        return games;
    }

    public void setGames(List<Game> games) {
        this.games = games;
    }

    public static class Game {

        private String series;

        private String name;

        private String indexPath;

        private String cardPath;

        public String getSeries() {
            return series;
        }

        public void setSeries(String series) {
            this.series = series;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getIndexPath() {
            return indexPath;
        }

        public void setIndexPath(String indexPath) {
            this.indexPath = indexPath;
        }

        public String getCardPath() {
            return cardPath;
        }

        public void setCardPath(String cardPath) {
            this.cardPath = cardPath;
        }

        @Override
        public String toString() {
            return "Game{" +
                    "series='" + series + '\'' +
                    ", name='" + name + '\'' +
                    ", indexPath='" + indexPath + '\'' +
                    ", cardPath='" + cardPath + '\'' +
                    '}';
        }
    }
}
