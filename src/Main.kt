fun main(){
//    val test: Employee = Employee()
//    test.getName("Nikita")
//    test.getPosition("Staff")
//    test.getSalary(-11)
//    test.getYears(60)
//    val test: Task = Task("Test","Test",true, Priority.HIGH)
//    test.copy("Test","Test",true,Priority.LOW)
//    val testD : DevelopmentDepartment = DevelopmentDepartment()
//    val testT : TestingDepartment = TestingDepartment()
//    testD.printDepartmentGoal()
//    testT.printDepartmentGoal()

//    val TESTLIST : List<ReportGenerator> = listOf(
//        DevelopmentDepartment(),
//        Employee()
//    )
//    for (i in TESTLIST){
//        println(i.generateReport())
//    }
//    val testTask: Task = Task("very impotent task","impotent",false, Priority.HIGH)
//    val test : Employee = Employee()
//    test.currentTask
//    test.assignTask(testTask)

    val employee = Employee()
    employee.getName("Александр Петров")
    employee.getPosition("Middle разработчик")
    employee.getSalary(150000)
    employee.getYears(3)

    val devDepartment = DevelopmentDepartment()
    val testDepartment = TestingDepartment()

    val task1 = Task(
        title = "Разработать новый модуль",
        description = "Создать модуль авторизации пользователей",
        priority = Priority.HIGH
    )

    val task2 = Task(
        title = "Исправить баг в API    ",
        description = "Починить ошибку 500 при отправке запроса",
        priority = Priority.MEDIUM
    )

}