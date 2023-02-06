import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {


    Animal dog;
    Animal cat;
    Animal lion;
    Animal snake;

    Animal bear;


    String species;
    String animalloud;


    @BeforeEach
    void setUp(){
        dog = new Animal("Wuffi",3,"dog");
        cat = new Animal("Kitty",8,"cat");
        lion = new Animal("Simba",4,"lion");
        snake = new Animal("Slytherin",1,"snake");
        bear = new Animal("Winnie",10,"bear");

    }

    @org.junit.jupiter.api.Test
    void giveAnimalLoud() {


        Assertions.assertEquals("wuff",dog.giveAnimalLoud());
        Assertions.assertEquals("miau",cat.giveAnimalLoud());
        Assertions.assertEquals("roar",lion.giveAnimalLoud());
        Assertions.assertEquals("We no speak animal.",snake.giveAnimalLoud());
        Assertions.assertEquals("We no speak animal.",bear.giveAnimalLoud());

    }

    @org.junit.jupiter.api.Test
    void getNameAndAge() {
        String wuffiname = "Wuffi";
        String kittyname = "Kitty";
        String simbaname = "Simba";
        String slytherinname = "Slytherin";
        String winniename = "Winnie";
        int wuffialter = 3;
        int kittyalter = 8;
        int simbaalter = 4;
        int slytherinalter = 1;
        int winniealter = 10;
        Assertions.assertEquals(wuffiname + " | " + wuffialter,dog.getNameAndAge());
        Assertions.assertEquals(kittyname + " | " + kittyalter,cat.getNameAndAge());
        Assertions.assertEquals(simbaname + " | " + simbaalter,lion.getNameAndAge());
        Assertions.assertEquals(slytherinname + " | " + slytherinalter,snake.getNameAndAge());
        Assertions.assertEquals(winniename + " | " + winniealter,bear.getNameAndAge());

    }

    @org.junit.jupiter.api.Test
    void ageCategory() {


        String babyAnimal = "Baby Animal";
        String youngAnimal = "Young Animal";
        String oldAnimal = "Old Animal";

        Assertions.assertEquals(youngAnimal,dog.ageCategory());
        Assertions.assertEquals(oldAnimal,cat.ageCategory());
        Assertions.assertEquals(youngAnimal,lion.ageCategory());
        Assertions.assertEquals(babyAnimal,snake.ageCategory());
        Assertions.assertEquals(oldAnimal,bear.ageCategory());
    }
}