public abstract class FootSoldier {
    String name;
    String rank;
    int serialNumber;

    public FootSoldier(String name, String rank, int serialNumber) {
        this.name = name;
        this.rank = rank;
        this.serialNumber = serialNumber;
    }

    public FootSoldier() {
    }

    public String sleep() {
        return "snore";
    };

    public String eat() {
        return "chew";
    };

    public String walk() {
        return "trudge";
    };

    public abstract String speak();
}
