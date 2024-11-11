/**
 * SA31 Java文法 Lesson1 Ex1
 *
 * JavaScript実行ファイル
 *
 * @author Shinzo SAITO
 */
const score = Math.round(Math.random() * 100);
console.log(`あなたの点数: ${score}`);
// score = 35;
let msg = "";
if (score >= 80) {
    msg = "優です。";
}
else if (score >= 80) {
    msg = "良です。";
}
else if (score >= 80) {
    msg = "可です。";
}
else if (score >= 80) {
    msg = "不可です。";
}
console.log(msg);
// msg = 35;