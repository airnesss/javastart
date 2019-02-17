package pl.sda.javastart.KlasaString;

public class StringNanoTime {
    public static void main(String[] args) {


        long time1;
        long time2;

        long startTime = System.nanoTime();
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < 100000; i++) {
            builder.append(i);
            builder.append(",");


        }
        String numbers = builder.toString();
        time1 = System.nanoTime() - startTime;
        System.out.println("time1 " + time1);
        System.out.println(numbers);


        startTime = System.nanoTime();
        String numbers2 = " ";
        for (int i = 0; i < 100000; i++) {
            numbers2 = numbers2 + i + ",";

        }
        time2 = System.nanoTime() - startTime;
        System.out.println("time2 " + time2);
        System.out.println(numbers2);

        System.out.println("różnica czasu wynosi " + time2/time1);


    }
}
