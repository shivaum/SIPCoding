import java.util.Random;
public class HW3JavaSol {
	public static int dice() {
		Random rand = new Random();
		return rand.nextInt(6) + 1;
	}

	public static boolean pizzaParty(int pizzas, boolean isWeekend) {
		System.out.println("We have " + pizzas + " pizzas.");

		if (!isWeekend && pizzas >= 40 && pizzas <= 60) {
			return true;
		} else if (isWeekend && pizzas >= 40) {
			return true;
		}
 		return false; 
	}

	public static void main(String[] args) {
		System.out.println(dice());
		System.out.println(pizzaParty(30, false));
		System.out.println(pizzaParty(50, false));
		System.out.println(pizzaParty(70, true));

	}
}