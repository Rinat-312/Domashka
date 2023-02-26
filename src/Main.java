public class Main {
    public static void main(String[] args) {
        Java java1 = new Java("Nick", 25, 'M', "@Nick25");
        Java java2 = new Java("Tom", 30, 'M', "@Tom30");
        Java java3 = new Java("Elena", 23, 'F', "@Elena23");
        Java java4 = new Java("Eric", 34, 'M', "@Eric34");
        Java java5 = new Java("Nuna", 40, 'F', "@Nuna40");

        Android android1 = new Android("Sergey", 35, 'M', "@Sergey35");
        Android android2 = new Android("Aleksey", 29, 'M', "@Aleksey29");
        Android android3 = new Android("Janna", 26, 'F', "@Janna26");

        Go go1 = new Go("Asan", 18, 'M', "@Asan");
        Go go2 = new Go("Nani", 23, 'F', "@Nami");

        Java[] javas = {java1, java2, java3, java4, java5};
        Android[] androids = {android1, android2, android3};
        Go[] gos = {go1, go2};


        Company company1 = new Company("Bishkek","Tom",javas,androids,gos);
        Company company2 = new Company("Osh","Asan",javas,androids,gos);




        for (Java javes : javas) {
            System.out.println(javes);
        }
            for (Android android : androids) {
                System.out.println(android);
            }
        for (Go go:gos) {
            System.out.println(gos);
        }
        System.out.println(company1);
        System.out.println(company2);


    }

    }
