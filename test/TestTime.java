public class TestTime {
    public static void test() {
        // Dùng constructor mặc định
        Time t1 = new Time(); // mặc định 00:00:00
        System.out.println("t1: " + t1);

        // Dùng constructor 3 tham số
        Time t2 = new Time(20, 3, 45);
        System.out.println("t2: " + t2);

        // Dùng setter chaining
        Time t3 = new Time();
        t3.setHour(7).setMinute(32).setSecond(23);
        System.out.println("t3: " + t3);

        // Kiểm tra getter
        System.out.println("Giờ của t2: " + t2.getHour());
        System.out.println("Phút của t2: " + t2.getMinute());
        System.out.println("Giây của t2: " + t2.getSecond());
    }
}
