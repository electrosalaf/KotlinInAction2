package chapter4.CompanionObjectsAPlaceForFactoryMethodsAndStaticMembers1

fun getFacebookName(accountId: Int) = "fb:$accountId"

class User(val nickname: String) {
    companion object {                                      //  Declare companion object
         fun newSubscribingUser(email: String) =            //   Factory method creating a new user by email
             User(email.substringBefore('@'))

        fun newFacebookUser(accountId: Int) =              // Factory method creating a new user by Facebook account Id
            User(getFacebookName(accountId))
    }
}

fun main(args: Array<String>) {
    val subscribingUser = User.newSubscribingUser("ibrahim*****@gmail.com")
    val facebookUser = User.newFacebookUser(4)

    println(subscribingUser.nickname)
}