package ModelElements;

/**
 * модель полигона
 */
public class PoligonalModel {

    public Poligon poligons;
    public Texture textures;

    /**
     * Конструктор
     * @param inputPoligon
     */
    public PoligonalModel(Poligon inputPoligon) {
        poligons = inputPoligon;
        textures = new Texture();
    }

}
