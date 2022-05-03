package Veric.SkyPro;

public class Main {

    public static void main(String[] args) {
        HogwartsStudents[] studentsHogwards = new HogwartsStudents[12];
	    studentsHogwards[0] = new Griffindor("Гарри", "Поттер",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[1] = new Griffindor("Гермиона", "Грейнджер",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[2] = new Griffindor("Рон", "Уизли",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[3] = new Slizerin("Драко", "Малфой",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[4] = new Slizerin("Грэхэм", "Монтегю",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[5] = new Slizerin("Грегори", "Гойл",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[6] = new Puffendue("Захария", "Смит",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[7] = new Puffendue("Седрик", "Диггори",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[8] = new Puffendue("Джастин", "Финч-Флетчли",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[9] = new Kogtevranz("Чжоу", "Чанг",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[10] = new Kogtevranz("Падма", "Патил",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d));
        studentsHogwards[11] = new Kogtevranz("Маркус", "Белби",
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d),
                (int)(Math.random()*100d),(int)(Math.random()*100d),(int)(Math.random()*100d));
        for (HogwartsStudents x : studentsHogwards){
            System.out.println(x.toString());
        }
        studentsHogwards[0].compareStudents(studentsHogwards[2]);
        studentsHogwards[1].compareStudents(studentsHogwards[8]);

    }
}
