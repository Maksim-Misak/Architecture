package InMemoryModel;

import ModelElements.*;
import java.util.ArrayList;

public class ModelStore {
    
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Scene> scenes = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();
    private ArrayList<IModelChangedObserver> changeObservers = new ArrayList<>();

    /**
     * конструктор
     */
    public ModelStore(Poligon poligon) {
        models.add(new PoligonalModel(poligon));
        flashes.add(new Flash());
        cameras.add(new Camera());
        scenes.add(new Scene(models.get(0), cameras.get(0)));
    }

    /**
     * Метод интерфейса IModelChanger
     * @param sender
     */
    public void notifyChange(IModelChanger sender) {
        
    }

    public Scene getScene(int sceneNumber) {
        return scenes.get(sceneNumber);
    }

}
