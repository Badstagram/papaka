import events.papaj_ususn;
import events.papiez_event;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class bot {

    public static void main(String[] args) throws Exception{
        JDA jda = new JDABuilder("bot-token-removed").build();

        jda.addEventListener(new papiez_event());
        jda.addEventListener(new papaj_ususn());
    }
}
