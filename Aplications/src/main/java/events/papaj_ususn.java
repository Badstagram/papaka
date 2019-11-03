package events;

import net.dv8tion.jda.api.entities.Message;
import net.dv8tion.jda.api.events.message.guild.GuildMessageReceivedEvent;
import net.dv8tion.jda.api.hooks.ListenerAdapter;

import javax.annotation.Nonnull;

public class papaj_ususn extends ListenerAdapter {
    @Override
    public void onGuildMessageReceived(@Nonnull GuildMessageReceivedEvent event) {
        String message = event.getMessage().getContentRaw();

        if(message.equals("Papaj nie jebał dzieci")) {
            String name = event.getMessage().getAuthor().getId();
            event.getAuthor().openPrivateChannel().queue(channel -> {
                channel.sendMessage("Pomyśl o tym xdxdXddXdXXDDD").queue();
            });
            event.getMessage().delete().queue();
            event.getChannel().sendMessage("Ten debil <@" + name + "> właśnie stwierdził, że papież nie jebał dzieci xDxDDDDxddxdD").queue();

        }
    }
}
