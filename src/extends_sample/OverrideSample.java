package extends_sample;

public class OverrideSample {
    public static void main(String[] args) {
        MailMember mailMember = new MailMember("yamada", "yama001@esm.co.jp");
        mailMember.printDetail();
        mailMember.printDetails();
        Member member = mailMember; // スーパークラスの型の変数に代入可能
        member.printDetail();
        // member.printDetails(); // Memberクラスに、printDetails()は定義されていない
    }
}

class Member {
    private String name;
    public Member(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }
    public void printDetail() {
        System.out.println("Name=" + name);
    }
}

class MailMember extends Member {
    private String email;
    public MailMember(String name, String email) {
        super(name); // スーパークラスのコンストラクタ呼び出し
        this.email = email;
    }

    // @Override // この行を書くとコンパイルエラーになる
    public void printDetails() { // メソッド名が異なるのでオーバーライドしていない
        System.out.println("Name=" + getName() + ", Email=" + email);
    }
}
