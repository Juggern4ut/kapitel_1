/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package Kapitel1;

import Kapitel1.Simuduck.Duck;
import Kapitel1.Simuduck.MallardDuck;
import Kapitel1.Simuduck.RubberDuck;
import Kapitel1.Simuduck.BehaviourClasses.FlyRocketPowered;
import Kapitel1.Simuduck.ModelDuck;

public class App {

    public static void main(String[] args) {
        Duck paul = new MallardDuck();
        paul.performFly();

        // Evil Wizard transforms MallardDuck to a Rubberduck ╰( ͡° ͜ʖ ͡° )つ──☆*:・ﾟ
        paul = new RubberDuck();
        paul.performFly();

        Duck myModel = new ModelDuck();
        myModel.performFly();

        // It doesn't fly, because I forgot to put the fuel in
        myModel.setFlyBehaviour(new FlyRocketPowered());

        // To the moooooon
        myModel.performFly();
    }
}
