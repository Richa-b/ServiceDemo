package servicedemo

import com.demo.CustomBean
import grails.util.Holders

class CustomBeanDemoController {

    //static scope = "prototype"
    def customBean
    def customBeanUsingConstructor

    def customBeanDemo() {

       /* def c = Holders.applicationContext.getBean('customBean')
        render("${c}:::  ${c.properties}")*/
        render("${customBean}:::  ${customBean.properties}")
    }

    def customBeanDemoUsingConstructor(){
        render("${customBeanUsingConstructor}:::  ${customBeanUsingConstructor.properties}")
    }

}
