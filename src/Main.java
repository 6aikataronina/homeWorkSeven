public class Main {
    public static void main(String[] args) {
        HavingSuperAbility Heroes[] = {new Magic(),new Warrior(), new Magic()};
        for (int i = 0; i < Heroes.length; i++) {
            Heroes[i].applySuperAbility();

        }
    }
}