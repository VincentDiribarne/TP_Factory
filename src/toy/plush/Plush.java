package toy.plush;

import lombok.Getter;
import lombok.Setter;
import toy.Toy;
import toy.enumeration.Material;
import toy.enumeration.PlushType;

import java.util.List;

@Getter
@Setter
public abstract class Plush extends Toy {
    private PlushType type;
    private List<Material> materials;
    private int size;

    private String getMaterials() {
        StringBuilder result = new StringBuilder();
        int size = materials.size();
        int index = 0;

        for (Material material : materials) {
            if (index == size - 1) {
                result.append(material.getName());
                break;
            } else {
                if (index == size - 2) {
                    result.append(material.getName()).append(" et ");
                } else {
                    result.append(material.getName()).append(", ");
                }
            }

            index++;
        }

        return result.toString();
    }

    @Override
    public String toString() {
        return getName() +
                " de couleur " + getColor().getName() + " (" + getColor().getHexCode() + "), de " +
                getSize() + " cm en " + getMaterials();
    }
}