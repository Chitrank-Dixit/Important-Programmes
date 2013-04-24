#import the module
import simplegui
# initialize Global Variable
counter=0
#define Helper Functions
def increment():
	global counter
	counter=counter+1
	
#define event handler functions
def tick():
	increment()
	print counter

def buttonpress():
	global counter
	counter=0
	
#create a frame	
frame=simplegui.create_frame("SimpleGUI Test",100,100)

# register an Event Handler
timer=simplegui.create_timer(1000,tick)
frame.add_button("Click me!",buttonpress)

#start frame and timers
frame.start()
timer.start()
