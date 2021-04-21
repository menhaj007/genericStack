public class ZipCode<code, city> {
    code areaCode;
    city cityName;

    public ZipCode(code areaCode, city cityName) {
        this.areaCode = areaCode;
        this.cityName = cityName;
    }
    public String toString() {
        return "Zip code: " + areaCode + ", City name: " + cityName;
    }

    public static void main(String[] args) {
        ZipCode<Integer, String> alexandria = new ZipCode<>(22304, "Alexandria");
        ZipCode<Integer, String> fairfax = new ZipCode<>(22030, "Fairfax");
        System.out.println(alexandria);
        System.out.println(fairfax);
        ZipCode<Long, String> Himalaya = new ZipCode<>(33939932223L, "Himalaya");
        System.out.println(Himalaya);

    }
}
