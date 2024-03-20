import java.util.Scanner;
public class main {
    //バーコードされたユーザー名とパスワード
    private static final String USERNAME = "user";
    private static final String PASSWORD = "password";

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.println("ログインしてください");

        //ユーザー名の入力
        System.out.print("ユーザー名: ");
        String inputUsername = scanner.nextLine();

        //パスワード入力
        System.out.print("パスワード: ");
        String inputPassword = scanner.nextLine();

        //入力されたユーザー名とパスワードが正しいかどうかをチェック
        if(login(inputUsername, inputPassword)){
            System.out.println("ログイン成功！！");
            //ログイン後の処理を下記に記載
        }else{
            System.out.println("ログインに失敗しました。ユーザー名やパスワードを確認の上もう一度入力してください。");
        }
    }
    //ログイン処理
    private static boolean login(String username, String passowrd){
        return username.equals(USERNAME) && passowrd.equals(PASSWORD);
    }
}
