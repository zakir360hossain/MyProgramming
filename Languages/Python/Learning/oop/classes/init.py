class Computer:
    def __init__(self, cpu, ram, model):
        # Parameters initialization.
        self.cpu = cpu
        self.ram = ram
        self.model = model

    def data(self, year):
        print(f"Year: {year}, CPU: {self.cpu},  RAM: {self.ram}, Model: {self.model}")


computer1 = Computer("i5", "8 MG", "os_module X")
# All the parameters under the init methods will have values when the instance us being created. init is not
# need to be called explicitly, it will be called internally.

# One way to call methods. Method => 'data':
Computer.data(computer1, 2019)
# This is same (common way):
computer1.data(219)  # Here I don't need to put the instance for the first self parameter because it will automatically
# do that.
