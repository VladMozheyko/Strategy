public class BusinessUser implements UserAuntitificable{
    @Override
    public void type() {
        System.out.println("Бизнес аккаунт");
    }

    @Override
    public void limit() {
        System.out.println("До 1 000 000 ");

    }

    @Override
    public void percent() {
        System.out.println("1%");
    }
}
