package Ex2;

public class Main {
    public static void main(String[] args) {
        Kettle k = new Kettle("Chainik", "Ote keremet chainikkoi koroche");
        k.show();
        k.sound("pik pik puk");
        k.desc();

        System.out.println();

        Microwave mc = new Microwave("Samsung", "priyatnogo opetita");
        mc.show();
        mc.sound("buruuuuuuum buruuuuum vzzz vzz");
        mc.desc();

        System.out.println();

        Automobile a = new Automobile("Lexus", "High quality leveled car, for strong men");
        a.show();
        a.sound("aaaannnnn aaaaaannn aaaaaaauuuuuuufffff");
        a.desc();

        System.out.println();

        Steamship s = new Steamship("Paraxod", "No idea what to say sorry");
        s.show();
        s.sound("vz pux vz");
        s.desc();
    }
}
