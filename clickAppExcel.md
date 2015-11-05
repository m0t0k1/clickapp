### Excel VBAのソースコード

ちょっとxlsmを開くのは勇気がいるような気がするので、コードをそのまま掲載しておきます。

```vb
Option Explicit

Sub countupByClick()
    Static counter As Long
    counter = counter + 1
    With Sheet1.Shapes.Item("10-point star 1").TextEffect
        .Text = counter
    End With
End Sub
```
