package io.github.venmolom.menzurki.commands;

import org.bukkit.Material;
import org.bukkit.command.Command;
import org.bukkit.command.CommandExecutor;
import org.bukkit.command.CommandSender;
import org.bukkit.entity.Player;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.meta.PotionMeta;
import org.bukkit.potion.PotionData;
import org.bukkit.potion.PotionType;

public class MenzurkaCommand implements CommandExecutor {
    @Override
    public boolean onCommand(CommandSender sender, Command command, String label, String[] args) {
        if (args.length > 0) return false;

        if (sender instanceof Player) {
            Player player = (Player) sender;

            ItemStack menzurka = new ItemStack(Material.POTION);

            PotionMeta meta = (PotionMeta) menzurka.getItemMeta();
            meta.setDisplayName("Menzurka z wodą");

            PotionData potionData = new PotionData(PotionType.WATER, false, false);
            meta.setBasePotionData(potionData);

            menzurka.setItemMeta(meta);

            player.getInventory().addItem(menzurka);
        }

        return true;
    }
}
