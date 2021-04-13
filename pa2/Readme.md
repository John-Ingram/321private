Sorry this is a day late. I figured I should do it right instead of rushing.

# Choices:

1. Folder structure:
	- I decided to structure all of the code responsible for creating the tours in a single tours package. This makes the system portable.
	- I have no folders other than the main folder and the tours folder because I do not use an IDE.
2. Public interface
	- I was hesitant to make the Tour interface public, as I prefer to keep as much private as possible, but in this case I was not sure how to
	hide the interface and at the same time allow for generic "Tour" objects in my code. 
	Obviously I could have specified the type of tour object
	on declaration, but I feel like that would be a significant loss of functionality. 
	I would appreciate advice on this.

## Version & Compilation
This program was compiled on my machine using the following java version:
 
    openjdk 14.0.2 2020-07-14
    OpenJDK Runtime Environment (build 14.0.2+12-Ubuntu-120.04)
    OpenJDK 64-Bit Server VM (build 14.0.2+12-Ubuntu-120.04, mixed mode, sharing)

I compiled this program by running:

	javac TourTester.java

in the main directory of the project

