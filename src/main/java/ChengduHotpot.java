public class ChengduHotpot extends HotpotFactory{
    @Override
    public <T extends Hotpot> T createProduct(Class<T> t) {
        Hotpot hotpot = null;
        try {
            hotpot = (T)Class.forName(t.getName()).newInstance();
        }catch (Exception e) {
            System.out.println("成都火锅生产出错");
        }
        return (T) hotpot;
    }
}
