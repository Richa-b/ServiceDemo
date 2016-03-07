package servicedemo

import grails.transaction.Transactional
import groovy.sql.Sql

import java.sql.SQLException

//@Transactional(rollbackFor = Exception.class)


@Transactional
class UserService {

    def testService
    def saveUser() {

        User user = new User(firstName:"Ram" , lastName : "Malhotra" , userId: "1")
        user.save()
       // throw new RuntimeException()
        //throw new IOException()
        user

    }

    //if we use @Transactional on any service method then only that method is transactional. i.e
    //@Transactional
    def dummyMethod() {

    }


    //To verify how propagation works from one transaction to another
    def testPropagation(){
        User user = new User(firstName:"Neha" , lastName : "Malhotra" )
        user.save()
        try {
            testService.saveAnotherUser()
        }
        catch (Exception exceptio) {
            println("Catching Exception")
        }
        user
    }


    // this wont allow any write operation
    @Transactional(readOnly = true)
    def testReadOnly(){
        User user = new User(firstName:"Neha" , lastName : "Malhotra" )
        user.save()
        user
    }

}
