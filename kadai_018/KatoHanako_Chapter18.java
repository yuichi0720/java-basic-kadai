package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

    public KatoHanako_Chapter18() {
        super("花子"); // 親クラスのコンストラクタを呼び出す
    }

    @Override
    void eachIntroduce() {
        System.out.println("私は設計が得意です");
    }
}
