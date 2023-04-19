


public enum Animal {
    FROG("лягушка"),
    CAT("кот"),
    DOG("собака"),
    FOX("лиса");

    private String translate;

    Animal(String translate) {
        this.translate = translate;
    }

    public String getTranslate() {
        return translate;
    }

    public void setTranslate(String translate) {
        this.translate = translate;
    }
}
