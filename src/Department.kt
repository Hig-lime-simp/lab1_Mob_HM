abstract class Department(
    open val departmentName: String
) {
    abstract fun printDepartmentGoal()
}

class DevelopmentDepartment : Department("Development")
{
    override fun printDepartmentGoal() {
        println("Писать чистый код")
    }
}

class TestingDepartment : Department("Testing")
{
    override fun printDepartmentGoal() {
        println("Находить все баги")
    }
}