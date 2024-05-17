package Exemple19;

//  tinh da ke thua trong java
public class Main {
    public static void main(String[] args) {
        NguoiVietNam nguoiVietNam = new NguoiVietNam("Cao Hieu", 2003);

        NguoiMy nguoiMy = new NguoiMy("Dinh Phuong", 2004);

        NguoiBaLan nguoiBaLan = new NguoiBaLan("Nghia Nguyen", 2003);

        nguoiBaLan.xinChao();
        nguoiMy.xinChao();
        nguoiVietNam.xinChao();
    }
}
