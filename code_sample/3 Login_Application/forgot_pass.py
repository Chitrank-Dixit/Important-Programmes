# Forgot the Password
import smtplib
from Tkinter import *
import tkMessageBox
import Air_Route_Finder
import Flight_Details 
import sqlite3
from send_maildef import *
class Reg:
    # function __init__ would start at the start of the program
    def __init__(self,master):
        frame=Frame(master)
        frame.pack()

        
        
        self.labelFirst= Label(frame,text="Welcome to Air Route Finder",font=('Times New Roman',30)).grid(row=0,columnspan=2)
        #self.labelFirst.pack()

        self.labelprime = Label(frame , text="Password Recovery : Enter Username and Email ",font=('Times New Roman',20)).grid(row=1,columnspan=2)
        #self.labelprime.pack()    # by default pack packs to the Center of the Main Frame

        self.label1 = Label(frame , text="Username: ")
        self.label1.grid(row=2,column=0)
        #self.label1.pack(anchor=W)
        
        self.ent1=Entry(frame,bg='white')
        self.ent1.grid(row=2,column=1)
        #self.ent1.pack(anchor=E)
        
        self.label2 = Label(frame , text="Email: ")
        self.label2.grid(row=3,column=0)
        #self.label2.pack(anchor=W)

        self.ent2=Entry(frame,bg='white')
        self.ent2.grid(row=3,column=1)
        #self.ent2.pack(anchor=E)

                       
        self.reg= Button(frame, text="Recover Password" , command=self.recover)
        self.reg.grid(row=4,column=0)
        #self.fr.pack(side=RIGHT)

        self.log= Button(frame, text="Login" , command=self.open_login)
        self.log.grid(row=4,column=1)
        

    
        

    def connect_us(self):
        conn=sqlite3.connect("AirRoute.db")
        cursor=conn.cursor()
        return cursor,conn

    
        

    def insert_indb(self):
        n1=self.ent1.get()
        n2=self.ent2.get()
        #n3=self.ent3.get()
        cursor,conn=self.connect_us()
        #c=self.create_table(cursor)
        cursor.execute("INSERT INTO airroute values(?,?,?)",(n1,n2,n3))
        conn.commit()
        self.ent1.delete(0,END)
        self.ent2.delete(0,END)
        self.ent3.delete(0,END)
        print "Account Created Check you Email"


    def recover(self):
        username=self.ent1.get()
        email=self.ent2.get()
        passwd=self.check_db()
        if passwd!=None:
            SMTP_SERVER = 'smtp.gmail.com'
            SMTP_PORT = 587
 
            sender = 'chitrankdixit1@gmail.com'
            password= 'rossi46656915'
            
            subject = 'Air Route Finder Application Specific Password'
            body = '''Password Recovery
                for [tab]Username :'''+username+'''[enter]
                this is your password
                [tab]Password :'''+passwd+'''[enter]

                Regards[enter]
                Air Route Finder Dev[enter]

            '''
            
            "Sends an e-mail to the specified recipient."
            body = "" + body + ""
            headers = ["From: " + sender,"Subject: " + subject,"To: " + email,"MIME-Version: 1.0","Content-Type: text/html"]
            headers = "\r\n".join(headers)
            session = smtplib.SMTP(SMTP_SERVER, SMTP_PORT)
            session.ehlo()
            session.starttls()
            session.ehlo
            session.login(sender, password)
            session.sendmail(sender, email, headers + "\r\n\r\n" + body)
            session.quit()
	
            tkMessageBox.showinfo("Recovered Sucessfully","Password has been sent to your registered mail")
        else:
            tkMessageBox.showinfo("Error Occured ", "Unable to send the Recovery mail Please check your Internet Connection")
            

    def check_db(self):
        n1=self.ent1.get()
        n2=self.ent2.get()
        
        cursor,conn=self.connect_us()
        obj=cursor.execute("select * from airroute where uname=? or email=?",(n1,n2))
        a=''
        for passw in cursor:
            a=passw
        
        if (n1 and n2) in a: 
            return a[1]
        else:
            tkMessageBox.showinfo("Error Occured ", "Username or Email Incorrect please Enter correct Details")
            
    
    def open_login(self):
        Ar=Air_Route_Finder.main()
    
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
    root.title("Air Route Finder: Forgot Password")
    root.geometry('600x300+270+100')
    menubar = Menu(root)
    menubar.add_command(label="Quit!", command=root.quit)
    root.config(menu=menubar)
    rg=Reg(root)
    root.mainloop()
        

if __name__=="__main__":
    main()
    
    
    
    

