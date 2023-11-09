import java.util.Random;

public class Main {

    public static final Random RANDOM = new Random();

    public static void main(String[] args) {
        GryffindorStudent harry = generateGryffindorStudent("Гарри Поттер");
        GryffindorStudent hermione = generateGryffindorStudent("Гермиона Грейнджер");
        GryffindorStudent ron = generateGryffindorStudent("Рон Уизли");

        HufflepuffStudent draco = generateHufflepuffStudent("Драко Малфой");
        HufflepuffStudent graham = generateHufflepuffStudent("Грэхэм Монтегю");
        HufflepuffStudent gregory = generateHufflepuffStudent("Грегори Гойл");

        RavenclawStudent zaharia = generateRavenclawStudent("Захария Смит");
        RavenclawStudent cedrick = generateRavenclawStudent("Седрик Диггори");
        RavenclawStudent justin = generateRavenclawStudent("Джастин Финч-Флетчли");

        SlytherinStudent zhou = generateSlytherinStudent("Чжоу Чанг");
        SlytherinStudent padma = generateSlytherinStudent("Падма Патил");
        SlytherinStudent marcus = generateSlytherinStudent("Маркус Белби");

        harry.print();
        marcus.print();
        draco.print();
        zaharia.print();
        harry.compareStudents(ron);
        draco.compareStudents(gregory);
        zaharia.compareStudents(justin);
        marcus.compareStudents(zhou);


    }

    private static GryffindorStudent generateGryffindorStudent(String name) {
        return new GryffindorStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static HufflepuffStudent generateHufflepuffStudent(String name) {
        return new HufflepuffStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static RavenclawStudent generateRavenclawStudent(String name) {
        return new RavenclawStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }

    private static SlytherinStudent generateSlytherinStudent(String name) {
        return new SlytherinStudent(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100)
        );
    }
}