package io.github.venmolom.menzurki;

import io.github.venmolom.menzurki.commands.MenzurkaCommand;
import org.bukkit.permissions.PermissionDefault;
import org.bukkit.plugin.java.JavaPlugin;
import org.bukkit.plugin.java.annotation.command.Command;
import org.bukkit.plugin.java.annotation.command.Commands;
import org.bukkit.plugin.java.annotation.permission.Permission;
import org.bukkit.plugin.java.annotation.permission.Permissions;
import org.bukkit.plugin.java.annotation.plugin.ApiVersion;
import org.bukkit.plugin.java.annotation.plugin.Description;
import org.bukkit.plugin.java.annotation.plugin.Plugin;

@Plugin(name = "Menzurki", version = "1.1.0")
@Description(value = "Plugin that gives you menzurki")
@ApiVersion(ApiVersion.Target.v1_15)
@Commands(
        @Command(name = "menzurka",
                desc = "Gives you menzurka",
                usage = "/<command>",
                permission = "menzurki.menzurka"
        )
)
@Permissions(
        @Permission(
                name = "menzurki.menzurka",
                desc = "Allows access to /menzurka command",
                defaultValue = PermissionDefault.OP
        )
)
public class Menzurki extends JavaPlugin {
    @Override
    public void onEnable() {
        getCommand("menzurka").setExecutor(new MenzurkaCommand());
    }
}
