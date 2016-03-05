package servicedemo

import grails.transaction.Transactional
import groovy.sql.Sql

@Transactional
class UserService {

    def saveUser() {

        User user = new User(firstName:"Ram" , lastName : "Malhotra" , userId: "1")
        user.save()
    }

}
