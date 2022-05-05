public abstract class HotpotFactory {
    public abstract  <T extends Hotpot> T createProduct(Class<T> t);
}
