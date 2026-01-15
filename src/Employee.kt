class Employee() {
    private var fullName: String = "Иван Иванонов Иванович"
    private var position: String = "Стажер"
    private var salary: Int = 0
        set(value) {
            if (value <= 0){
                println("Error, pls enter not negative ")
                field = 0
            }
        }
    private var yearsOfExperience: Int = 0
        set(value) {
            field = (value.coerceIn(0, 50))
        }
    fun getName(name: String){
        fullName = name
    }
    fun getPosition(poz: String){
        position = poz
    }
    fun getSalary(sal: Int){
        salary = sal
    }
    fun getYears(years: Int){
        yearsOfExperience = years
    }
}