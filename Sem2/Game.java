package Sem2;
import java.util.ArrayList;
import java.util.Random;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

public class Game {

    public static void main(String[] args) {
        Random random = ThreadLocalRandom.current();
        List<ItemGenerator> generatorList = new ArrayList<>();
        generatorList.add(new GoldGenerator());
        generatorList.add(new GemGenerator());

        for (int i = 0; i < 10; i++) {
            int index = Math.abs(random.nextInt() % 2) == 0 ? 0 : 1;
            ItemGenerator itemGenerator = generatorList.get(index);
            itemGenerator.openReward();
        }
    }
}

abstract class ItemGenerator {

    public void openReward() {
        GameItem gameItem = createItem();
        gameItem.open();
    }

    public abstract GameItem createItem();

}

interface GameItem {
    void open();
}

class GoldReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gold");
    }
}

class GemReward implements GameItem {
    @Override
    public void open() {
        System.out.println("Gem");
    }
}

class GoldGenerator extends ItemGenerator {
    public GameItem createItem() {
        return new GoldReward();
    }
}

class GemGenerator extends ItemGenerator {
    public GameItem createItem() {
        return new GemReward();
    }
}