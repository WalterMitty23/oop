public class Main {
    public static void main(String[] args) {
        Gryffindor Harry =
                new Gryffindor("Гарри Поттер", 55, 67, 74, 28, 34);
        Gryffindor Hermione =
                new Gryffindor("Гермиона Грейнджер", 23, 45, 87, 21, 11);
        Gryffindor Ron =
                new Gryffindor("Рон Уизли", 11, 8, 9, 21, 3);
        Hufflepuff Zachariah
                = new Hufflepuff("Захария Смит", 4, 18, 42, 56, 22);
        Hufflepuff Cedric
                = new Hufflepuff("Седрик Диггори", 3, 11, 34, 32, 11);
        Hufflepuff Justin
                = new Hufflepuff("Джастин Финч-Флетчли", 11, 9, 6, 23, 21);
        Ravenclaws Zhou
                = new Ravenclaws("Чжоу Чанг",22,43,11,7,5);
        Ravenclaws Padma
        = new Ravenclaws("Падма Патил",22,3,1,7,43);
        Ravenclaws Marcus
                = new Ravenclaws("Маркус Белби",22,5,18,19,20);
        Slytherin Draco
                = new Slytherin ("Драко Малфой",22,21,34,67,44,22,22);
        Slytherin Graham
                =new Slytherin("Грэхэм Монтегю",22,34,8,5,1,22,11);
        Slytherin Gregory
                = new Slytherin("Грегори Гойл ",22,7,5,9,3,1,7);



        System.out.println(Harry);
        Harry.compareHogwarts(Hermione);
        Draco.compareHogwarts(Graham);
        Zhou.compareHogwarts(Padma);
        Cedric.compareHogwarts(Justin);



    }
    }

