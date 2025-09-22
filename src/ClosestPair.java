public class ClosestPair {
    static class point {
        int x, y;
        point(int x, int y) { this.x = x; this.y = y; }
    }

    public static double distance(point p1, point p2) {
        return Math.sqrt(Math.pow(p1.x - p2.x, 2) + Math.pow(p1.y - p2.y, 2));
    }

    public static double closest(point[] points) {
        double minDist = Double.MAX_VALUE;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                double d = distance(points[i], points[j]);
                if (d < minDist) minDist = d;
            }
        }
        return minDist;
    }
}