def change_faces(hand):
	print hand
	for card in hand:
		card = "11"+card[1] if "J" in card[0] else card
		card = "12"+card[1] if "Q" in card[0] else card
		card = "13"+card[1] if "K" in card[0] else card
		card = "1"+card[1] if "A" in card[0] else card

def get_face_values(hand):
	values = []
	
	for card in hand:
		values.append(card[0])

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
	


#This is where we start!
endit = False

while endit == False:

	hand = raw_input("What is your hand?\n:>").split()
 
	print  get_suits(hand)
	print  get_face_values(hand)
	hand = change_faces(hand)
	




	wanttoquit = raw_input("Do you want to quit? 'Quit' or 'No'\n:>").lower()

	if("quit" in wanttoquit):
		endit = True

print "Goodbye"