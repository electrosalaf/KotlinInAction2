package chapter4.CompanionObjectsAPlaceForFactoryMethodsAndStaticMembers1

class A {
    val nickname: String

    constructor (email: String) {
        nickname = email.substringBefore('@')
    }

    constructor (facebookAccountId: Int) {
        nickname = getFacebookName(facebookAccountId)
    }
}
