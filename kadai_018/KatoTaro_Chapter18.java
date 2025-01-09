package kadai_018;

public class KatoTaro_Chapter18 extends Kato_Chapter18 {

    // コンストラクタの追加
    public KatoTaro_Chapter18() {
        super("太郎"); // ここで親クラスのコンストラクタを呼び出す
    }

    @Override
    void eachIntroduce() {
        System.out.println("私はJavaが得意です");
    }
}
