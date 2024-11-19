/**
 * SA31 課題2
 * 誕生日通知
 *
 * @author Kosuke Jimbo
 */

import GirlFriend from './GirlFriend.mjs';

/**
 * @type {{name: string, birthYear: number, birthMonth: number, birthDay: number}[]}
 */
const girlFriends = [
    {name: 'まゆみ', birthYear: 2003, birthMonth: 1, birthDay: 5},
    {name: 'さちこ', birthYear: 2006, birthMonth: 5, birthDay: 15},
    {name: 'まい', birthYear: 2000, birthMonth: 5, birthDay: 25},
    {name: 'なみ', birthYear: 2001, birthMonth: 8, birthDay: 3},
    {name: 'えり', birthYear: 2003, birthMonth: 11, birthDay: 19},
    {name: 'りえ', birthYear: 2005, birthMonth: 12, birthDay: 23}
];

/**
 * @type {GirlFriend[]}
 */
const girlFriendInstances = [];
const currentYear = 2024;

for(let girl of girlFriends) {
    girlFriendInstances.push(new GirlFriend(girl.name, girl.birthYear, girl.birthMonth, girl.birthDay));
}

for (let month = 1; month <= 12; month += 1) {
    console.log(`◼◼◼◼${month}月です。`);
    let existBirthGirl = false;
    for (let girlInstance of girlFriendInstances) {
        if (girlInstance.isBirthMonth(month)) {
            console.log(`${girlInstance.name}ちゃんが${girlInstance.birthDay}日に誕生日です。${girlInstance.getAge(currentYear)}歳になります。メッセージを送りましょう！`);
            existBirthGirl = true;
        }
    }
    if (!existBirthGirl) {
        console.log('誕生日を迎える女性はいません。安心してください。');
    }
}
