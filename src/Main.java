import javafx.scene.paint.Stop;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        Dog dog = new Dog();
        Shelter shelter = new Shelter("Dream", "Kievskaya 5");
        dog.setName("Noah");
        dog.setAge(1);
        dog.setBreed("Haski");
        dog.setColor(Color.WHITE);
        dog.setShelter(shelter);
        String[] commands = {"Sit", "Stand"};
        dog.setCommands(commands);

        Dog dog1 = new Dog("Regi", "Haski", Color.BLACK, shelter);

        Dog dog2 = new Dog("Bealy", "Haski", Color.GREY, shelter, commands);

        dog.makeVoice();
        dog1.makeVoice("GAV");
        dog2.makeVoice("Miau", 3);

        System.out.println(dog.getInfo()+ "\n" + dog1.getInfo()+ "\n" + dog2.getInfo());


    }
}
