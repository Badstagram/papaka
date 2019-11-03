import events.papaj_ususn;
import events.papiez_event;
import net.dv8tion.jda.api.JDA;
import net.dv8tion.jda.api.JDABuilder;


public class bot {

    public static void main(String[] args) throws Exception{
        JDA jda = new JDABuilder("NjM3Mzk3NjM2MDMwMTM2MzY2.XbRq4A.Ko1KzjrX-dK2chaxLLwySR118TU").build();

        jda.addEventListener(new papiez_event());
        jda.addEventListener(new papaj_ususn());
    }
}
