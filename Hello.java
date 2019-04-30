import net.dv8tion.jda.core.hooks.ListenerAdapter;
import net.dv8tion.jda.core.events.message.guild.GuildMessageReceivedEvent;


public class Hello extends ListenerAdapter{

    public void onGuildMessageReceived(GuildMessageReceivedEvent event){
        String[] args = event.getMessage().getContentRaw().split(" ");

        if(args[0].equalsIgnoreCase("Hello")){
            if(!event.getMember().getUser().isBot()) {
                event.getChannel().sendMessage( "Hello " + event.getMember().getNickname() + "!").queue();
            }
        }
        else if(args[0].equalsIgnoreCase("!Members")){
            if(!event.getMember().getUser().isBot()) {
                for(int i = 0; i < (event.getGuild().getMembers().size()) ; i++){
                    if(i == event.getGuild().getMembers().size()-1){
                        event.getChannel().sendMessage("There are " + i + " members in this server.").queue();}
                    }
                }
            }
        else if(args[0].equalsIgnoreCase("Who")){
            if(!event.getMember().getUser().isBot()) {
                for(int i = 0; i < (event.getGuild().getMembers().size()) ; i++){
                    if(i == event.getGuild().getMembers().size()-1){
                        event.getChannel().sendMessage("<@322623248250437632> is!").queue();}
                }
            }
        }
        else if(args[0].equalsIgnoreCase("@random"));
            String[] lol = args;
            lol[0] = "";
            System.out.printf()



    }
}
