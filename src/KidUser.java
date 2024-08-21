public class KidUser implements UserAuntitificable{
    @Override
    public void type() {
        System.out.println("Детский аккаунт");
    }

    @Override
    public void limit() {
        System.out.println("До 1000 ");
    }

    @Override
    public void percent() {
        System.out.println("2%");
    }
}
