<?php
/**
 * SA31 Java文法 Lesson1 Ex3
 *
 * クラスファイル
 *
 * @author Shinzo SAITO
 */

class NameAndAge {
    /**
     * @var string 名前を表すプロパティ
     */
    public string $name = "名無し";
    /**
     * @var int 年齢を表すプロパティ
     */
    public int $age = -1;

    /**
     * 名前と年齢を表示するメソッド。
     */
    public function show(): void {
        $printStr = $this->name."さんは";
        if ($this->age === -1) {
            $printStr .= "年齢不詳です。";
        }
        else {
            $printStr = $printStr.$this->age."歳です。";
        }
        print($printStr."<br>");
    }
}