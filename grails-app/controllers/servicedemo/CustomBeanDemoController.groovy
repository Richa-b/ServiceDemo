package servicedemo

import com.demo.CustomBean
import grails.util.Holders

class CustomBeanDemoController {

    //static scope = "prototype"
    def customBean

    def customBeanDemo() {

       /* def c = Holders.applicationContext.getBean('customBean')
        render("${c}:::  ${c.properties}")*/
        render("${customBean}:::  ${customBean.properties}")
    }

}
