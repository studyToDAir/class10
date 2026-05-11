using System;
using System.Collections.Generic;
using System.ComponentModel;
using System.Data;
using System.Drawing;
using System.Linq;
using System.Text;
using System.Threading.Tasks;
using System.Windows.Forms;

namespace Calculator
{
    public partial class Form1 : Form
    {
        bool isFirst = true;
        bool hasDot = false;
        double first = 0;

        string status = "INIT";
        private void init(bool reset_first=true)
        {
            isFirst = true;
            hasDot = false;
            if (reset_first)
            {
                first = 0;
            }
        }

        public Form1()
        {
            InitializeComponent();

            init();
        }

        private void tableLayoutPanel1_Paint(object sender, PaintEventArgs e)
        {

        }


        private void btn9_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "9";
            }
            else
            {
                display.Text += "9";
            }

            if(status == "INIT")
            {
                display.Text = "9";
                status = "INPUT";
            } else if(status == "INPUT")
            {
                display.Text += "9";
            }
        }

        private void btn8_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "8";
            }
            else
            {
                display.Text += "8";
            }
        }

        private void btn7_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "7";
            }
            else
            {
                display.Text += "7";
            }
        }

        private void btn6_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "6";
            }
            else
            {
                display.Text += "6";
            }

        }

        private void btn5_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "5";
            }
            else
            {
                display.Text += "5";
            }

        }

        private void btn4_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "4";
            }
            else
            {
                display.Text += "4";
            }


        }

        private void btn3_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "3";
            }
            else
            {
                display.Text += "3";
            }

        }

        private void btn2_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "2";
            }
            else
            {
                display.Text += "2";
            }

        }

        private void btn1_Click(object sender, EventArgs e)
        {
            if (isFirst)
            {
                isFirst = false;
                display.Text = "1";
            }
            else
            {
                display.Text += "1";
            }

        }

        private void btn0_Click(object sender, EventArgs e)
        {
            if (display.Text != "0")
            {
                display.Text += "0";
            }
        }

        private void dot_Click(object sender, EventArgs e)
        {
            if (!hasDot)
            {
                display.Text += ".";
                hasDot = true;
            }
        }

        private void ac_Click(object sender, EventArgs e)
        {
            init();
            display.Text = "0";
        }


        private void plus_Click(object sender, EventArgs e)
        {
            first = double.Parse(display.Text);
            init(false);
        }

        private void back_Click(object sender, EventArgs e)
        {
            try
            {
                display.Text = display.Text.Substring(0, display.Text.Length - 1);
                if (display.Text.Length == 0)
                {
                    display.Text = "0";
                    init();
                }
                double d = double.Parse(display.Text);
                display.Text = ""+ d;

                // 잘라진 글씨가 "."이면~ 으로 처리하자
                // 왜냐면: 1.001 한칸 지우면 1.00을 유지해야 1.002로 작성하기 쉽다
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
        }

        private void eq_Click(object sender, EventArgs e)
        {
            try
            {
                double second = double.Parse(display.Text);
                double result = first + second;
                display.Text = "" + result;

                init();
            }
            catch (Exception ex)
            {
                Console.WriteLine(ex.ToString());
            }
        }
    }
}
