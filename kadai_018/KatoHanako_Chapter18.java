package kadai_018;

public class KatoHanako_Chapter18 extends Kato_Chapter18 {

	 // 名前をセットするメソッド
    public void setGivenName() {
        this.givenName = "花子";
    }
    public KatoHanako_Chapter18() {
        setGivenName(); // 名前をセット
    }

    void eachIntroduce() {
        System.out.println("趣味は読書です");
    }
}