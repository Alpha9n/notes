/**
 * SA31 Java文法 Lesson1 Ex2
 *
 * JavaScript実行ファイル
 *
 * @author Shinzo SAITO
 */
const numes = [];
const denomis = [];
for (let i = 0; i <= 4; i++) {
    numes[i] = Math.round(Math.random() * 10);
    denomis[i] = Math.round(Math.random() * 10);
}

for (const denomi of denomis) {
    console.log(`◼︎分母の値: ${denomi}`);
    if (denomi === 0) {
        console.log("分母が0なので処理を中止します");
        break;
    }
    for (const nume of numes) {
        console.log(`--分子の値: ${nume}`);
        if (nume === 0) {
            console.log("→分子の値が0なので次の分子にスキップします");
            continue;
        }
        const ans = nume / denomi;
        console.log(`→分数値: ${ans}`);
    }
}