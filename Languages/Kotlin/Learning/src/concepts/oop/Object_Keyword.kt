package concepts.oop
//This is when you want to use singleton implementation
//This is a singleton class
object Machines{
    var machines = arrayListOf<Laptop>()
    fun showMachines(){
        for (m in machines){
            print(m)
        }
    }
}
fun main() {
    Machines.machines.add(Laptop("MacBook Pro", 1300.00))
    Machines.machines.add(Laptop("MacBook Air", 1100.00))
    Machines.showMachines()
}