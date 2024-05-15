package builder.plush;

import lombok.Getter;
import lombok.Setter;
import toy.enumeration.Color;
import toy.enumeration.Material;
import toy.enumeration.PlushType;
import toy.enumeration.Type;
import toy.plush.AnimalPlush;

import java.util.List;

@Getter
@Setter
public class AnimalPlushBuilder extends PlushBuilder {
    private Type plushType;
    private static AnimalPlushBuilder instance;

    private AnimalPlushBuilder() {
    }

    public static AnimalPlushBuilder getInstance() {
        if (instance == null) {
            instance = new AnimalPlushBuilder();
        }

        return instance;
    }

    @Override
    public void create() {
        plush = new AnimalPlush();
        plush.setType(PlushType.ANIMAL);
    }

    @Override
    public void setHeight() {
        switch (getPlushType()) {
            case LION_PLUSH -> plush.setSize(40);
            case CAT_PLUSH -> plush.setSize(15);
        }
    }

    @Override
    public void fill() {
        switch (getPlushType()) {
            case LION_PLUSH -> plush.setMaterials(List.of(Material.WOOL, Material.POLYESTER));
            case CAT_PLUSH -> plush.setMaterials(List.of(Material.ACRYLIC, Material.POLYESTER, Material.WOOL));
        }
    }

    @Override
    public void paint() {
        switch (getPlushType()) {
            case LION_PLUSH -> plush.setColor(Color.ORANGE);
            case CAT_PLUSH -> plush.setColor(Color.BLACK);
        }
    }
}
