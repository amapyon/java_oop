package interface_sample;

public class InterfaceSample {
    public static void main(String[] args) {
        Member yamada = new Member("yamada");
        Member sato = new Member("sato");
        School todai = new School("Hongo");
        {
            Member[] members = { yamada, sato };
            for (Member member : members) {
                member.hello(); // Memberクラスのメソッドが利用できる
                member.print();
            }
        }
        {
            // Printableインタフェースの配列
            Printable[] members = { todai, yamada, sato };
            for (Printable member : members) {
                member.print(); // Printableインタフェースのメソッドのみ利用可
            }
        }
    }
}

interface Printable {
    void print();
}

class Member implements Printable { // インタフェースの実装
    private String name;

    public Member(String name) {
        this.name = name;
    }

    // printメソッドがないとコンパイルエラーになる
    public void print() {
        System.out.println("I am " + name);
    }

    public void hello() {
        System.out.println("Hello!");
    }
}

class School implements Printable {
    private String address;

    public School(String address) {
        this.address = address;
    }

    // printメソッドがないとコンパイルエラーになる
    public void print() {
        System.out.println("Location is " + address);
    }

    public void lesson() {
        System.out.println("Let's study!");
    }
}
