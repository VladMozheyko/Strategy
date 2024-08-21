/**
 * Главный класс для банкомата
 * @author Vlad
 * @version 1.0
 * @data 04.08.2024
 */
public class Main {
    public static void main(String[] args) {

        Bankomat bankomat1 = new Bankomat(new BusinessUser());
        Bankomat bankomat2 = new Bankomat(new CommonUser());
        bankomat1.getUserAuntitificable().type();
        bankomat2.getUserAuntitificable().type();
        Bankomat bankomat3 = new Bankomat(new KidUser());
        bankomat3.getUserAuntitificable().type();


    }
}