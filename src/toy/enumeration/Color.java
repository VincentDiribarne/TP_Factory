package toy.enumeration;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Color {
    BLACK("noir", "#ffffff"),
    WHITE("blanc", "#000000"),
    RED("rouge", "#ff0000"),
    GREEN("vert", "#00ff00"),
    BLUE("bleu", "#0000ff"),
    YELLOW("jaune", "#ffff00"),
    ORANGE("orange", "#ff6600"),
    PURPLE("violet", "#6600ff"),
    PINK("rose", "#ff66ff"),
    BROWN("marron", "#663300"),
    GREY("gris", "#666666"),
    CYAN("cyan", "#00ffff"),
    MAGENTA("magenta", "#ff00ff");
    
    private final String name;
    private final String hexCode;
}
