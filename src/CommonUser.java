public class CommonUser implements UserAuntitificable
{
    @Override
    public void type() {
        System.out.println("Обычный аккаунт");
    }

    @Override
    public void limit() {
        System.out.println("До 100 000 ");

    }

    @Override
    public void percent() {
        System.out.println("Без процентов");

    }
}
