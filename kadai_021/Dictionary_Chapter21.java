package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    public void search(String w) {

        HashMap<String, String> dic = new HashMap<String, String>();

        dic.put("apple", "りんご");
        dic.put("peach", "桃");
        dic.put("banana", "バナナ");
        dic.put("lemon", "レモン");
        dic.put("pear", "梨");
        dic.put("kiwi", "キウィ");
        dic.put("strawberry", "いちご");
        dic.put("grape", "ぶどう");
        dic.put("muscat", "マスカット");
        dic.put("cherry", "さくらんぼ");

        // 単語の意味を変数に代入する
        String meaning = dic.get(w);

        // 単語が存在しない => 単語の意味が存在しない　 => meaning == null
        if (meaning == null) {
            System.out.println(w + "は辞書に存在しません");
        } else {
            System.out.println(w + "の意味は" + meaning);
        }

    }
}
