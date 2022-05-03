package Veric.SkyPro;
public class Kogtevranz extends HogwartsStudents {
    private int mind;
    private int wisdom;
    private int wit;
    private int creation;
    public Kogtevranz(String n, String ln, int mp, int td,
                     int md, int wm, int wt, int cn){
        super(n, ln, mp, td);
        facult = 2;
        facultName = "Когтевранец";
        mind = md;
        wisdom = wm;
        wit = wt;
        creation = cn;
        sumSkills = mind + wisdom + wit + creation;
    }

    @Override
    public String toString() {
        return "Имя студента: " + name + ' ' + lastName + '\n' +
               "Факультет: Когтевранц" + '\n' +
               "Сила магии = " + magicPower + '\n' +
               "Способность к трансгрессии = " + transgressDistance + '\n' +
               "Ум = " + mind + '\n' +
               "Мудрость = " + wisdom + '\n' +
               "Остроумие = " + wit + '\n' +
               "Креативность = " + creation + '\n' + "----------------";
    }


}
