package org.example;

import java.util.Comparator;
import java.util.List;

// Shift を 2 回押して 'どこでも検索' ダイアログを開き、`show whitespaces` と入力して
// Enter キーを押します。これでコードに空白文字が表示されます。
public class Main {
    public static void main(String[] args) {
        List<String> menbersNameSet = List.of("rufie", "tanjirou", "naruto","songoku");
        List<String> sortedreversOrderMap = menbersNameSet.stream().sorted(Comparator.reverseOrder()).map(String::toUpperCase).toList();
        System.out.println(sortedreversOrderMap);

        boolean isEmpty = menbersNameSet.stream().noneMatch(menber -> menber.equals("麦わらの一味"));
        System.out.println(isEmpty);
    }
}

