package events;

import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;
import org.jetbrains.annotations.NotNull;

import javax.annotation.Nonnull;

public class papiez_event extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        String messagesent = event.getMessage().getContentRaw();
        {
            if (messagesent.equalsIgnoreCase("Bo co robił Jan Paweł Drugi z dziećmi?")) {
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage("Jebał jebał jebał").queue();
                }
            } else if (messagesent.equalsIgnoreCase("Bo co robił Jan Paweł 2 z dziećmi?")) {
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage("Jebał jebał jebał").queue();
                }
            } else if (messagesent.equalsIgnoreCase("bo co robił Jan Paweł Drugi z dziećmi?")) {
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage("Jebał jebał jebał").queue();
                }
            } else if (messagesent.equalsIgnoreCase("bo co robił Jan Paweł 2 z dziećmi?")) {
                if (!event.getMember().getUser().isBot()) {
                    event.getChannel().sendMessage("Jebał jebał jebał").queue();
                }
            }
        } // Wiadomości warianty
        if (messagesent.equals("Jan Paweł II jebał małe dzieci")) {
            event.getChannel().sendMessage("I to jeszcze jak").queue();
        }
    }
}
