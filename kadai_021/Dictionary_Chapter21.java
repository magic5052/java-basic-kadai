package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {

    public void search(String[] s) {

        HashMap<String, String> dic = new HashMap<>();

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

        for (String w : s) {

            // 繰り返し処理をDictionary_Chapter21クラスに移動した
            String meaning = dic.get(w);

            if (meaning == null) {
                System.out.println(w + "は辞書に存在しません");
            } else {
                System.out.println(w + "の意味は" + meaning);
            }
        }
    }
}
