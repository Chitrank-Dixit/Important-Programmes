# making a picture to display on the screeen
# we will use the canvas to put an image on it
from Tkinter import *

def Get():
    global pic
    global tem
    
    inp=ent.get()
    if inp=='clear':
        can.delete(tem)
    else:
        pic=PhotoImage(file=inp)
        tem=can.create_image(550,500,image=pic)


root=Tk()
root.geometry('1300x600+270+50')

lab=Label(root,text='Name of the Picture',font=('Helvatica',20))
ent=Entry(root,bg='white',font=('Helvatica',20),width=30)
button=Button(root,text='Enter', width=10, height=2, command=Get)

# canvas widget shows the image on it.

can= Canvas(root, width='1300', height='400' , bg='white')
# image is what we put into the canvas

#pic= PhotoImage(file='3.gif')
#temp=can.create_image(250,200,image=pic)

ent.focus()
lab.pack(pady=10)
ent.pack(pady=10)
button.pack(anchor=E)
can.pack()

'''
Converting png to gif image using python

im = Image.open('icon.png')
assert im.mode == 'P'
transparency = im.info['transparency'] 
im .save('icon.gif', transparency=transparency)

'''
