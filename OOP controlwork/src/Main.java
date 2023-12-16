// вариант 2
import java.util.Random;

public class Main {
    public static void main(String[] args) {
                Pet[] pets = createRandomPets(5);

                System.out.println("Состояние питомцев до кормления:");
                printPetStatus(pets);

                System.out.println("\nКормление питомцев:");
                feedPets(pets);

                System.out.println("\nСостояние питомцев после кормления:");
                printPetStatus(pets);
            }

            // Метод создания случайных питомцев
            public static Pet[] createRandomPets(int numPets) {
                Pet[] pets = new Pet[numPets];
                Random random = new Random();

                for (int i = 0; i < numPets; i++) {
                    int saturation = random.nextInt(101);
                    if (random.nextDouble() < 0.5) {
                        pets[i] = new Dog(saturation);
                    } else {
                        pets[i] = new Cat(saturation);
                    }
                }
                return pets;
            }

            // Метод вывода состояния питомцев
            public static void printPetStatus(Pet[] pets) {
                for (int i = 0; i < pets.length; i++) {
                    System.out.println("Питомец " + (i + 1) + ": Сытость - " + pets[i].getSaturation() + "%");
                }
            }

            // Метод кормления питомцев
            public static void feedPets(Pet[] pets) {
                for (Pet pet : pets) {
                    pet.eat();
                }
            }
        }
