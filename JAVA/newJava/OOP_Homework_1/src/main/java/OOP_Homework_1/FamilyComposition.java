package OOP_Homework_1;

import java.util.ArrayList;
import java.util.Iterator;

public class FamilyComposition  {
    private Man hasband;
    private Woman wife;
    ArrayList<Woman> doughter = new ArrayList<Woman>();
    ArrayList<Man> son = new ArrayList<Man>();

    public void setHasband(Man hasband) {
        this.hasband = hasband;
    }

    public void setWife(Woman wife) {
        this.wife = wife;
    }

    public void setDoughter(Woman doughter) {
        this.doughter.add(doughter);
    }

    public void setSon(Man son) {
        this.son.add(son);
    }

    public String toString() {
        return hasband.toString() + wife.toString() + doughter + son;
    }

    public Man getHasband() {
        return hasband;
    }

    public Woman getWife() {
        return wife;
    }
}


