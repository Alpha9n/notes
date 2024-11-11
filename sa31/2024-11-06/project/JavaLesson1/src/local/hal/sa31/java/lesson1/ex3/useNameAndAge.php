<?php
/**
 * SA31 Java文法 Lesson1 Ex3
 *
 * PHP実行ファイル
 *
 * @author Shinzo SAITO
 */

require_once("NameAndAge.php");

$nanashi = new NameAndAge();
$nanashi->show();
$taro = new NameAndAge();
$taro->name = "田中太郎";
$taro->age = 28;
$taro->show();
