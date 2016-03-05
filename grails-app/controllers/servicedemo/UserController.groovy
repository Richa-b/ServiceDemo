package servicedemo

//@Transactional
class UserController {



    def index() {

        User user = new User(firstName:"Ram" , lastName : "Malhotra" , userId: "1")
        user.save()
        render user
    }



}
