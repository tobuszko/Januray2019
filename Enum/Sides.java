package Enum;

public enum Sides {
    NORTH_EAST ("NE", "Północny-wschód", "North-East"),
    NORTH("N", "Północ", "North"),
    NORTH_WEST("NW", "Północny-zachód", "North-West"),
    WEST("W", "Zachód", "West"),
    SOUTH_WEST("SW", "Południowy-zachód", "South-East"),
    SOUTH("S", "Południe", "South"),
    SOUTH_EAST("SE","Południowy-wschód","South-East"),
    EAST("E", "Wschód", "East");



    private String shortName;
    private String polishName;
    private String englishName;


    Sides(String shortName, String polishName, String englishName) {
        this.shortName = shortName;
        this.polishName = polishName;
        this.englishName = englishName;
    }

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getPolishName() {
        return polishName;
    }

    public void setPolishName(String polishName) {
        this.polishName = polishName;
    }

    public String getEnglishName() {
        return englishName;
    }

    public void setEnglishName(String englishName) {
        this.englishName = englishName;
    }

    public String  getAll (){
        return "Short: " + shortName + ", Polish name: " + polishName + ", EnglishName: " + englishName;
    }

}
