/**
 * Created by alex on 20/02/2017.
 */
public class apple {
    public static void main(String[] args) {
//        food test[] = new food[2];
//
//        test[0] = new tuna();
//        test[1] = new lasagna();
//
//        for (food aTest : test){
//            aTest.eat();
//        }

        fat theFat = new fat();

        food fo = new food();
        food to = new tuna();

        theFat.digest(fo);
        theFat.digest(to);

    }
}
