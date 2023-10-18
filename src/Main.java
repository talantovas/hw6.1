public class Main {
    public static void main(String[] args) {
        Weapon bossWeapon = new Weapon();
        bossWeapon.setWeaponType(WeaponType.Knife);
        bossWeapon.setWeaponName("Холодное");


        Boss boss = new Boss();
        boss.setName(" Босс");
        boss.setHealth(1000);
        boss.setDamage(50);
        boss.setWeapon(bossWeapon);

        System.out.println("Имя : " + boss.getName());
        System.out.println("Здоровье :  " + boss.getHealth() + "  Урон : " + boss.getDamage());
        System.out.println("Тип оружия : " + boss.getWeapon().getWeaponType());
        System.out.println("Название оружия : " + boss.getWeapon().getWeaponName());
    }
}