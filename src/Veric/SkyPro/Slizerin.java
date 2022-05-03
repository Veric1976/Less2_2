package Veric.SkyPro;
public class Slizerin extends HogwartsStudents {
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int powerlust;
    public Slizerin(String n, String ln, int mp, int td,
                      int cg, int dn, int an, int rs, int pt){
        super(n, ln, mp, td);
        facult = 1;
        facultName = "Слизеринец";
        cunning = cg;
        determination = dn;
        ambition = an;
        resourcefulness = rs;
        powerlust = pt;
        sumSkills = cunning + determination + ambition + resourcefulness + powerlust;
    }

    @Override
    public String toString() {
        return "Имя студента: " + name + ' ' + lastName + '\n' +
               "Факультет: Слизерин" + '\n' +
               "Сила магии = " + magicPower + '\n' +
               "Способность к трансгрессии = " + transgressDistance + '\n' +
               "Хитрость = " + cunning + '\n' +
               "Решительность = " + determination + '\n' +
               "Амбициозность = " + ambition + '\n' +
               "Находчивость = " + resourcefulness + '\n' +
               "Жажда власти = " + powerlust + '\n' + "----------------";
    }


}
