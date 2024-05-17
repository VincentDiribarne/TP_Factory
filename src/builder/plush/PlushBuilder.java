package builder.plush;

import builder.GlobalBuilder;
import lombok.Getter;
import toy.plush.Plush;

@Getter
public abstract class PlushBuilder extends GlobalBuilder {
    protected Plush plush;

    public abstract void setHeight();

    public abstract void fill();

    public void setName() {
        plush.setName(getType().getName());
    }
}
