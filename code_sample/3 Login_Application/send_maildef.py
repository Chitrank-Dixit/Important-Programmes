#  http://segfault.in/2010/12/sending-gmail-from-python/
import smtplib
 



def send_mail(username,passwd,rec_email):

        SMTP_SERVER = 'smtp.gmail.com'
        SMTP_PORT = 587
 
        sender = 'chitrankdixit@gmail.com'
        password= '*************'
	
	subject = 'Air Route Finder Application Specific Password'
	body = '''Welcome to Air Route Finder, Enter the Application and Find your shortest tour [enter]

                [tab]Username :'''+username+'''[enter]
                [tab]Password :'''+passwd+'''[enter]

                Regards[enter]
                Air Route Finder Dev[enter]

        '''
	
	"Sends an e-mail to the specified recipient."
	body = "" + body + ""
	headers = ["From: " + sender,"Subject: " + subject,"To: " + rec_email,"MIME-Version: 1.0","Content-Type: text/html"]
	headers = "\r\n".join(headers)
	session = smtplib.SMTP(SMTP_SERVER, SMTP_PORT)
	session.ehlo()
	session.starttls()
	session.ehlo
	session.login(sender, password)
	session.sendmail(sender, rec_email, headers + "\r\n\r\n" + body)
	session.quit()
	return "Please check your mail for Username and Password"
