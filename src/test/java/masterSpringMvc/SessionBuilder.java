package masterSpringMvc;

import masterSpringMvc.profile.UserProfileSession;
import org.springframework.mock.web.MockHttpSession;

import java.util.Arrays;

/**
 * Created by Christian on 22.06.2016.
 */
public class SessionBuilder {
    private final MockHttpSession session;
    UserProfileSession sessionBean;
    public SessionBuilder() {
        session = new MockHttpSession();
        sessionBean = new UserProfileSession();
        session.setAttribute("scopedTarget.userProfileSession", sessionBean);
    }
    public SessionBuilder userTastes(String... tastes) {
        sessionBean.setTastes(Arrays.asList(tastes));
        return this;
    }
    public MockHttpSession build() {
        return session;
    }
}
