package me.slimeyderp.newbeginnings.tasks;


import me.slimeyderp.newbeginnings.armor_weapons.PandaBazooka;
import org.bukkit.Bukkit;
import org.bukkit.Location;
import org.bukkit.Material;
import org.bukkit.Particle;
import org.bukkit.entity.Panda;
import org.bukkit.entity.Player;
import org.bukkit.util.Vector;

public class PandaBazookaTask implements Runnable {

    private final Panda p;

    private final Player player;

    private final Long time;

    private double t = 0;

    private Location loc;

    private Vector direction;

    public PandaBazookaTask(Panda p, Player player, Long time, Location loc, Vector direction) {
        this.p = p;
        this.player = player;
        this.time = time;
        this.loc = loc;
        this.direction = direction;
    }

    @Override
    public void run() {
        t = t + 2.5;
        Location newLoc = loc.clone().add(direction.getX() * t,
                direction.getY() * t, direction.getZ() * t);
        p.getWorld().spawnParticle(Particle.FIREWORKS_SPARK, newLoc, 0, 0, 0, 0, 1);
        newLoc.setY(newLoc.getY() + 0.5);
        p.teleport(newLoc);
        if (((p.getLocation().getBlock().getType() != Material.AIR &&
                p.getLocation().getBlock().getType() != Material.CAVE_AIR &&
                p.getLocation().getBlock().getType() != Material.VOID_AIR &&
                p.getLocation().getBlock().getType() != Material.GRASS &&
                p.getLocation().getBlock().getType() != Material.TALL_GRASS) ||
                PandaNearThing(p, player)) ||
                System.currentTimeMillis() > time) {
            p.getWorld().createExplosion(p.getLocation(), 6, false, false);
            p.remove();
            int taskID = PandaBazooka.pandaShootCooldown.get(player.getUniqueId());
            PandaBazooka.pandaShootCooldown.remove(player.getUniqueId());
            Bukkit.getScheduler().cancelTask(taskID);
        }
    }

    private boolean PandaNearThing(Panda pand, Player p) {
        if (pand.getNearbyEntities(1, 1, 1).isEmpty()) {
            return false;
        } else return !pand.getNearbyEntities(1, 1, 1).contains(p);
    }
}
