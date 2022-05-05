public class HotpotProducer {
    public static void main(String[] args){
        ChengduHotpot factory =new ChengduHotpot();
        Hotpot maoduhotpot=factory.createProduct(MaoduHotpot.class);
        maoduhotpot.createHotpot();
        maoduhotpot.hotpotClass();
        Hotpot yangrouhotpot=factory.createProduct(YangrouHotpot.class);
        yangrouhotpot.createHotpot();
        yangrouhotpot.hotpotClass();
    }
}
