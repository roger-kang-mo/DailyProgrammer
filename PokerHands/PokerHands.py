def get_face_values(hand):
	values = []
	valuetoappend = 0

	for card in hand:
		if 'J' in card[0]:
			valuetoappend = 11
		elif 'Q' in card[0]:
			valuetoappend = 12
		elif 'K' in card[0]:
			valuetoappend = 13
		elif 'A' in card[0]:
			valuetoappend = 1
		else:
			valuetoappend = int(card[0])

		values.append(valuetoappend)

	return values

def get_suits(hand):
	suits = []

	for card in hand:
		suits.append(card[1])

	return suits

def is_flush(suits):
	isflush = True
	starter = suits[0]

	for suit in suits:
		if suit != starter:
			isflush = False
			break

	return isflush

def is_straight(values):
	values.sort()
	retval = True

	for i in range(1, len(values)):
		if values[i] != values[i-1]+1:
			retval = False
			break
	
	return retval 


#This is where we start! 
endit = False

while endit == False: 

	hand = raw_input("What is your hand?\n:>").split()
 
	print get_suits(hand)
	print get_face_values(hand)
	print "Is it a straight? %s" % is_straight(get_face_values(hand))
	print "Is it a flush? %s" % is_flush(get_suits(hand))

	wanttoquit = raw_input("Do you want to quit? 'Quit' or 'No'\n:>").lower()

	if("quit" in wanttoquit):
		endit = True

print "Goodbye"