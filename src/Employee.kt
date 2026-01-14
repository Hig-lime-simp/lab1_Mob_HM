class Employee() {
    private var fullName: String = "Иван Иванонов Иванович"
        get() = field
    private var position: String = "Стажер"
        get() = field
    private var salary: Int = 0
        get() = field
        set(value) {
            if (value <= 0){
                println("Error, pls enter not negative ")
                field = 0
            }
        }
    private var yearsOfExperience: Int = 0
        get() = field


}