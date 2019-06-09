package Splitter;
import Splitter.entity.Splitter;
import Splitter.DB.SplitterDAO;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SplitterStart {
    public static void main(String[] args) {

        ApplicationContext ctx = new ClassPathXmlApplicationContext("splitter-config.xml");
        //SplitterDAO jdbcsplitterdao = (SplitterDAO)ctx.getBean("jdbcSplitterDAO");
       // SplitterDAO hibernatesplitterdao = (SplitterDAO)ctx.getBean("hibernateSplitterDAO");
        SplitterDAO jpasplitterdao = (SplitterDAO)ctx.getBean("splitterDAO");

        Splitter splitter = new Splitter();

        splitter.setLogin("Misha");
        splitter.setPassword("Misha");
        splitter.setFullname("Michael");
        splitter.setEmail("smth@mail.ru");
        splitter.setUpdatebyemail(true);


        //jdbcsplitterdao.addSplitter(splitter);
        //hibernatesplitterdao.addSplitter(splitter);
        jpasplitterdao.addSplitter(splitter);
    }
}
