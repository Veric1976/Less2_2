package Veric.SkyPro;
public class Griffindor extends HogwartsStudents {
    private int nobility;
    private int honour;
    private int bravery;
    public Griffindor(String n, String ln, int mp, int td,
                       int nb, int hr, int by){
    super(n, ln, mp, td);
    facult = 4;
    facultName = "Гриффиндорец";
    nobility = nb;
    honour = hr;
    bravery = by;
    sumSkills = nobility + honour + bravery;
    }

    @Override
    public String toString() {
        return "Имя студента: " + name + ' ' + lastName + '\n' +
               "Факультет: Гриффиндор" + '\n' +
               "Сила магии = " + magicPower + '\n' +
               "Способность к трансгрессии = " + transgressDistance + '\n' +
               "Благородство = " + nobility + '\n' +
               "Честь = " + honour + '\n' +
               "Храбрость = " + bravery + '\n' + "----------------";
    }

}
