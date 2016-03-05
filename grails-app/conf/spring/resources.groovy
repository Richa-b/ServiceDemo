import com.demo.CustomBean

// Place your Spring DSL code here
beans = {
    customBean(com.demo.CustomBean) { bean ->
       // bean.scope = 'prototype'
        name = "Riya"
    }

}
