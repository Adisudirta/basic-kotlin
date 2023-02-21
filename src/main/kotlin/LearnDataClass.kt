class User(val name: String, val age: Int){
    override fun toString(): String {
        return "User(name=$name, age=$age)"
    }

    override fun equals(other: Any?): Boolean{
        if(this === other) return true
        if(javaClass != other?.javaClass) return false

        other as User

        if(name != other.name) return false
        if(age != other.age) return false

        return true
    }

    override fun hashCode(): Int {
        var result = name.hashCode()
        result = 31 * result + age
        return result
    }
}

data class DataUser(val name: String, val age: Int)

fun main() {
    // without data class
    val user = User("somebuddy", 23)
    val user2 = User("somebuddy", 23)

    // with data class
    val dataUser = DataUser("john", 24)
    val dataUser2 = DataUser("john", 24)

    println(user)
    println(dataUser)

    println(user.equals(user2))
    println(dataUser.equals(dataUser2))

    // copy data class
    val dataUserCopy = dataUser.copy()
    println("dataUserCopy: $dataUserCopy")

    // modification data class
    val dataUserModif = dataUser.copy(age= 18)
    println("dataUserModif: $dataUserModif")
}