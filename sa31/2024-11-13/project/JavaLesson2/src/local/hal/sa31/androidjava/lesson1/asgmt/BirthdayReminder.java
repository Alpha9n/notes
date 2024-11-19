package local.hal.sa31.androidjava.lesson1.asgmt;

public class BirthdayReminder {
    public static void main(String[] args) {
        GirlFriend[] girlFriends = new GirlFriend[6];
        int currentYear = 2024;

        girlFriends[0] = new GirlFriend("まゆみ", 2003, 1, 5);
        girlFriends[1] = new GirlFriend("さちこ", 2006, 5, 15);
        girlFriends[2] = new GirlFriend("まい", 2000, 5, 25);
        girlFriends[3] = new GirlFriend("なみ", 2001, 8, 3);
        girlFriends[4] = new GirlFriend("えり", 2003, 11, 19);
        girlFriends[5] = new GirlFriend("りえ", 2005, 12, 23);

        for (int month = 1; month <= 12; month++) {
            System.out.println("◼◼◼◼" + month + "月です。");
            for (GirlFriend girlFriend : girlFriends) {
                if (girlFriend.isBirthMonth(month)) {
                    String message = String.format(
                            "%sちゃんが%d日に誕生日です%d歳になります。メッセージを送りましょう！",
                            girlFriend.getName(),
                            girlFriend.getBirthDay(),
                            girlFriend.getAge(currentYear)
                            );
                    System.out.println(message);
                }
            }
        }
    }
}
