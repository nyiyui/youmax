/**
 * Names: Ivy Zhuang, Ken Shibata, Youmin Lee
 * Teacher: Ms. Krasteva
 * Date: Feb 20, 2023
 * Purpose: Youkai class, youkai are mythical younimals with the power to help the youpeople
 */
package Youniverse;

import java.util.ArrayList;

public class Youkai extends Younimal{
    //TODO: add more attributes and methods, javadoc comments, etc.
    protected ArrayList<Youkai> youkais;
    public Youkai(String name, int height, double speed) {
        super(name, height, true, speed);
        youkais.add(this);
    }

    void helpThePeople() {
//        for (YouPerson p : people) {
//            help(p);
//        }
    }

    void help(YouPerson p) {
        throw new RuntimeException("not implemented");
    }
}