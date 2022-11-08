import java.util.Random;

public abstract class Compartment {
    public abstract String notice();

}

class FirstClass extends Compartment {
    @Override
    public String notice() {
        return "This is FirstClass Compartment";
    }
}

class Ladies extends Compartment {

    @Override
    public String notice() {
        return "This is Ladies Compartment";
    }
}

class General extends Compartment{
    @Override
    public String notice() {
        return "This is General Compartment";
    }
}

class Luggage extends Compartment{
    @Override
    public String notice() {
        return "This is Luggage COmpartment";
    }
}

class testCompartment{
    public static void main(String[] args) {
        Compartment[] compartments = new Compartment[10];

        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            int randomNum = random.nextInt((4 - 1) + 1) + 1;

            if (randomNum == 1)
                compartments[i] = new Luggage();
            else if (randomNum == 2)
                compartments[i] = new Ladies();
            else if (randomNum == 3)
                compartments[i] = new General();
            else if (randomNum == 4)
                compartments[i] = new FirstClass();

            System.out.println(compartments[i].notice());
        }

    }
}


