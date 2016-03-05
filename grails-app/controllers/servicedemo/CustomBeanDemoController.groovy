package servicedemo

import com.demo.CustomBean
import grails.util.Holders
import org.springframework.beans.factory.annotation.Autowire
import org.springframework.beans.factory.annotation.Autowired

class CustomBeanDemoController {

    //static scope = "prototype"
    def customBean
    def customBeanUsingConstructor

    // For this to work either there should be only one bean of type 'CustomBean' or
    // if there are multiple bean of this type one of them should match the reference name , 'customBean1` in this case
    @Autowired
    CustomBean customBean1

    def customBeanDemo() {

       /* def c = Holders.applicationContext.getBean('customBean')
        render("${c}:::  ${c.properties}")*/
        render("${customBean}:::  ${customBean.properties}")
    }

    def customBeanDemoUsingConstructor(){
        render("${customBeanUsingConstructor}:::  ${customBeanUsingConstructor.properties}")
    }

    def customBeanDemoUsingAutowiredAnnotaion(){
        render("${customBean1}:::  ${customBean1.properties}")
    }

}
