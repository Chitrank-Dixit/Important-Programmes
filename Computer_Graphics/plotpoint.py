# plot a point 
# import mathplotlib.pyplot as plt
from Tkinter import Tk, Canvas, PhotoImage, Label





if __name__ == '__main__':
	root = Tk()
	w = Label(root, text="Draw a Point on Canvas in Python")
	canvas= Canvas(root, width=250, height=250, bg='#E2E2E2')
	canvas.place(x=20,y=26,height=250,width=250)
	#img= PhotoImage(width=200, height=200)
	# img.putpixel(1,2)
	w.pack()
	canvas.pack()
	root.mainloop()