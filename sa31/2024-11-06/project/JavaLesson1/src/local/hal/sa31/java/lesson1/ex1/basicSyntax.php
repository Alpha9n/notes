<?php
/**
 * SA31 Java文法 Lesson1 Ex1
 *
 * PHP実行ファイル
 *
 * @author Shinzo SAITO
 */
$score = rand(0, 100);
print("あなたの点数: ".$score."<br>");
$msg = "";
if (score >= 80) {
    $msg = "優です。";
}
else if (score >= 80) {
    $msg = "良です。";
}
else if (score >= 80) {
    $msg = "可です。";
}
else {
    $msg = "不可です。";
}
print($msg);
// $msg = 35;