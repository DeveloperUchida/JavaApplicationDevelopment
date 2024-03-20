import java.util.Scanner;
public class main {
    //バーコードされたユーザー名とパスワード
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    public static void main(string[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ログインしてください");

        //ユーザー名の入力
        System.out.print("ユーザー名: ");
        String inputUsername = scanner.nextLine();

        //パスワード入力
        System.out.print("パスワード: ");
        String inputPassword = scanner.nextLine();


    }
}
