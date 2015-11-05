$Error.Clear()
Add-Type -AssemblyName PresentationFramework

[xml]$xaml = @'
<Window
  xmlns="http://schemas.microsoft.com/winfx/2006/xaml/presentation"
  Title="クリックするとカウントアップする"
  Width = "240" Height="240">
  <StackPanel>
    <Label
      Name="counter"
      FontFamily="Meiryo UI"
      FontSize="40"
      Width="120"
      Height="64"
      Margin="16,16"></Label>
    <Button
      Name="countup"
      FontFamily="Meiryo UI"
      FontSize="32"
      Width="120"
      Height="64"
      Margin="16,16"
      Content="押す">
    </Button>
  </StackPanel>
</Window>
'@

$render = New-Object System.Xml.XmlNodeReader $xaml
try{
  $frm = [System.Windows.Markup.XamlReader]::Load($render)
}catch [Exception]{
  throw
}
$counter = $frm.FindName("counter")
$countup = $frm.FindName("countup")
$script:count = 0
$countup.Add_Click({
    $script:count = $script:count + 1
    $counter.Content = $script:count.ToString()
})
$frm.ShowDialog() | Out-Null
