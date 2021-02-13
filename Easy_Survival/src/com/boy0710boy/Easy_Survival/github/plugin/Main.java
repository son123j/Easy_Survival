package com.boy0710boy.Easy_Survival.github.plugin;

import org.bukkit.Material;
import org.bukkit.entity.Player;
import org.bukkit.event.EventHandler;
import org.bukkit.event.Listener;
import org.bukkit.event.player.PlayerJoinEvent;
import org.bukkit.inventory.ItemStack;
import org.bukkit.inventory.ShapedRecipe;
import org.bukkit.plugin.java.JavaPlugin;

public class Main extends JavaPlugin implements Listener {

	@SuppressWarnings("deprecation")
	public void onEnable() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("            Easy_Suvival 를러그인을 성공적으로 불러왔습니다");
		System.out.println("                  플러그인 제작자 : boy0710boy");
		System.out.println("   최신버전 다운 사이트 : https://github.com/son123j/Easy_Survival");
		System.out.println("--------------------------------------------------------------");
		
		ShapedRecipe dia_pickexe = new ShapedRecipe(new ItemStack(Material.DIAMOND_PICKAXE)).shape(new String[]{"~~~"," ! "," ! "}).setIngredient('!', Material.DIAMOND).setIngredient('~', Material.STICK);
		ShapedRecipe exp_bottle = new ShapedRecipe(new ItemStack(Material.EXPERIENCE_BOTTLE)).shape(new String[]{" ~ ","~!~"," ~ "}).setIngredient('!', Material.GLASS_BOTTLE).setIngredient('~', Material.LAPIS_LAZULI);
		ShapedRecipe elytra = new ShapedRecipe(new ItemStack(Material.ELYTRA)).shape(new String[]{"   ","~!~","~ ~"}).setIngredient('!', Material.STRING).setIngredient('~', Material.PHANTOM_MEMBRANE);
		getServer().addRecipe(dia_pickexe);
		getServer().addRecipe(exp_bottle);
		getServer().addRecipe(elytra);
	}
	@Override
	public void onDisable() {
		System.out.println("---------------------------------------------------------------");
		System.out.println("            Easy_Suvival 를러그인이 비활성화 되었습니다");
		System.out.println("                   플러그인 제작자 : boy0710boy");
		System.out.println("   최신버전 다운 사이트 : https://github.com/son123j/Easy_Survival");
		System.out.println("---------------------------------------------------------------");
	}
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        
	}
	
}
