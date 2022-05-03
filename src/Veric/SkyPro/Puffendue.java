package Veric.SkyPro;
public class Puffendue extends HogwartsStudents {
    private int industriousness;
    private int loyalty;
    private int honesty;
    public Puffendue(String n, String ln, int mp, int td,
                      int is, int ly, int hy){
        super(n, ln, mp, td);
        facult = 3;
        facultName = "Пуффендуец";
        industriousness = is;
        loyalty = ly;
        honesty = hy;
        sumSkills = industriousness + loyalty + honesty;
    }

    @Override
    public String toString() {
        return "Имя студента: " + name + ' ' + lastName + '\n' +
               "Факультет: Пуффендуй" + '\n' +
               "Сила магии = " + magicPower + '\n' +
               "Способность к трансгрессии = " + transgressDistance + '\n' +
               "Трудолюбивость = " + industriousness + '\n' +
               "Верность = " + loyalty + '\n' +
               "Честность = " + honesty + '\n' + "----------------";
    }


}
