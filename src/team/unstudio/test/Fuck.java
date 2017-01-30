package team.unstudio.test;

import org.bukkit.command.Command;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.event.Listener;
import org.bukkit.plugin.java.JavaPlugin;

import team.unstudio.minigameapi.util.GameUtils;

public class Fuck extends JavaPlugin implements Listener{
	static Fuck INSTANCE;
	public void onEnable(){
	}
	@Override
	public boolean onCommand(CommandSender s,Command c,String l,String a[]){
		if (!(s instanceof Player)) return false;
		Player p = (Player)s;
		GameUtils.sendTitle(p, "¡ìbÄãºÃ", 2, 5, 2, false);
		GameUtils.sendTitle(p, "¡ìe¡ìlMySubTitle", 2, 5, 2, true);
		GameUtils.sendActionBar(p, "¡ìbÄãºÃ");
		return false;
	}
}
