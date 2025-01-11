package kadai_018;

abstract public class Kato_Chapter18 {
    // 姓を表す
    public String familyName = "加藤";
    // 名を表す
    public String givenName;
    // 住所を表す
    public String address = "東京都中野区○×";
    
    // 共通紹介部分
    public void commonIntroduce() {
        System.out.println("名前は" + familyName + givenName + "です");
        System.out.println("住所は" + address + "です");
    }

    // 個別の紹介部分 抽象メソッド
    abstract void eachIntroduce();

    // 自己紹介をまとめて呼び出す
    public void execIntroduce() {
        commonIntroduce();
        eachIntroduce();
        System.out.println();
    }

}