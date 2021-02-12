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

	public void onEnable() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("            Easy_Suvival 를러그인을 성공적으로 불러왔습니다");
		System.out.println("                  플러그인 제작자 : boy0710boy");
		System.out.println("   최신버전 다운 사이트 : https://github.com/son123j/Easy_Survival");
		System.out.println("--------------------------------------------------------------");
		
		ShapedRecipe dia_pickexe = new ShapedRecipe(new ItemStack(Material.DIAMOND_PICKAXE)).shape(new String[]{"~~~"," ! "," ! "}).setIngredient('!', Material.DIAMOND).setIngredient('~', Material.STICK);
		getServer().addRecipe(dia_pickexe);
	}
	@Override
	public void onDisable() {
		System.out.println("--------------------------------------------------------------");
		System.out.println("            Easy_Suvival 를러그인이 비활성화 되었습니다");
		System.out.println("                   플러그인 제작자 : boy0710boy");
		System.out.println("   최신버전 다운 사이트 : https://github.com/son123j/Easy_Survival");
		System.out.println("--------------------------------------------------------------");
	}
	
	@EventHandler
    public void onPlayerJoin(PlayerJoinEvent e) {
        Player p = e.getPlayer();
        
	}
	
}
