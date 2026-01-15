abstract class Department(
    open val departmentName: String
) {
    abstract fun printDepartmentGoal(): String
}

class DevelopmentDepartment : Department("Development"),ReportGenerator
{
    override fun printDepartmentGoal() : String {
        return "Писать чистый код"
    }

    override fun generateReport(): String {
        return "Мы $departmentName !" +
                " И наша цель - ${printDepartmentGoal()}"
    }
}

class TestingDepartment : Department("Testing")
{
    override fun printDepartmentGoal() : String {
        return "Находить все баги"
    }
}