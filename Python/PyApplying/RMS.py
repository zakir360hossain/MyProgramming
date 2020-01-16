import random
import time
import datetime
import tkinter.messagebox
from tkinter import *
import math

# ==============================Architecture=============================================================
root = Tk()
root.geometry("1350x750+0+0")
root.title("Restaurant Management System")
root.configure(background='PaleGreen2')

Tops = Frame(root, bg="Cadet Blue", bd=1, pady=2, relief=SUNKEN)
Tops.pack(side=TOP)
lblTitle = Label(Tops, font=('arial', 30, 'bold'), text="Restaurant Management System", bd=2, bg='lime green',
                 fg='Cornsilk', justify=CENTER)
lblTitle.grid(row=0, column=0)

localtime = time.asctime(time.localtime(time.time()))
Time = Label(Tops, font=('arial', 16,), text=localtime, fg="steel blue", anchor=W)
Time.grid(row=1, column=0)

ReceiptCal_F = Frame(root, bg="Powder Blue", bd=3, relief=RIDGE)
ReceiptCal_F.pack(side=RIGHT)

Buttons_F = Frame(ReceiptCal_F, bg="Powder blue", bd=1, relief=RIDGE)
Buttons_F.pack(side=BOTTOM)

Cal_F = Frame(ReceiptCal_F, bg="Powder blue", bd=2, relief=RIDGE)
Cal_F.pack(side=TOP)

Receipt_F = Frame(ReceiptCal_F, bg="Powder blue", bd=3, relief=RIDGE)
Receipt_F.pack(side=BOTTOM)

MenuFrame = Frame(root, bg="Cadet Blue", bd=2, relief=RIDGE)
MenuFrame.pack(side=LEFT)
Cost_F = Frame(MenuFrame, bg="Cadet Blue", bd=1)
Cost_F.pack(side=BOTTOM)
# Beverage_F = Frame(MenuFrame, bg="Cadet Blue", bd=2)
# Beverage_F.pack(side=TOP)

Beverage_F = Frame(MenuFrame, bg="Powder blue", bd=2, relief=RIDGE)
Beverage_F.pack(side=LEFT)
Dessert_F = Frame(MenuFrame, bg="Powder blue", bd=2, relief=RIDGE)
Dessert_F.pack(side=RIGHT)

# =====================================Time======================================================
localtime = time.asctime(time.localtime(time.time()))
Time = Label(Tops, font=('arial', 16,), text=localtime, fg="steel blue", anchor=W)
Time.grid(row=1, column=0)


DateofOrder = StringVar()
DateofOrder.set(time.strftime("%d/%m/%Y"))
# =====================================Functions======================================================
def iExit():
    iExit = tkinter.messagebox.askyesno("Exit", "confirm if you want to exit")
    if iExit > 0:
        root.destroy()
        return


def Reset():
    PaidTax.set("")
    Subtotal.set("")
    TotalCost.set("")
    CostofDessert.set("")
    CostofBeverage.set("")
    ServiceCharge.set("")
    txtReceipt.delete("1.0", END)
    V_Latta.set("0")
    V_Iced_cappuccino.set("0")
    V_Espresso.set("0")
    V_Iced_Latta.set("0")
    V_Vale_coffee.set("0")
    V_Cappuccino.set("0")
    V_Orange_Juice.set("0")
    V_Lemonade.set("0")
    V_Sprite.set("0")
    V_Banana_pudding.set("0")
    V_Funnel_cake.set("0")
    V_Cherry_pie.set("0")
    V_Coconut_pie.set("0")
    V_Cookies.set("0")
    V_Blueberry_pie.set("0")
    V_Apple_crisp.set("0")
    V_Shortcake.set("0")
    V_Rasberry_Pie.set("0")

def btnClick(numbers):
    global operator
    operator = operator + str(numbers)
    text_Input.set(operator)


def btnClear():
    global operator
    operator = ""
    text_Input.set("")


def btnEquals():
    global operator
    sumup = str(eval(operator))
    text_Input.set(sumup)
    operator = ""


def CostofItem():
    Item1 = float(V_Latta.get())
    Item2 = float(V_Iced_cappuccino.get())
    Item3 = float(V_Espresso.get())
    Item4 = float(V_Iced_Latta.get())
    Item5 = float(V_Vale_coffee.get())
    Item6 = float(V_Cappuccino.get())
    Item7 = float(V_Orange_Juice.get())
    Item8 = float(V_Lemonade.get())
    Item9 = float(V_Sprite.get())

    Item10 = float(V_Banana_pudding.get())
    Item11 = float(V_Funnel_cake.get())
    Item12 = float(V_Cherry_pie.get())
    Item13 = float(V_Coconut_pie.get())
    Item14 = float(V_Cookies.get())
    Item15 = float(V_Blueberry_pie.get())
    Item16 = float(V_Apple_crisp.get())
    Item17 = float(V_Shortcake.get())
    Item18 = float(V_Rasberry_Pie.get())

    PriceofBeverage = (Item1 * 1.2) + (Item2 * 1.99) + (Item3 * 2.05) + (Item4 * 1.89) + (Item5 * 1.99) \
                      + (Item6 * 2.99) + (Item7 * 2.39) + (Item8 * 1.29)
    PriceofDesssert = (Item10 * 1.35) + (Item11 * 2.2) + (Item12 * 1.99) + (Item13 * 1.49) + (Item14 * 1.8) \
                      + (Item15 * 1.67) + (Item16 * 1.6) + (Item17 * 1.99)

    BeveragePrice = ("$ ",(PriceofBeverage))
    DessertPrice = ("$ ", (PriceofDesssert))

    CostofBeverage.set(BeveragePrice)
    CostofDessert.set(DessertPrice)
    SC = ("$ ", (1.59))
    ServiceCharge.set(SC)

    SubtotalOfItems = ("$ ", (PriceofBeverage + PriceofDesssert + 1.59))
    Subtotal.set(SubtotalOfItems)

    TaxPercent = (PriceofBeverage + PriceofDesssert + 1.59) * .06
    Tax = ("$ ", (TaxPercent))
    PaidTax.set(Tax)

    TotalPrice = ("$ ",  (PriceofBeverage + PriceofDesssert + 1.59 + TaxPercent))
    TotalCost.set(TotalPrice)



def chkLatta():
    if var1.get() == 1:
        txtLatta.configure(state=NORMAL)
        txtLatta.focus()
        txtLatta.delete('0', END)
        V_Latta.set("")
    elif var1() == 0:
        txtLatta.configure(state=DISABLED)
        V_Latta.set("0")


def chkEspresso():
    if var2.get() == 1:
        txtEspresso.configure(state=NORMAL)
        txtEspresso.focus()
        txtEspresso.delete('0', END)
        V_Espresso.set("")
    elif var2() == 0:
        txtEspresso.configure(state=DISABLED)
        V_Espresso.set("0")


def chkIced_Latta():
    if var3.get() == 1:
        txtIced_Latta.configure(state=NORMAL)
        txtIced_Latta.focus()
        txtIced_Latta.delete('0', END)
        V_Iced_Latta.set("")
    elif var3() == 0:
        txtIced_Latta.configure(state=DISABLED)
        V_Iced_Latta.set("0")


def chkVale_coffee():
    if var4.get() == 1:
        txtVale_coffee.configure(state=NORMAL)
        txtVale_coffee.focus()
        txtVale_coffee.delete('0', END)
        V_Vale_coffee.set("")
    elif var4() == 0:
        txtVale_coffee.configure(state=DISABLED)
        V_Vale_coffee.set("0")


def chkCappuccino():
    if var5.get() == 1:
        txtCappuccino.configure(state=NORMAL)
        txtCappuccino.focus()
        txtCappuccino.delete('0', END)
        V_Cappuccino.set("")
    elif var5() == 0:
        txtCappuccino.configure(state=DISABLED)
        V_Cappuccino.set("0")


def chkIced_cappuccino():
    if var6.get() == 1:
        txtIced_cappuccino.configure(state=NORMAL)
        txtIced_cappuccino.focus()
        txtIced_cappuccino.delete('0', END)
        V_Iced_cappuccino.set("")
    elif var6() == 0:
        txtIced_cappuccino.configure(state=DISABLED)
        V_Iced_cappuccino.set("0")


def chkOrange_Juice():
    if var7.get() == 1:
        txtOrange_Juice.configure(state=NORMAL)
        txtOrange_Juice.focus()
        txtOrange_Juice.delete('0', END)
        V_Orange_Juice.set("")
    elif var7() == 0:
        txtOrange_Juice.configure(state=DISABLED)
        V_Orange_Juice.set("0")


def chkLemonade():
    if var8.get() == 1:
        txtLemonade.configure(state=NORMAL)
        txtLemonade.focus()
        txtLemonade.delete('0', END)
        V_Lemonade.set("")
    elif var8() == 0:
        txtLemonade.configure(state=DISABLED)
        V_Lemonade.set("0")


def chkSprite():
    if varSprite.get() == 1:
        txtSprite.configure(state=NORMAL)
        txtSprite.focus()
        txtSprite.delete('0', END)
        V_Sprite.set("")
    elif varSprite() == 0:
        txtSprite.configure(state=DISABLED)
        V_Sprite.set("0")


def chkBanana_pudding():
    if var9.get() == 1:
        txtBanana_pudding.configure(state=NORMAL)
        txtBanana_pudding.focus()
        txtBanana_pudding.delete('0', END)
        V_Banana_pudding.set("")
    elif var9() == 0:
        txtBanana_pudding.configure(state=DISABLED)
        V_Banana_pudding.set("0")


def chkFunnel_cake():
    if var10.get() == 1:
        txtFunnel_cake.configure(state=NORMAL)
        txtFunnel_cake.focus()
        txtFunnel_cake.delete('0', END)
        V_Funnel_cake.set("")
    elif var10() == 0:
        txtFunnel_cake.configure(state=DISABLED)
        V_Funnel_cake.set("0")


def chkCherry_pie():
    if var11.get() == 1:
        txtCherry_pie.configure(state=NORMAL)
        txtCherry_pie.focus()
        txtCherry_pie.delete('0', END)
        V_Cherry_pie.set("")
    elif var11() == 0:
        txtCherry_pie.configure(state=DISABLED)
        V_Cherry_pie.set("0")


def chkCoconut_pie():
    if var12.get() == 1:
        txtCoconut_pie.configure(state=NORMAL)
        txtCoconut_pie.focus()
        txtCoconut_pie.delete('0', END)
        V_Coconut_pie.set("")
    elif var12() == 0:
        txtCoconut_pie.configure(state=DISABLED)
        V_Coconut_pie.set("0")


def chkCookies():
    if var13.get() == 1:
        txtCookies.configure(state=NORMAL)
        txtCookies.focus()
        txtCookies.delete('0', END)
        V_Cookies.set("")
    elif var13() == 0:
        txtCookies.configure(state=DISABLED)
        V_Cookies.set("0")


def chkBlueberry_pie():
    if var14.get() == 1:
        txtBlueberry_pie.configure(state=NORMAL)
        txtBlueberry_pie.focus()
        txtBlueberry_pie.delete('0', END)
        V_Blueberry_pie.set("")
    elif var14() == 0:
        txtBlueberry_pie.configure(state=DISABLED)
        V_Blueberry_pie.set("0")


def chkApple_crisp():
    if var15.get() == 1:
        txtApple_crisp.configure(state=NORMAL)
        txtApple_crisp.focus()
        txtApple_crisp.delete('0', END)
        V_Apple_crisp.set("")
    elif var15() == 0:
        txtApple_crisp.configure(state=DISABLED)
        V_Apple_crisp.set("0")


def chkShortcake():
    if var16.get() == 1:
        txtShortcake.configure(state=NORMAL)
        txtShortcake.focus()
        txtShortcake.delete('0', END)
        V_Shortcake.set("")
    elif var16() == 0:
        txtShortcake.configure(state=DISABLED)
        V_Shortcake.set("0")


def chkRasberry_Pie():
    if var17.get() == 1:
        txtRasberry_Pie.configure(state=NORMAL)
        txtRasberry_Pie.focus()
        txtRasberry_Pie.delete('0', END)
        V_Rasberry_Pie.set("")
    elif var17() == 0:
        txtRasberry_Pie.configure(state=DISABLED)
        V_Rasberry_Pie.set("0")

def Receipt():
    txtReceipt.delete("1.0", END)
    x = random.randint(10903, 609235)
    randomRef = str(x)
    Receipt_Ref.set("Bill: " + randomRef)

    txtReceipt.insert(END, 'Receipt Ref: \t\t\t' + Receipt_Ref.get() + '\t' +DateofOrder.get() + "\n")
    txtReceipt.insert(END, 'Item: \t\t\t'+ "Cost of Item\n")
    txtReceipt.insert(END, 'latta:: \t\t\t' + V_Latta.get()+"\n")
    txtReceipt.insert(END, 'Espresso: \t\t\t' + V_Espresso.get() + "\n")
    txtReceipt.insert(END, 'Iced Latta: \t\t\t' + V_Iced_Latta.get() + "\n")
    txtReceipt.insert(END, 'Vale Coffee: \t\t\t' + V_Vale_coffee.get() + "\n")
    txtReceipt.insert(END, 'Cappuccino: \t\t\t' + V_Cappuccino.get() + "\n")
    txtReceipt.insert(END, 'Iced Cappuccino: \t\t\t' + V_Iced_cappuccino.get() + "\n")
    txtReceipt.insert(END, 'Orange Juice: \t\t\t' + V_Orange_Juice.get() + "\n")
    txtReceipt.insert(END, 'Lemonade: \t\t\t' + V_Lemonade.get() + "\n")
    txtReceipt.insert(END, 'Sprite: \t\t\t' + V_Sprite.get() + "\n")
    txtReceipt.insert(END, 'Banana Pudding: \t\t\t' + V_Banana_pudding.get() + "\n")
    txtReceipt.insert(END, 'Funnel Cake:: \t\t\t' + V_Funnel_cake.get() + "\n")
    txtReceipt.insert(END, 'Cherry Pie: \t\t\t' + V_Cherry_pie.get() + "\n")
    txtReceipt.insert(END, 'Coconut Pie: \t\t\t' + V_Coconut_pie.get() + "\n")
    txtReceipt.insert(END, 'Cookies: \t\t\t' + V_Cookies.get() + "\n")
    txtReceipt.insert(END, 'Blueberry pie: \t\t\t' + V_Blueberry_pie.get() + "\n")
    txtReceipt.insert(END, 'Apple_crisp: \t\t\t' + V_Apple_crisp.get() + "\n")
    txtReceipt.insert(END, 'Shortcake: \t\t\t' + V_Shortcake.get() + "\n")
    txtReceipt.insert(END, 'RasberryPie: \t\t\t' + V_Rasberry_Pie.get() + "\n")
    txtReceipt.insert(END, 'Cost of Beverage: \t\t\t' + CostofBeverage.get() + "\nTax Paid: \t\t\t\t" +PaidTax.get()+"\n")
    txtReceipt.insert(END, 'Cost of Dessert: \t\t\t' + CostofDessert.get() + "\nSubtotal: \t\t\t\t" +(Subtotal.get())+"\n")
    txtReceipt.insert(END, 'Service Charge: \t\t\t' + ServiceCharge.get() + "\nTotal: \t\t\t\t" +(TotalCost.get()))

# =======================================Variables=================================================
var1 = IntVar()
var2 = IntVar()
var3 = IntVar()
var4 = IntVar()
var5 = IntVar()
var6 = IntVar()
var7 = IntVar()
var8 = IntVar()
varSprite = IntVar()
var9 = IntVar()
var10 = IntVar()
var11 = IntVar()
var12 = IntVar()
var13 = IntVar()
var14 = IntVar()
var15 = IntVar()
var16 = IntVar()
var17 = IntVar()

Receipt_Ref = StringVar()
PaidTax = StringVar()
Subtotal = StringVar()
TotalCost = StringVar()
CostofDessert = StringVar()
CostofBeverage = StringVar()
ServiceCharge = StringVar()

text_Input = StringVar()
operator = ""

V_Latta = StringVar()
V_Iced_cappuccino = StringVar()
V_Espresso = StringVar()
V_Iced_Latta = StringVar()
V_Vale_coffee = StringVar()
V_Cappuccino = StringVar()
V_Orange_Juice = StringVar()
V_Lemonade = StringVar()
V_Sprite = StringVar()

V_Banana_pudding = StringVar()
V_Funnel_cake = StringVar()
V_Cherry_pie = StringVar()
V_Coconut_pie = StringVar()
V_Cookies = StringVar()
V_Blueberry_pie = StringVar()
V_Apple_crisp = StringVar()
V_Shortcake = StringVar()
V_Rasberry_Pie = StringVar()

V_Latta.set("0")
V_Iced_cappuccino.set("0")
V_Espresso.set("0")
V_Iced_Latta.set("0")
V_Vale_coffee.set("0")
V_Cappuccino.set("0")
V_Orange_Juice.set("0")
V_Lemonade.set("0")
V_Sprite.set("0")

V_Banana_pudding.set("0")
V_Funnel_cake.set("0")
V_Cherry_pie.set("0")
V_Coconut_pie.set("0")
V_Cookies.set("0")
V_Blueberry_pie.set("0")
V_Apple_crisp.set("0")
V_Shortcake.set("0")
V_Rasberry_Pie.set("0")

# =======================================Beverage=================================================
Latta = Checkbutton(Beverage_F, text="Latta", variable=var1, onvalue=1, offvalue=0, font=('arial', 18, 'bold'),
                    bg="Powder blue", command=chkLatta).grid(row=0, sticky=W)

Espresso = Checkbutton(Beverage_F, text="Espresso", variable=var2, onvalue=1, offvalue=0,
                       font=('arial', 18, 'bold'), bg="Powder blue", command=chkEspresso).grid(row=1, sticky=W)

Iced_Latta = Checkbutton(Beverage_F, text="Iced Latta", variable=var3, onvalue=1, offvalue=0,
                         font=('arial', 18, 'bold'), bg="Powder blue", command=chkIced_Latta).grid(row=2, sticky=W)

Vale_coffee = Checkbutton(Beverage_F, text="Vale coffee", variable=var4, onvalue=1, offvalue=0,
                          font=('arial', 18, 'bold'), bg="Powder blue", command=chkVale_coffee).grid(row=3, sticky=W)

Cappuccino = Checkbutton(Beverage_F, text="Cappuccino", variable=var5, onvalue=1, offvalue=0,
                         font=('arial', 18, 'bold'), bg="Powder blue", command=chkCappuccino).grid(row=4, sticky=W)

Iced_cappuccino = Checkbutton(Beverage_F, text="Iced cappuccino", variable=var6, onvalue=1, offvalue=0,
                              font=('arial', 18, 'bold'), bg="Powder blue", command=chkIced_cappuccino).grid(row=5,
                                                                                                             sticky=W)

Orange_Juice = Checkbutton(Beverage_F, text="Orange Juice", variable=var7, onvalue=1, offvalue=0,
                           font=('arial', 18, 'bold'), bg="Powder blue", command=chkOrange_Juice).grid(row=6, sticky=W)

Lemonade = Checkbutton(Beverage_F, text="Lemonade", variable=var8, onvalue=1, offvalue=0,
                       font=('arial', 18, 'bold'), bg="Powder blue", command=chkLemonade).grid(row=7, sticky=W)

Sprite = Checkbutton(Beverage_F, text="Sprite", variable=varSprite, onvalue=1, offvalue=0,
                     font=('arial', 18, 'bold'), bg="Powder blue", command=chkSprite).grid(row=8, sticky=W)

# ==============================Check Box for Beverage=============================================================
txtLatta = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left', state=DISABLED,
                 textvariable=V_Latta)
txtLatta.grid(row=0, column=1)

txtEspresso = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                    state=DISABLED, textvariable=V_Espresso)
txtEspresso.grid(row=1, column=1)

txtIced_Latta = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                      state=DISABLED, textvariable=V_Iced_Latta)
txtIced_Latta.grid(row=2, column=1)

txtVale_coffee = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                       state=DISABLED, textvariable=V_Vale_coffee)
txtVale_coffee.grid(row=3, column=1)

txtCappuccino = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                      state=DISABLED, textvariable=V_Cappuccino)
txtCappuccino.grid(row=4, column=1)

txtIced_cappuccino = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                           state=DISABLED, textvariable=V_Iced_cappuccino)
txtIced_cappuccino.grid(row=5, column=1)

txtOrange_Juice = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                        state=DISABLED, textvariable=V_Orange_Juice)
txtOrange_Juice.grid(row=6, column=1)

txtLemonade = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                    state=DISABLED, textvariable=V_Lemonade)
txtLemonade.grid(row=7, column=1)

txtSprite = Entry(Beverage_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                  state=DISABLED, textvariable=V_Sprite)
txtSprite.grid(row=8, column=1)

# ==============================Desserts=============================================================
Banana_pudding = Checkbutton(Dessert_F, text="Banana Pudding\t\t\t", variable=var9, onvalue=1, offvalue=0,
                             font=('arial', 16, 'bold'), bg="Powder blue", command=chkBanana_pudding).grid(row=0,
                                                                                                           sticky=W)

Funnel_cake = Checkbutton(Dessert_F, text="Funnel Cake", variable=var10, onvalue=1, offvalue=0,
                          font=('arial', 16, 'bold'), bg="Powder blue", command=chkFunnel_cake).grid(row=1, sticky=W)

Cherry_pie = Checkbutton(Dessert_F, text="Cherry Pie", variable=var11, onvalue=1, offvalue=0,
                         font=('arial', 16, 'bold'), bg="Powder blue", command=chkCherry_pie).grid(row=2, sticky=W)

Coconut_pie = Checkbutton(Dessert_F, text="Coconut Pie", variable=var12, onvalue=1, offvalue=0,
                          font=('arial', 16, 'bold'), bg="Powder blue", command=chkCoconut_pie).grid(row=3, sticky=W)

Cookies = Checkbutton(Dessert_F, text="Lagos Chocolate Cake", variable=var13, onvalue=1, offvalue=0,
                      font=('arial', 16, 'bold'), bg="Powder blue", command=chkCookies).grid(row=4, sticky=W)

Blueberry_pie = Checkbutton(Dessert_F, text="Blueberry Pie", variable=var14, onvalue=1, offvalue=0,
                            font=('arial', 16, 'bold'), bg="Powder blue", command=chkBlueberry_pie).grid(row=5,
                                                                                                         sticky=W)

Apple_crisp = Checkbutton(Dessert_F, text="Apple Crisp", variable=var15, onvalue=1, offvalue=0,
                          font=('arial', 16, 'bold'), bg="Powder blue", command=chkApple_crisp).grid(row=6, sticky=W)

Shortcake = Checkbutton(Dessert_F, text="Short Cake", variable=var16, onvalue=1, offvalue=0,
                        font=('arial', 16, 'bold'), bg="Powder blue", command=chkShortcake).grid(row=7, sticky=W)

Rasberry_Pie = Checkbutton(Dessert_F, text="Rasberry Pie", variable=var17, onvalue=1, offvalue=0,
                           font=('arial', 16, 'bold'), bg="Powder blue", command=chkRasberry_Pie).grid(row=8, sticky=W)

# ==============================Check Box for Desserts=============================================================
txtBanana_pudding = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                          state=DISABLED, textvariable=V_Banana_pudding)
txtBanana_pudding.grid(row=0, column=1)

txtFunnel_cake = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                       state=DISABLED, textvariable=V_Funnel_cake)
txtFunnel_cake.grid(row=1, column=1)

txtCherry_pie = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                      state=DISABLED, textvariable=V_Cherry_pie)
txtCherry_pie.grid(row=2, column=1)

txtCoconut_pie = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                       state=DISABLED, textvariable=V_Coconut_pie)
txtCoconut_pie.grid(row=3, column=1)

txtCookies = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                   state=DISABLED, textvariable=V_Cookies)
txtCookies.grid(row=4, column=1)

txtBlueberry_pie = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                         state=DISABLED, textvariable=V_Blueberry_pie)
txtBlueberry_pie.grid(row=5, column=1)

txtApple_crisp = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                       state=DISABLED, textvariable=V_Apple_crisp)
txtApple_crisp.grid(row=6, column=1)

txtShortcake = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                     state=DISABLED, textvariable=V_Shortcake)
txtShortcake.grid(row=7, column=1)

txtRasberry_Pie = Entry(Dessert_F, font=('arial', 16, 'bold'), bd=1, width=6, justify='left',
                        state=DISABLED, textvariable=V_Rasberry_Pie)
txtRasberry_Pie.grid(row=8, column=1)

# ============================================Total Cost===============================================
lblCostofBeverage = Label(Cost_F, font=('arial', 14, 'bold'), text="Cost of Beverage\t", bg='powder Blue', fg='black', )
lblCostofBeverage.grid(row=0, column=0, sticky=W)
txtCostofBeverage = Entry(Cost_F, font=('arial', 14, 'bold'), textvariable=CostofBeverage, bd=1, bg="white",
                          insertwidth=2, justify=RIGHT)
txtCostofBeverage.grid(row=0, column=1)

lblCostofDesserts = Label(Cost_F, font=('arial', 14, 'bold'), text="Cost of cakes\t", bg='powder Blue', fg='black', )
lblCostofDesserts.grid(row=1, column=0, sticky=W)
txtCostofDessert = Entry(Cost_F, font=('arial', 14, 'bold'), textvariable=CostofDessert, bd=1, bg="white",
                         insertwidth=2, justify=RIGHT)
txtCostofDessert.grid(row=1, column=1)

lblServiceCharge = Label(Cost_F, font=('arial', 14, 'bold'), text="Service Charge\t", bg='powder Blue', fg='black', )
lblServiceCharge.grid(row=2, column=0, sticky=W)
txtServiceCharge = Entry(Cost_F, font=('arial', 14, 'bold'), textvariable=ServiceCharge, bd=1, bg="white",
                         justify=RIGHT)
txtServiceCharge.grid(row=2, column=1)

# # ==============================Payment Information=============================================================
lblPaidTax = Label(Cost_F, font=('arial', 14, 'bold'), text="\tPaid Tax", bg='powder Blue', fg='black', )
lblPaidTax.grid(row=0, column=2, sticky=W)
txtPaidTax = Entry(Cost_F, font=('arial', 14, 'bold'), textvariable=PaidTax, bd=1, bg="white",
                   insertwidth=2, justify=RIGHT)
txtPaidTax.grid(row=0, column=3)
#
lblSubtotal = Label(Cost_F, font=('arial', 14, 'bold'), text="\tSubtotal", bg='powder Blue', fg='black', )
lblSubtotal.grid(row=1, column=2, sticky=W)
txtSubtotal = Entry(Cost_F, font=('arial', 14, 'bold'), textvariable=Subtotal, bd=1, bg="white",
                    insertwidth=2, justify=RIGHT)
txtSubtotal.grid(row=1, column=3)

lblTotalCost = Label(Cost_F, font=('arial', 14, 'bold'), text="\tTotal", bg='powder Blue', fg='black', )
lblTotalCost.grid(row=2, column=2, sticky=W)
txtTotalCost = Entry(Cost_F, font=('arial', 14, 'bold'), textvariable=TotalCost, bd=1, bg="white",
                     insertwidth=2, justify=RIGHT)
txtTotalCost.grid(row=2, column=3)

# ==============================Receipt=============================================================
txtReceipt = Text(Receipt_F, width=46, height=12, bg="White", bd=1, font=('arial', 12, 'bold'))
txtReceipt.grid(row=0, column=0)

# ==============================Buttons=============================================================
btnTotal = Button(Buttons_F, padx=16, pady=1, bd=1, fg="black", font=('arial', 16, 'bold'), width=4, text="Total",
                  bg="powder blue", comman=CostofItem).grid(row=0, column=0)

btnReceipt = Button(Buttons_F, padx=16, pady=1, bd=1, fg="black", font=('arial', 16, 'bold'), width=6,
                    text="Receipt",
                    bg="powder blue", command=Receipt).grid(row=0, column=1)

btReset = Button(Buttons_F, padx=16, pady=1, bd=1, fg="black", font=('arial', 16, 'bold'), width=4, text="Reset",
                 bg="powder blue", command=Reset).grid(row=0, column=2)

btExit = Button(Buttons_F, padx=16, pady=1, bd=1, fg="black", font=('arial', 16, 'bold'), width=4, text="Exit",
                bg="powder blue", command=iExit).grid(row=0, column=3)


# ==============================Calculator Function=============================================================
def iExit():
    iExit = tkinter.messagebox.askyesno("Exit", "confirm if you want to exit")
    if iExit > 0:
        root.destroy()
        return

txtDisplay = Entry(Cal_F, width=45, bg="White", bd=2, font=('arial', 12, 'bold'), textvariable=text_Input,
                   justify=RIGHT)
txtDisplay.grid(row=0, column=0, columnspan=4, pady=1)
txtDisplay.insert(0, "0")

# ==============================Calculator Buttons=============================================================
btn7 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="7",
              bg="powder blue", command=lambda: btnClick(7)).grid(row=2, column=0)

btn8 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="8",
              bg="powder blue", command=lambda: btnClick(8)).grid(row=2, column=1)

btn9 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="9",
              bg="powder blue", command=lambda: btnClick(9)).grid(row=2, column=2)

btnAdd = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="+",
                bg="powder blue", command=lambda: btnClick("+")).grid(row=2, column=3)
# ---------------------------------------------------------------------------------------------
btn4 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="4",
              bg="powder blue", command=lambda: btnClick(4)).grid(row=3, column=0)

btn5 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="5",
              bg="powder blue", command=lambda: btnClick(5)).grid(row=3, column=1)

btn6 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="6",
              bg="powder blue", command=lambda: btnClick(6)).grid(row=3, column=2)

btnSub = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="-",
                bg="powder blue", command=lambda: btnClick("-")).grid(row=3, column=3)
# -----------------------------------------------------------------------------------------------
btn1 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="1",
              bg="powder blue", command=lambda: btnClick(1)).grid(row=4, column=0)

btn2 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="2",
              bg="powder blue", command=lambda: btnClick(2)).grid(row=4, column=1)

btn3 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="3",
              bg="powder blue", command=lambda: btnClick(3)).grid(row=4, column=2)

btMult = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="*",
                bg="powder blue", command=lambda: btnClick("*")).grid(row=4, column=3)
# ------------------------------------------------------------------------------------------------
btn0 = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="0",
              bg="powder blue", command=lambda: btnClick(0)).grid(row=5, column=0)

btnClear = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="C",
                  bg="powder blue", command=btnClear).grid(row=5, column=1)

btnEquals = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="=",
                   bg="powder blue", command=btnEquals).grid(row=5, column=2)

btnDiv = Button(Cal_F, padx=16, pady=1, bd=1, fg="black", font=('ariel', 16, 'bold'), width=2, text="/",
                bg="powder blue", command=lambda: btnClick("/")).grid(row=5, column=3)

root.mainloop()
