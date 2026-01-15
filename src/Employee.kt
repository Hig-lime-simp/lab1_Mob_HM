class Employee() : ReportGenerator {
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
    override fun generateReport(): String {
        return "Это - $fullName!," +
                " Занимает должность - $position," +
                " Получает неплохие - $salary,!" +
                " Работает у нас вот уже - $yearsOfExperience лет!"
    }

    var currentTask : Task? = Task()

    fun assignTask(newTask: Task){
        if (newTask.isCompleted == false){
            println("Сотрудник уже занят задачей ${currentTask?.title}")
        }
        else{
            currentTask = newTask
        }
    }
}