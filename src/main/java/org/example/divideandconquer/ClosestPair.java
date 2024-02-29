public final class ClosestPair {

    int numberPoints;
    private Location[] array;
    Location point1 = null;
    Location point2 = null;
    private static double minNum = Double.MAX_VALUE;
    public static void setMinNum(double minNum) {
        ClosestPair.minNum = minNum;
    }
    public static void setSecondCount(int secondCount) {
        ClosestPair.secondCount = secondCount;
    }
    private static int secondCount = 0;
    ClosestPair(int points) {
        numberPoints = points;
        array = new Location[numberPoints];
    }
    public static class Location {
        double x;
        double y;
        Location(final double xpar, final double ypar) { // Save x, y coordinates
            this.x = xpar;
            this.y = ypar;
        }
    }

    public Location[] createLocation(int numberValues) {
        return new Location[numberValues];
    }

    public Location buildLocation(double x, double y) {
        return new Location(x, y);
    }
    public int xPartition(final Location[] a, final int first, final int last) {
        Location pivot = a[last];
        int i = first - 1;
        Location temp;
        for (int j = first; j <= last - 1; j++) {
            if (a[j].x <= pivot.x) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        temp = a[i];
        a[i] = a[last];
        a[last] = temp;
        return i;
    }

    public int yPartition(final Location[] a, final int first, final int last) {
        Location pivot = a[last];
        int i = first - 1;
        Location temp;
        for (int j = first; j <= last - 1; j++) {
            if (a[j].y <= pivot.y) {
                i++;
                temp = a[i];
                a[i] = a[j];
                a[j] = temp;
            }
        }
        i++;
        temp = a[i];
        a[i] = a[last];
        a[last] = temp;
        return i;
    }

    public void xQuickSort(final Location[] a, final int first, final int last) {
        if (first < last) {
            int q;
        }
    }
}