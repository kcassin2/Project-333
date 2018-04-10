import java.util.Comparator;

public class Inventory {
    private BikePart bp;
    private int count;

    public static Comparator<Inventory> SORT_BY_NAME = new Comparator<Inventory>() {
        @Override
        public int compare(final Inventory o1, final Inventory o2) {
            String o1Name = o1.getBp().getName() + o1.getBp().getName();
            String o2Name = o2.getBp().getName() + o2.getBp().getName();
            return o1Name.compareTo(o2Name);
        }
    };

    public static Comparator<Inventory> SORT_BY_NUMBER = (Inventory i1, Inventory i2) -> (Integer.compare(i1.getBp().getNumber(), i2.getBp().getNumber()));

    public Inventory(BikePart bp, int count) {
        this.bp = bp;
        this.count = count;
    }

    public BikePart getBp() {
        return bp;
    }

    public void setBp(BikePart bp) {
        this.bp = bp;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    @Override
    public String toString() {
        return "Inventory{" +
                "bp=" + bp +
                ", count=" + count +
                '}';
    }
}
