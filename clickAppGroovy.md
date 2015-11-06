# Groovyでクリックするとカウントアップするアプリ

まずgvm（現在はsdkman、Windowsではposh-gvm）でGradleとLazybonesをインストールします。

```
gvm install lazybones
gvm install gradle
```

次に```$USER_HOME/.lazybones/config.groovy```を作って以下のように記述します。

```groovy
bintrayRepositories = [
  "griffon/griffon-lazybones-templates",
  "pledbrook/lazybones-templates"
]
```

そうしたらlazybonesコマンドによってプロジェクトフォルダを作成します。

```
lazybones create griffon-javafx-groovy clickAppGroovy
```

プロジェクトフォルダ内へ移動して、ビルドします。

```
gradle build
```

ビルドが正常終了していたらテストも行います。

```
gradle test
```

最後に実行すると、すでにクリックするとカウントアップされるアプリが完成しています！！

```
gradle run
```

![clickAppGroovy](https://github.com/m0t0k1/clickapp/blob/master/clickapp.png)
