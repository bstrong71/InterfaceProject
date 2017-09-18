public interface Fighting {
    public String fight();

    default String overpower() {
        return "Always wins";
    }
}
