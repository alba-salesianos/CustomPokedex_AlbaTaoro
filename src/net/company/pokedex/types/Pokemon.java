package net.company.pokedex.types;

public class Pokemon {
    protected String name;
    protected String type;
    protected String height;
    protected String weight;
    protected String description;
    protected boolean isCaught = false;

    public Pokemon(String name, String type, String height, String weight, String description) {
        this.name = name;
        this.type = type;
        this.height = height;
        this.weight = weight;
        this.description = description;
    }

    public Pokemon(String name, String type) {
        this.name = name;
        this.type = type;
    }

    public String getName() {
        return this.name;
    }

    public String getType() {
        return this.type;
    }

    public String getHeight() {
        return this.height;
    }

    public String getWeight() {
        return this.weight;
    }

    public String getDescription() {
        return this.description;
    }

    public void setHeight(String height) {
        this.height = height;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void catchPokemon() {
        this.isCaught = true;
    }

    @Override
    public String toString() {
        String msg = "\n" + "══════════════════════════════════════════════════════════════";
        msg += "\n" + this.name.toUpperCase();
        msg += "\n" + this.type.toUpperCase();
        msg += "\n" + "HT    " + this.height;
        msg += "\n" + "WT    " + this.weight + "lb";
        msg += "\n" + "──█──█──█──█──────────────────────────────────────█──█──█──█──";
        msg += "\n" + this.description;
        msg += "\n" + "══════════════════════════════════════════════════════════════";
        return msg;

    }
}
