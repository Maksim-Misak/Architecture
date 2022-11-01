package Sem2;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

/**
 * Класс запускающий игру
 */
public class Game {

    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());
        generatorList.add(new SilverGenerator());
        generatorList.add(new BronzeGenerator());
        generatorList.add(new WoodGenerator());

        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt(0, 5)); // Изменена генерация под количество возможных вариантов
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}

/**
 * Абстрактный класс, генерирующий награду 
 */
abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();

}

/**
 * Интерфейс, позволяющий открыть предмет
 */
interface GameItem {
    void open();
}

/**
 * Класс, использующий интерфейс GameItem для открытия золотой награды
 */
class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}

/**
 * Класс, использующий интерфейс GameItem для открытия драгоценной награды
 */
class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}

/**
 * Класс, использующий интерфейс GameItem для открытия серебрянной награды
 */
class SilverReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Silver");
    }
}

/**
 * Класс, использующий интерфейс GameItem для открытия бронзовой награды
 */
class BronzeReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Bronze");
    }
}

/**
 * Класс, использующий интерфейс GameItem для открытия деревянной награды
 */
class WoodReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Wood");
    }
}

/**
 * Класс-наследник ItemGenerator, создающий золотую награду 
 */
class GoldGenerator extends ItemGenerator {
    public GameItem createItem() {
        return new GoldReward();
    }
}

/**
 * Класс-наследник ItemGenerator, создающий дрогоценную награду 
 */
class GemGenerator extends ItemGenerator {
    public GameItem createItem() {
        return new GemReward();
    }
}

/**
 * Класс-наследник ItemGenerator, создающий серебрянную награду 
 */
class SilverGenerator extends ItemGenerator {
    public GameItem createItem() {
        return new SilverReward();
    }
}

/**
 * Класс-наследник ItemGenerator, создающий бронзовую награду 
 */
class BronzeGenerator extends ItemGenerator {
    public GameItem createItem() {
        return new BronzeReward();
    }
}

/**
 * Класс-наследник ItemGenerator, создающий деревянную награду 
 */
class WoodGenerator extends ItemGenerator {
    public GameItem createItem() {
        return new WoodReward();
    }
}