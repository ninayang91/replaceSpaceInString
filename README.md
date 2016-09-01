# replaceSpaceInString
//replace all spaces in a string with '%20'

String is stored in a char array, it has sufficient spaces at the end of the String

We know the true length of the String

Count the spaces first, then calculate the new length= trueLength+spaceCounter*2

Go through the true string array from the end, 
when meet the ' ', replace with 0 2 %,update the newLength,
when meet the char, put it in

There will be no overwrite, since everything is counted and calculated accurately
