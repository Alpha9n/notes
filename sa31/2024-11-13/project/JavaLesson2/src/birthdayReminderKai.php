<?php
/**
 * SA31 課題2
 * 誕生日通知
 *
 * @author Kosuke Jimbo
 */

require_once('./GirlFriend.php');

$girlFriends = [
    ['name' => 'まゆみ', 'birthYear' => 2003, 'birthMonth' => 1, 'birthDay' => 5],
    ['name' => 'さちこ', 'birthYear' => 2006, 'birthMonth' => 5, 'birthDay' => 15],
    ['name' => 'まい', 'birthYear' => 2000, 'birthMonth' => 5, 'birthDay' => 25],
    ['name' => 'なみ', 'birthYear' => 2001, 'birthMonth' => 8, 'birthDay' => 3],
    ['name' => 'えり', 'birthYear' => 2003, 'birthMonth' => 11, 'birthDay' => 19],
    ['name' => 'りえ', 'birthYear' => 2005, 'birthMonth' => 12, 'birthDay' => 23]
];

$girlFriendInstances = [];
$currentYear = 2024;

foreach ($girlFriends as $girlFriend) {
    $girlFriendInstances[] = new GirlFriend($girlFriend['name'], $girlFriend['birthYear'], $girlFriend['birthMonth'], $girlFriend['birthDay']);
}
?>


<!doctype html>
<html lang="ja">
<head>
    <meta charset="UTF-8">
    <meta name="viewport"
          content="width=device-width, user-scalable=no, initial-scale=1.0, maximum-scale=1.0, minimum-scale=1.0">
    <meta http-equiv="X-UA-Compatible" content="ie=edge">
    <title>PHP | 誕生日通知</title>
</head>
<body>
<?php for($month = 1; $month <= 12; $month+=1): ?>
    <h2><?php echo '◼◼◼◼'.$month.'月です。' ?></h2>
    <?php $existBirthGirl = false; ?>
    <?php foreach($girlFriendInstances as $friendInstance): ?>
        <?php if($friendInstance->isBirthMonth($month)): ?>
            <p><?php echo $friendInstance->getName().'ちゃんが'.$friendInstance->getBirthDay().'日に誕生日です。'.$friendInstance->getAge($currentYear).'歳になります。メッセージを送りましょう！' ?></p>
            <?php $existBirthGirl = true; ?>
        <?php endif; ?>
    <?php endforeach; ?>
    <?php if(!$existBirthGirl): ?>
        <p>誕生日を迎える女性はいません。安心してください。</p>
    <?php endif; ?>
<?php endfor; ?>
</body>
</html>
