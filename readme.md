### what is this ?

ブログのネタです。  
クリックするとカウントアップするだけのアプリをいろんな言語で書いてみました。

### where is Groovy ?

ブログではGroovyのデモにGriffonを使いました。  
結果として一切のコード記述なしに完成してしまったのでGroovyについては行ったことだけを記述したマークダウンを用意しています。

### 実行に必要なもの

|言語|ソース|必要なもの|
|----|----|----|
|html|clickapp.html|ブラウザ|
|VBA|clickapp.xlsm|Excel2007以上|
|C#|clickapp.cs|csc.exeでビルド|
|PowerShell|clickapp.ps1|PowerShell3.0以上|
|Java|ClickAppJava|Java8, JavaFXへクラスパスを通す|
|Groovy|ClickAppGroovy.md|gvm、Java8|
|Python||Python3, PyQt5|

#### 補足：C#

ビルドが必要なので、C#コンパイラがあるところへパスを通してください。

```
csc /target:winexe clickapp.cs /out:clickapp.exe
```

#### 補足：PowerShell

最初に実行ポリシーを変更しておきましょう。

```PowerShell
Set-ExecutionPolicy -Scope CurrentUser -ExecutionPolicy RemoteSigned
```

コマンドラインからは次のようにすればいいです。

```PowerShell
powershell -sta -f clickapp.ps1
```

#### 補足：Java

JavaFXを使っているので、クラスパスに追加してやってください。

```
cd ClickAppJava
javac -cp 'C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jfxrt.jar;' -encoding utf-8 *.java -d .\classes\
cd classes
java -cp '.;C:\Program Files\Java\jdk1.8.0_60\jre\lib\ext\jfxrt.jar' ClickAppJava.ClickAppJava
```

#### 補足：Python

PyQt5を使っているので、事前にインストールが必要です。
なお、PyQt4とはライブラリの互換性がなさそうなので、PyQt4の場合はコードの修正が必要になります。
