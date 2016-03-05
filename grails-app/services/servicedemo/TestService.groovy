package servicedemo

import grails.transaction.Transactional
import org.springframework.transaction.annotation.Propagation

//@Transactional(propagation = Propagation.REQUIRES_NEW)
class TestService {

    def userService


    def saveAnotherUser(){
        User user = new User(firstName: "Pooja" , lastName: "Sharma")
        user.save()
        //throwing run time Exception
       // 1/0
        user
    }
}
