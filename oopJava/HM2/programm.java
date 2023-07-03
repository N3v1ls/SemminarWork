
public class Program {

    public static void main(String[] args) {
        Render render = new Render();
        // Building building1 = new Building(100,15);
        // Building building2 = new Building(100,40);
        Building building3 = new Building(100,85);

        Hero hero1 = new Hero(100, 45, 100, 70);
        // Hero hero2 = new Hero(100, 15, 100, 10);
        // Hero hero3 = new Hero(100, 95, 100, 40);

        // render.render(building1);
        // render.render(building2);
        render.render(building3);

        render.render(hero1);
        // render.render(hero2);
        // render.render(hero3);

    }
}
