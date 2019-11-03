from tkinter import *
import math
import parser
import tkinter.messagebox

root = Tk()
root.title("Calculator")
root.configure(background="blue")
root.resizable(width=True, height=True)
root.geometry("400x500+0+0")

Calculator = Frame(root)
Calculator.grid()


class Calc():
    def __init__(self):
        self.total = 0
        self.current = ""
        self.input_value = True
        self.check_sum = False
        self.op = ""
        self.result = False

    def numberEnter(self, num):
        self.result = False
        firstnum = text_display.get()
        secondnum = str(num)
        if self.input_value:
            self.current = secondnum
            self.input_value = False
        else:
            if secondnum == '.':  # Important to understand
                if secondnum in firstnum:
                    return
            self.current = firstnum + secondnum
        self.display(self.current)

    def valid_function(self):
        if self.op == "add":
            self.total += self.current
        if self.op == "sub":
            self.total -= self.current
        if self.op == "multi":
            self.total *= self.current
        if self.op == "divide":
            self.total /= self.current
        if self.op == "mod":
            self.total %= self.current
        self.input_value = True
        self.check_sum = False
        self.display(self.total)

    def sum_of_total(self):
        self.result = True
        self.current = float(self.current)
        if self.check_sum == True:
            self.valid_function()
        else:
            self.total = float(text_display.get())

    def display(self, value):
        text_display.delete(0, END)
        text_display.insert(0, value)

    def operation(self, op):
        self.current = float(self.current)
        if self.check_sum:
            self.input_function()
        elif not self.result:
            self.total = self.current
            self.input_value = True
        self.check_sum = True
        self.op = op
        self.result = False

    def Pi(self):
        self.result = False
        self.current = math.pi
        self.display(self.current)

    def tau(self):
        self.result = False
        self.current = (math.pi) * 2 # tau function is not available in the current version
        self.display(self.current)

    def eulernumber(self):
        self.result = False
        self.current = math.e
        self.display(self.current)

    def clear_entry(self):
        self.result = False
        self.current = "0"
        self.display(0)
        self.input_value =True

    def all_clear_entry(self):
        self.clear_entry()
        self.total = 0

    def plus_minus_sign(self):
        self.result =False
        self.current = -(float(text_display.get()))
        self.display(self.current)

    def square(self):
        self.result =False
        self.current = math.sqrt(float(text_display.get()))
        self.display(self.current)

    def cosine(self):
        self.result =False
        self.current =math.cos(math.radians(float(text_display.get())))
        self.display(self.current)

    def cosine_hyperbolic(self):
        self.result =False
        self.current =math.cosh(math.radians(float(text_display.get())))
        self.display(self.current)

    def arc_cosine_hyperbolic(self):
        self.result = False
        self.current = math.acosh(float(text_display.get()))
        self.display(self.current)

    def tangent(self):
        self.result =False
        self.current =math.tan(math.radians(float(text_display.get())))
        self.display(self.current)

    def tangent_hyperbolic(self):
        self.result =False
        self.current =math.tanh(math.radians(float(text_display.get())))
        self.display(self.current)

    def sine(self):
        self.result = False
        self.current = math.sin(math.radians(float(text_display.get())))
        self.display(self.current)

    def sine_hyperbolic(self):
        self.result = False
        self.current = math.sinh(math.radians(float(text_display.get())))
        self.display(self.current)

    def arc_sine_hyperbolic(self):
        self.result = False
        self.current = math.asinh(float(text_display.get()))
        self.display(self.current)

    def log(self):
        self.result = False
        self.current = math.log(float(text_display.get()))
        self.display(self.current)

    def expo(self):
        self.result = False
        self.current = math.exp(float(text_display.get()))
        self.display(self.current)

    def exmp1(self):
        self.result = False
        self.current = math.expm1(float(text_display.get()))
        self.display(self.current)

    def lgamma(self):
        self.result =False
        self.current = math.lgamma(float(text_display.get()))
        self.display(self.current)

    def degrees(self):
        self.result =False
        self.current =math.degrees(float(text_display.get()))
        self.display(self.current)

    def log2(self):
        self.result = False
        self.current = math.log2(float(text_display.get()))
        self.display(self.current)

    def log10(self):
        self.result =False
        self.current = math.log10(float(text_display.get()))
        self.display(self.current)

    def log1p(self):
        self.result = False
        self.current = math.log1p(float(text_display.get()))
        self.display(self.current)

    def parentheses_left(self):
        self.result = False
        self.current =(float(text_display.get()))
        self.display(self.current)

    def parentheses_right(self):
        self.result = False
        self.current =(float(text_display.get()))
        self.display(self.current)


added_value = Calc()

text_display = Entry(Calculator, font=('arial', 20, 'bold'), bg="dark turquoise", bd=30, width=28, justify=RIGHT)
text_display.grid(row=0, column=0, columnspan=4, pady=1)
text_display.insert(0, "0")

number_pad = "789456123"
i = 0
botton = []
for j in range(2, 5):
    for k in range(3):
        botton.append(Button(Calculator, width=6, height=3, font=('arial', 20, 'bold'), bd=4, text=number_pad[i]))
        botton[i].grid(row=j, column=k, pady=1)
        botton[i]["command"] = lambda x=number_pad[i]: added_value.numberEnter(x)

        i += 1

# =============================================Standard (Bottons)=============================================
botton_Clear = Button(Calculator, text=chr(67), width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.clear_entry).grid(row=1, column=0, pady=1)

botton_Clear_All = Button(Calculator, text=chr(67) + chr(69), width=6, height=2, font=('arial', 20, 'bold'), bd=4,
                          bg="powder blue", command=added_value.all_clear_entry).grid(row=1, column=1, pady=1)

botton_Square_root = Button(Calculator, text="√", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="red",
                            command=added_value.square).grid(row=1, column=2, pady=1)

botton_Addition = Button(Calculator, text=chr(43), width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                         command=lambda: added_value.operation("add")).grid(row=1, column=3, pady=1)

botton_Subtraction = Button(Calculator, text=chr(45), width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                            command=lambda: added_value.operation("sub")).grid(row=2, column=3, pady=1)

botton_Multiplication = Button(Calculator, text="*", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                               command=lambda: added_value.operation("multi")).grid(row=3, column=3, pady=1)

botton_Division = Button(Calculator, text=chr(247), width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                         command=lambda: added_value.operation("divide")).grid(row=4, column=3, pady=1)

botton_Zero = Button(Calculator, text="0", width=6, height=2, font=('arial', 20, 'bold'), bd=4,
                     bg="powder blue", command=lambda: added_value.numberEnter(0)).grid(row=5, column=0, pady=1)

botton_Dot = Button(Calculator, text=".", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                    command=lambda: added_value.numberEnter(".")).grid(row=5, column=1, pady=1)

botton_Plus_Minus = Button(Calculator, text="( " + chr(45) + " )", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                           command=added_value.plus_minus_sign).grid(row=5, column=2, pady=1)

botton_Equal = Button(Calculator, text=chr(61), width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.sum_of_total).grid(row=5, column=3, pady=1)

# ==============================Scientific Calculator (Bottons and their dimensions)=======================
botton_pi = Button(Calculator, text="π", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                   command=added_value.Pi).grid(row=1, column=4, pady=1)

botton_cosin = Button(Calculator, text="cos", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.cosine).grid(row=1, column=5, pady=1)

botton_tangent = Button(Calculator, text="tan", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                        command=added_value.tangent).grid(row=1, column=6, pady=1)

botton_sine = Button(Calculator, text="sin", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                     command=added_value.sine).grid(row=1, column=7, pady=1)

botton_2pi = Button(Calculator, text="2π", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                    command=added_value.tau).grid(row=2, column=4, pady=1)

botton_Cosh = Button(Calculator, text="cosh", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                     command=added_value.cosine_hyperbolic).grid(row=2, column=5, pady=1)

botton_tanh = Button(Calculator, text="tanh", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                     command=added_value.tangent_hyperbolic).grid(row=2, column=6, pady=1)

botton_sinh = Button(Calculator, text="sinh", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                     command=added_value.sine_hyperbolic).grid(row=2, column=7, pady=1)

botton_log = Button(Calculator, text="log", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                    command=added_value.log).grid(row=3, column=4, pady=1)

botton_Expo = Button(Calculator, text=chr(94), width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                     command=added_value.expo).grid(row=3, column=5, pady=1)

botton_Mod = Button(Calculator, text="Mod", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                    command=lambda: added_value.operation("mod")).grid(row=3, column=6, pady=1)

botton_E = Button(Calculator, text="e", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                  command=added_value.eulernumber).grid(row=3, column=7, pady=1)

botton_log2 = Button(Calculator, text="log2", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                     command=added_value.log2).grid(row=4, column=4, pady=1)

botton_degree = Button(Calculator, text="deg", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                       command=added_value.degrees).grid(row=4, column=5, pady=1)

botton_acosh = Button(Calculator, text="acosh", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.arc_cosine_hyperbolic).grid(row=4, column=6, pady=1)

botton_asinh = Button(Calculator, text="asinh", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.arc_sine_hyperbolic).grid(row=4, column=7, pady=1)

botton_Log10 = Button(Calculator, text="log10", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.log10).grid(row=5, column=4, pady=1)

botton_log1p = Button(Calculator, text="log1p", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.log1p).grid(row=5, column=5, pady=1)

botton_expm1 = Button(Calculator, text="asinh", width=6, height=1, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                      command=added_value.exmp1).grid(row=5, column=6, pady=1)

botton_lgamma = Button(Calculator, text="lgamm", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                       command=added_value.lgamma).grid(row=5, column=7, pady=1)

botton_parentheses_left = Button(Calculator, text="(", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                                 command=added_value.parentheses_left).grid(row=7, column=0, pady=1)

botton_parentheses_right = Button(Calculator, text=")", width=6, height=2, font=('arial', 20, 'bold'), bd=4, bg="powder blue",
                                  command=added_value.parentheses_right).grid(row=7, column=1, pady=1)


label_Display = Label(Calculator, text="Scientific Calculator", font=('arial', 30, 'bold'), justify=CENTER)
label_Display.grid(row=0, column=4, columnspan=4)


# ====================Menu and Function=========================

def iExit():
    iExit = tkinter.messagebox.askyesno("Scientific Calculator", "Confirm if you want to exit")
    if iExit > 0:
        root.destroy()
        return


def Scientific():
    root.resizable(width=True, height=True)
    root.geometry("900x568+200+0")


def Standard():
    root.resizable(width=True, height=True)
    root.geometry("500x568+200+0")


menubar = Menu(Calculator)

filemenu = Menu(menubar, tearoff=0)
menubar.add_cascade(label="File", menu=filemenu)
filemenu.add_command(label="Standard", command=Standard)
filemenu.add_command(label="Scientific", command=Scientific)
filemenu.add_separator()
filemenu.add_command(label="Exit", command=iExit)

editmenu = Menu(menubar, tearoff=0)
menubar.add_cascade(label="Edit", menu=editmenu)
editmenu.add_command(label="Cut")
editmenu.add_command(label="Copy")
editmenu.add_separator()
editmenu.add_command(label="Paste")

helpmenu = Menu(menubar, tearoff=0)
menubar.add_cascade(label="Help", menu=helpmenu)
helpmenu.add_command(label="View Help")

root.config(menu=menubar)
root.mainloop()
