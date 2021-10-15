package sef.module17.activity;

import junit.framework.TestCase;
import sef.module17.activity.Animals;

public class AnimalTest extends TestCase{
    private Animals animals;
    private String expectedText = "Animal species is :% and color is :%";

    protected void setUp() throws Exception {
        super.setUp();
        animals = new Animals();
    }

    public void testBlueCatAnimal() {
        animals.setColor("blue");
        assertEquals(String.format(expectedText, "Cat", "blue"), animals.getColorSpecies(0));
    }

    public void testBlueMouseAnimal() {
        animals.setColor("blue");
        assertEquals(String.format(expectedText, "Mouse", "blue"), animals.getColorSpecies(1));
    }

    public void testGreenDogAnimal() {
        animals.setColor("green");
        assertEquals(String.format(expectedText, "Dog", "green"), animals.getColorSpecies(2));
    }
}
