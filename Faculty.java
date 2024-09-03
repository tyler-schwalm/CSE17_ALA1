public class Faculty extends Employee {
    private String rank;

    public Faculty() {
        super();
        rank = "none";
    }

    public Faculty(int id, String n, String a, String p, String e, String po, double s, String ra) {
        super(id, n, a, p, e, po, s);
        rank = ra;
    }

    public String getRank() { return rank; }

    public String toString() {
        return String.format("%sRank: %s\n\n", super.toString(), rank);
    }

    public void setRank(String s) { rank = s; }
}
