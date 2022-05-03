package Veric.SkyPro;
public abstract class HogwartsStudents {
    protected String name;
    protected String lastName;
    protected int facult;
    protected String facultName;
    protected int sumSkills;
    protected int magicPower;
    protected int transgressDistance;
    public HogwartsStudents(String n, String ln, int mp, int td) {
        name = n;
        lastName = ln;
        magicPower = mp;
        transgressDistance = td;
    }

    @Override
    public abstract String toString();

    public void magicCast(HogwartsStudents st) {
        System.out.println("BOOM-BOOM с силой " + st.magicPower);
    }
    public void transgress(HogwartsStudents st) {
        System.out.println("ПРЫГ на расстояние " + st.transgressDistance);
    }
    public void compareStudents(HogwartsStudents st2){
        if (this.magicPower > st2.magicPower) {
            System.out.println(this.name + " " +
                    this.lastName + " обладает бОльшей силой магии, чем " +
                    st2.name + " " + st2.lastName + ".");
        } else if (this.magicPower == st2.magicPower) {
                  System.out.println(this.name + " " +
                        this.lastName + " и " +
                        st2.name + " " + st2.lastName + ", их магическая сила равна.");
            } else {
                System.out.println(st2.name + " " +
                        st2.lastName + " обладает бОльшей силой магии, чем " +
                        this.name + " " + this.lastName + ".");
            }

        if (this.transgressDistance > st2.transgressDistance) {
            System.out.println(this.name + " " +
                    this.lastName + " обладает бОльшей способностью трансгрессировать, чем " +
                    st2.name + " " + st2.lastName + ".");
        } else if (this.magicPower == st2.magicPower) {
                System.out.println(this.name + " " +
                        this.lastName + " и " +
                        st2.name + " " + st2.lastName + ", их способность трансгрессировать равна.");
            } else {
                System.out.println(st2.name + " " +
                        st2.lastName + " обладает бОльшей трансгрессией, чем " +
                        this.name + " " + this.lastName + ".");
            }
        if (this.facult == st2.facult) {
            if (this.sumSkills > st2.sumSkills) {
                System.out.println(this.name + " " +
                        this.lastName + " лучший " + facultName +  ", чем " +
                        st2.name + " " + st2.lastName + ".");
            } else if (this.sumSkills == st2.sumSkills) {
                System.out.println(this.name + " " +
                        this.lastName + " и " +
                        st2.name + " " + st2.lastName + ", их способности на факультете примерно равны.");
            } else {
                System.out.println(st2.name + " " +
                        st2.lastName + " лучший " + facultName + ", чем " +
                        this.name + " " + this.lastName + ".");
            }

        }
    }
}
