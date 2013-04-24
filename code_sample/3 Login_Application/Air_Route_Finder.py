# Login for the Air Route Finder
from Tkinter import *
import Flight_Details
import forgot_pass
import sqlite3
import Register
class App:
    # function __init__ would start at the start of the program
    def __init__(self,master):
        frame=Frame(master)
        frame.pack()

        
        
        self.labelFirst= Label(frame,text="Welcome to Air Route Finder",font=('Times New Roman',30)).grid(row=0,columnspan=2)
        #self.labelFirst.pack()

        self.labelprime = Label(frame , text="Login Application",font=('Times New Roman',20)).grid(row=1,columnspan=2)
        #self.labelprime.pack()    # by default pack packs to the Center of the Main Frame

        self.label1 = Label(frame , text="Username: ")
        self.label1.grid(row=2,column=0)
        #self.label1.pack(anchor=W)
        
        self.ent1=Entry(frame,bg='white')
        self.ent1.grid(row=2,column=1)
        #self.ent1.pack(anchor=E)
        
        self.label2 = Label(frame , text="Password: ")
        self.label2.grid(row=3,column=0)
        #self.label2.pack(anchor=W)

        self.ent2=Entry(frame,bg='white',show='*')
        self.ent2.grid(row=3,column=1)
        #self.ent2.pack(anchor=E)

        #self.label3 = Label(frame , text="Email: ")
        #self.label3.grid(row=4,column=0)
        #self.label2.pack(anchor=W)

        #self.ent3=Entry(frame,bg='white',show='*')
        #self.ent3.grid(row=4,column=1)
        #self.ent2.pack(anchor=E)


        
        self.hi_there= Button(frame, text="Login" , command=self.login)
        self.hi_there.grid(row=5,column=0)
        #self.hi_there.pack(side=LEFT)

        self.fr= Button(frame, text="Forgot the Password" , command=self.forgot_pass)
        self.fr.grid(row=5,column=1)
        #self.fr.pack(side=RIGHT)
        
        self.reg= Button(frame, text="Register for New Account" , command=self.open_register)
        self.reg.grid(row=6,columnspan=2)
        #self.fr.pack(side=RIGHT)

        

    def forgot_pass(self):
        fp=forgot_pass.main()
        

    def connect_us(self):
        conn=sqlite3.connect("AirRoute.db")
        cursor=conn.cursor()
        return cursor,conn

    def open_register(self):
        RG=Register.main()
        

    def insert_indb(self):
        n1=self.ent1.get()
        n2=self.ent2.get()
        cursor,conn=self.connect_us()
        #c=self.create_table(cursor)
        cursor.execute("INSERT INTO airroute values(?,?)",(n1,n2))
        conn.commit()
        self.ent1.delete(0,END)
        self.ent2.delete(0,END)
        print "Account Created Check you Email"


    def login(self):
        n1=self.ent1.get()
        n2=self.ent2.get()
        cursor,conn=self.connect_us()
        #c=self.create_table(cursor)
        
        obj=cursor.execute("select * from airroute where uname=? and pass=?",(n1,n2))
        a=''
        for passwd in cursor:
            a=passwd
        conn.close()
        self.ent1.delete(0,END)
        self.ent2.delete(0,END)
        
        
            
        if a[1]==n2:
            '''
            cursor.execute("select uname from airroute where pass='n2'")
            for ent in cursor:
                username=ent
                            
            FD=self.Flight_Details.Flight()
            FD.set_user(username)
            '''
            
            
            FD=Flight_Details.main(a[0])
            #FD=Flight_Details.Flight(child)
            print "Logged in"

        elif a[1]!=n2:
            print "Invalid Username or Password"

            

def main():
    root=Tk()
    root.title("Air Route Finder: Login")
    root.geometry('600x300+270+100')
    menubar = Menu(root)
    menubar.add_command(label="Quit!", command=root.quit)
    root.config(menu=menubar)
    app=App(root)
    
    
    root.mainloop()
    
        

if __name__=="__main__":
    main()
    
