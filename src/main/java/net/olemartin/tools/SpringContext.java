package net.olemartin.tools;

import net.olemartin.service.match.MatchResource;
import net.olemartin.service.player.PlayerResource;
import net.olemartin.service.tournament.TournamentResource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class SpringContext implements ApplicationContextAware {
    private static ApplicationContext applicationContext;

    @Override
    public void setApplicationContext(ApplicationContext context) {
        applicationContext = context;
    }

    public static TournamentResource getTournamentResource() {
        return applicationContext.getBean(TournamentResource.class);
    }

    public static MatchResource getMatchResource() {
        return applicationContext.getBean(MatchResource.class);
    }

    public static PlayerResource getPlayerResource() {
        return applicationContext.getBean(PlayerResource.class);
    }
}
