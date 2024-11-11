/**
 * SA31 Java文法 Lesson1 Ex3
 *
 * JavaScript実行ファイル
 *
 * @author Shinzo SAITO
 */
import NameAndAge from "./NameAndAge.mjs";

const nanashi = new NameAndAge();
nanashi.show();
const taro = new NameAndAge();
taro.name = "田中太郎";
taro.age = 28;
taro.show();