package builder.plush;

import lombok.Getter;
import toy.plush.Plush;

@Getter
public abstract class PlushBuilder {
    protected Plush plush;

    public abstract void create();

    public abstract void setHeight();

    public abstract void fill();

    public abstract void paint();
}
