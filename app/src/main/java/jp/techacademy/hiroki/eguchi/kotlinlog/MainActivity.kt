package jp.techacademy.hiroki.eguchi.kotlinlog

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log  //ログ出力用のモジュールをインポート

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        // クラス
        val human = Human("煌太郎", 3, "食べ物")      // 名前を煌太郎、年齢3歳で、Humanのインスタンスを作る
        human.say()
        human.think()

        val human2 = Human("江口弘樹", 31, "映画")      // 名前を江口弘樹、年齢31歳で、Humanのインスタンスを作る
        human2.say()
        human2.think()

    }
}