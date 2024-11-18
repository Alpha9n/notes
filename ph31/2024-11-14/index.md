## Cookieの使い方
[動作の例](http://localhost/cookie/)

- cookieに値をセットする
    ```php
    // この場合、1時間後にcookieが削除される
    // 60 * 60 * 24しているのは、秒数で指定しているためわかりやすいように
    setcookie('name', 'value', time() + 60 * 60 * 24);
    ```
- Cookieから値を取り出す
    ```php
    $name = $_COOKIE['name'];
    ```
> ## time関数
> time()は1970/01/01 00:00:00(Unix Epoch)からの経過秒数を返す関数です。
- Cookieを削除する
    ```php
    // 現在よりも前の時間に期限を設定することによって、cookieを削除することができる
    setcookie('name', '', time() - 60 * 60);
    ```


## sessionの使い方
[動作の例](http://localhost/session/)

- sessionを開始する
    ```php
    // sessionを使用するすべてのページに記述しなければならない
    session_start();
    ```
- sessionに値をセットする
    ```php
    $_SESSION['name'] = '神保';
    ```
- sessionから値を取り出す
    ```php
    // サーバーから値を取り出す
    $name = $_SESSION['name'];
    ```
- sessionを削除する
    ```php
    unset($_SESSION['name']); // 個別に情報を削除
    $_SESSION = [] // sessionのすべての情報を削除
    session_destroy(); // sessionをすべて削除
    ```
    ここではセッションは消えるがcookieが消えないので、cookieも消したい場合は以下のようにする
    ```php
    session_destroy();
    setcookie('PHPSESSID', '', time() - 60 * 60);
    ```
## 外部ファイルの読み込み
- require, includeを使用することで外部ファイルを読み込みphp, htmlとして実行することが可能
- 長いプログラムを記述する際に、ファイルを分割して構成することで、作業の分担やバグの修正などを容易にすることができる。
- 主に関数ファイルの読み込みで処理部と表示部の分割などに使用される
- 表示部の中でもヘッダー・フッター部分の共通化に使用される

## 読み込み方
- include
    ファイルの読み込みに失敗してもincludeの部分だけ飛ばして処理を続行する
- require
    ファイルの読み込みに失敗するとエラーを出力して処理を停止する
- include_once, require_once
    onceは一度しか同じプログラムを読み込めない