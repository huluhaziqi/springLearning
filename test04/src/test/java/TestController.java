import com.lin.config.MyMvcConfig;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = {MyMvcConfig.class})
@WebAppConfiguration("src/main/resources")
public class TestController {

    private MockMvc mockMvc;

    @Autowired
    private WebApplicationContext context;

    @Before
    public void setMockMvc(){
        this.mockMvc = MockMvcBuilders.webAppContextSetup(this.context).build();
    }

    @Test
    public void testNormal(){
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/normal")).andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.view().name("page"))
                    .andExpect(MockMvcResultMatchers.forwardedUrl("/WEB-INF/classes/views/page.jsp"))
                    .andExpect(MockMvcResultMatchers.model().attribute("msg","hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    @Test
    public void testRest(){
        try {
            mockMvc.perform(MockMvcRequestBuilders.get("/testRest"))
                    .andExpect(MockMvcResultMatchers.status().isOk())
                    .andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
                    .andExpect(MockMvcResultMatchers.content().string("hello"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


}
