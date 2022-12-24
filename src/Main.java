public class Main {
    public static void main(String[] args) {
    transient1();
    transient2();
    transient3();
    transient4();
    transient5();
}
    public static void transient1 () {
            System.out.println("work-1");
            var dog = 8;
            System.out.println(dog);
            var cat = 3.6;
            System.out.println(cat);
            var paper = 763789;
            System.out.println(paper);

    }
    public static void transient2 () {
        System.out.println("work-2");
        var dog = 8;
        dog = dog +4;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat +4;
        System.out.println(cat);
        var paper = 763789;
        paper = paper +4;
        System.out.println(paper);
    }
    public static void transient3 () {
        System.out.println("work-3");
        var dog = 8.0;
        dog = dog -3.5;
        System.out.println(dog);
        var cat = 3.6;
        cat = cat -1.6;
        System.out.println(cat);
        var paper = 763789;
        paper = paper -7639;
        System.out.println(paper);
    }
    public static void transient4 () {
        System.out.println("work-4");
        var friend = 19;
        System.out.println(friend);
        friend = friend +2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);
    }
    public static void transient5 () {
        System.out.println("work-5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog *10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog +4;
        System.out.println(frog);
    }
}