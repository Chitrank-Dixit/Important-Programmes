# This is my own first Program in Python Programming
import simplegui

def tick():
    print "tick"
    
t= simplegui.create_timer(1000,tick)

t.start()

