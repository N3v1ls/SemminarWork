public class Render {
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_RED = "\u001B[31m";
    final String ANSI_BLACK = "\u001B[30m";

    public void render(Object object) {

        if (object instanceof HasHealthPoint healthPoint) {
            int percentHealthPoint = healthPoint.getPercentHealthPoint();
            System.out.println("HealthPoint:");
            if (0 < percentHealthPoint && percentHealthPoint <= 24) {
                System.out.println(ANSI_BLACK + percentHealthPoint + "%" + ANSI_RESET);
            } else if (25 <= percentHealthPoint && percentHealthPoint <= 50) {
                System.out.println(ANSI_RED + percentHealthPoint + "%" + ANSI_RESET);
            } else if (51 <= percentHealthPoint && percentHealthPoint <= 100) {
                System.out.println(ANSI_GREEN + percentHealthPoint + "%" + ANSI_RESET);
            }
            
        }

        if (object instanceof Tiredness tiredness) {
            int percentEnergy = tiredness.getPercentEnergy() ;
            System.out.println("Energy:");
            if (0 < percentEnergy && percentEnergy <= 24) {
                System.out.println(ANSI_BLACK + percentEnergy + "%" + ANSI_RESET);
            } else if (25 <= percentEnergy && percentEnergy <= 50) {
                System.out.println(ANSI_RED + percentEnergy + "%" + ANSI_RESET);
            } else if (51 <= percentEnergy && percentEnergy <= 100) {
                System.out.println(ANSI_GREEN + percentEnergy + "%" + ANSI_RESET);
            }

        }
    }

}
