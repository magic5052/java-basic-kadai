package kadai_026;

import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Jyanken_Chapter26 {

    public String getMyChoice(String a) {

        /* Stringメソッドではどうやってフロー通りに正しい手を判定するかわからないので
        とりあえず正しい手ではない場合、nullと出力してplayGameメソッドで判定を行わせます。
         */

        return a.equals("s") || a.equals("p") || a.equals("r")? a: "";
    }

    public String getRandom() {

        String[] choice = {"グー", "チョキ", "パー"};
        Random rnd = new Random();
        int index = rnd.nextInt(choice.length);
        return choice[index];
    }

    public void playGame() {

        HashMap<String, String> rules = new HashMap<>();
        rules.put("p", "パー");
        rules.put("r", "グー");
        rules.put("s", "チョキ");

        System.out.println("自分のじゃんけんの手を入力しましょう");
        System.out.println("グーはrockのrを入力しましょう");
        System.out.println("チョキはscissorsのsを入力しましょう");
        System.out.println("パーはpaperのpを入力しましょう");

        do {
            Scanner s = new Scanner(System.in);
            String input = s.nextLine();

            String myChoice = getMyChoice(input);
            String randomChoice = getRandom();
            String my = rules.get(myChoice);

            if (myChoice.equals(input)) {

                System.out.println("自分の手は" + my + "、対戦相手の手は" + randomChoice);

                if (my.equals(randomChoice)) {
                    System.out.println("あいこです。");
                } else if ((my.equals("パー") && randomChoice.equals("グー")) || (my.equals("チョキ") && randomChoice.equals("パー")) || (my.equals("グー") && randomChoice.equals("チョキ"))) {
                    System.out.println("自分の勝ちです。");
                } else {
                    System.out.println("自分の負けです。");
                }
                break;
            }

            System.out.println("再度自分のじゃんけんの手を選んでください");

        } while (true);

    }

}
