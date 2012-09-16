# http://www.reddit.com/r/dailyprogrammer/comments/za9op/9032012_challenge_95_easy_reversing_text_in_file/
filename = raw_input("Gimme a file to reverse! (with the .txt, please)\n:>")

filetorev = open(filename, 'r')
filetowrite = open("reversed"+filename, 'w')

for line in reversed(filetorev.readlines()):
	for part in reversed(line.split(' ')):
		filetowrite.write(part + ' ')


filetowrite.close()
filetorev.close()