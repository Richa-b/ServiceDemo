package servicedemo

import grails.transaction.Transactional

//@Transactional
class UserController {


    def userService


    // Bad Practice .. Never perform business logic task in Controller
    def index() {

        User user = new User(firstName:"Ram" , lastName : "Malhotra" , userId: "1")
        user.save()
        render user;
    }

    def saveUser(){
        if(userService.saveUser())
            render "User Saved"
        else
            render("User Not Saved")
    }


    def testPropagation(){
        if(userService.testPropagation())
            render "User Saved"
        else
            render("User Not Saved")
    }


    def testReadOnly(){
        render userService.testReadOnly()
    }



}
