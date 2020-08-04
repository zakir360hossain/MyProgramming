


class Laptop:
	def code(self, ide):
		ide.execute()


class PyCharm:
	def execute(self):
		print("Compiling")
		print("Running")

class myEditor:
	def execute(self):
		print("Convention Checking")
		print("Compiling")
		print("Debugging")
		print("Running")


ide = PyCharm()

mac = Laptop()
mac.code(ide)

# let say 
ide = myEditor() 
# Will the type of the ide change? NO, because the execute methods in both classes does something very
# very similar. So, if something behaves like a duck, it is a duck. 
mac2  = Laptop()
mac2.code(ide)


