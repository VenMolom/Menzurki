package io.github.venmolom.menzurki;

import io.github.venmolom.menzurki.commands.MenzurkaCommand;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Command;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;

@Plugin(name = "Menzurki", version = "1.0.1")
@Description(value = "Plugin that gives you menzurki")
@Commands(
        @Command(name = "menzurka",
                desc = "Gives you menzurka",
                usage = "/<command>")
)
public class Menzurki extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("menzurka").setExecutor(new MenzurkaCommand());
    }
}
