## オーバーライドとオーバーロード
継承、extendsを使用することで親子にすることができる
javaでは呼び方が少し違う、スーパークラスとサブクラスという呼び方をする
斉藤先生はこの呼び方が嫌いなので、親クラスと子クラスと呼ぶ
```java
public class Child extends Parent {
    // AはBを継承している
}
```

継承したクラスで同じ名前のメソッドを定義することができる。
これをオーバーライドという。
```java
public class Child extends Parent {
    @Override
    public void method() {
        // Bのmethodをオーバーライド
    }
}
```

ここで使用している`@Override`はアノテーションというもので、
このメソッドがオーバーライドされていることを示すものである。
@から始まるアノテーションはコンパイラに対して特別な命令を与えるものである。

子クラスのインスタンスは親クラスの型で宣言することができる
```java
Parent parent = new Child();
```
ただし！このように宣言すると、親クラスのメソッドしか呼び出すことができない。
```java
parent.childMethod(); // エラーとなる
```

### public private protected
- public: どこからでもアクセス可能
- private: 同じクラス内からのみアクセス可能
- protected: 同じパッケージ内、またはサブクラスからのみアクセス可能
- 無修飾: 同じパッケージ内からのみアクセス可能

> **PHPでは...Kotlinと同じ**  
> - public: どこからでもアクセス可能
> - private: 同じクラス内からのみアクセス可能
> - protected: 同じクラス内、またはサブクラスからのみアクセス可能  
> **JSでは(今までpublicしかなかったが、最近privateが追加された)**  
> - public: どこからでもアクセス可能
> - private: 同じクラス内からのみアクセス可能(#変数名)  
> **TSでは**  
> - public: どこからでもアクセス可能
> - private: 同じクラス内からのみアクセス可能(#とprivateどちらでも良いが#が推奨)
> - protected: 同じクラス内、またはサブクラスからのみアクセス可能


### オーバーロード
同じメソッド名で引数の型や個数が異なるメソッドを定義することができる。


### デフォルトコンストラクタ
コンストラクタを定義しない場合、デフォルトコンストラクタが自動的に定義される。
```java
public class Parent {
} // この場合、コンパイラが自動的にコンストラクタを定義する、これをデフォルトコンストラクタという
```

子クラスでは、親クラスのコンストラクタを呼び出す必要がある。
```java
public class Child extends Parent {
    public Child(String hoge1) {
        super(hoge1); // 親クラスのコンストラクタを呼び出す
    }
}
```
継承された子クラスのコンストラクタを呼び出した時、呼び出されるのは引数なしのコンストラクタのみである。  
親クラスに引数ありのコンストラクタがある場合、引数なしのコンストラクタはデフォルトコンストラクタとして自動的に定義されないので、子クラスで明示的に引数ありのコンストラクタを呼び出す必要がある。