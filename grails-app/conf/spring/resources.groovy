import com.demo.CustomBean

// Place your Spring DSL code here
beans = {

    // Setter Injection ::: Calls the setter
    customBean(com.demo.CustomBean) { bean ->
        // bean.scope = 'prototype'
        name = "Riya"
        userService = ref("userService")
    }

    // Constructor Injection ::: Calls the Constructor
    customBeanUsingConstructor(com.demo.CustomBean, "Ram") { bean ->

    }

}
