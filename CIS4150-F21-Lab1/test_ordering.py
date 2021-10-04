#!/usr/bin/env python3

##
## Unittest fixture ordering laboratory
##


# Import the unittest tools
import unittest


# If we wanted to add code to set up the entire module/package,
# we could do that here.  The unittest toolset will find these
# functions (declared outside of the class) with these known
# names and run them as module level setup and cleanup
def setUpModule():
	print("In setUpModule() - global")

def tearDownModule():
	print("In tearDownMowdule() - global")


## Create a class derived from unittest.TestCase
class TestConversionsAlpha(unittest.TestCase):


	# Declare a "class method" (a static method) fixture to
	# do the set up for the entire class worth of tests
	@classmethod
	def setUpClass(cls):
		print("  In setUpClass() - Alpha")

	# Declare a "class method" (a static method) fixture to
	# do the clean up for the entire class worth of tests
	# ... add code ...


	# Declare a fixture to set up for each test case
	# ... add code ...


	# Declare a fixture to clean up for each test case
	# ... add code ...


	# Test configuration "A" -- a passing test case
	def test_A(self):
		print("      In test_A() - Alpha")
		self.assertEqual("A", "A")

	# Test configuration "B" -- a failing test case
	def test_B(self):
		print("      In test_B() - Alpha")
		self.assertEqual("A", "B")
		
	# Test configuration "C" -- a passing test case
	def test_C(self):
		print("      In test_C() - Alpha")
		self.assertEqual("C", "C")


## Create *another* class derived from unittest.TestCase
class TestConversionsBeta(unittest.TestCase):

	# Declare a "class method" (a static method) fixture to
	# do the set up for the entire class worth of tests
	# ... add code ...


	# Declare a "class method" (a static method) fixture to
	# do the clean up for the entire class worth of tests
	# ... add code ...


	# Declare a fixture to set up for each test case
	# ... add code ...


	# Declare a fixture to clean up for each test case
	# ... add code ...


	# Test configuration "A" -- a passing test case
	def test_A(self):
		print("      In test_A() - Beta")
		self.assertEqual("A", "A")

	# Test configuration "B" -- a failing test case
	def test_B(self):
		print("      In test_B() - Beta")
		self.assertEqual("A", "B")
		
	# Test configuration "C" -- a passing test case
	def test_C(self):
		print("      In test_C() - Beta")
		self.assertEqual("C", "C")


## If being run as a program, run the test suite.
## This allows this suite to be loaded and run within other
## larger test suites and treated as a module
if __name__ == '__main__':
	unittest.main()
