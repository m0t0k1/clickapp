using System;
using System.Drawing;
using System.Windows.Forms;

class Program
{
  static void Main()
  {
    Application.Run(new CountupForm());
  }
}

class CountupForm : Form
{
  Button countup;
  Label counter;
  long count = 0;
  public CountupForm()
  {
    initComponent();
  }
  void initComponent()
  {
    this.Width = 240;
    this.Height = 240;
    this.Text = "クリックしたらカウントアップ";

    this.counter = new Label();
    this.counter.Location = new Point(60, 16);
    this.counter.Size = new Size(120, 96);
    this.counter.Font = new Font(new FontFamily("Meiryo UI"), 40.0F);
    this.counter.Text = "";

    this.countup = new Button();
    this.countup.Location = new Point(60, 128);
    this.countup.Size = new Size(120, 64);
    this.countup.Font = new Font(new FontFamily("Meiryo UI"), 32.0F);
    this.countup.Text = "押す";

    this.countup.Click += new EventHandler(this.countup_click);
    this.Controls.Add(this.counter);
    this.Controls.Add(this.countup);
  }

  void countup_click(object sender, EventArgs e)
  {
    this.count++;
    this.counter.Text = this.count.ToString();
  }
}
