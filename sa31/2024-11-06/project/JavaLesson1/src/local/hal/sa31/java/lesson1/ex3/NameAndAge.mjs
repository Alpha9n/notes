/**
 * SA31 Java文法 Lesson1 Ex3
 *
 * 名前と年齢を保持するクラス
 *
 * @author Shinzo SAITO
 */
export default class NameAndAge {
    name = "名無し";
    age = -1;

    show() {
        let printStr = `${this.name}さんは`;
        if (this.age === -1) {
            printStr += "年齢不詳です。";
        }
        else {
            printStr += `${this.age}歳です。`;
        }
        console.log(printStr);
    }
}