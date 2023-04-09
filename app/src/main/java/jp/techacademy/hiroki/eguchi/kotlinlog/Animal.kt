package jp.techacademy.hiroki.eguchi.kotlinlog

//抽象クラスの定義
abstract class Animal {
    // プロパティ
    var name: String
    var age: Int

    // 引数付きコンストラクタ
    constructor(name: String, age: Int,) {
        this.name = name
        this.age = age
    }

    //抽象関数の定義
    abstract fun say()
}
