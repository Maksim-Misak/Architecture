package ModelElements;

import java.util.ArrayList;

/**
 * Класс модель сцены
 */
public class Scene {
    
    public int id;
    public ArrayList<PoligonalModel> models = new ArrayList<>();
    public ArrayList<Flash> flashes = new ArrayList<>();
    public ArrayList<Camera> cameras = new ArrayList<>();

    /**
     * Конструктор
     * @param inputModels
     * @param inputCameras
     */
    public Scene(PoligonalModel inputModels, Camera inputCameras) {
        models.add(inputModels);
        cameras.add(inputCameras);
    }


    /**
     * Заглушка
     */
    public Type1 method1(Type1 t) {
        return t;
    }

    /**
     * Заглушка
     */
    public Type2 method1(Type2 t, Type2 t1) {
        return t1;
    }
}
