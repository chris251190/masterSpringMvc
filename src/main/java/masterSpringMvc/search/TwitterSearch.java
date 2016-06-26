package masterSpringMvc.search;

import java.util.List;

/**
 * Created by Christian on 22.06.2016.
 */
public interface TwitterSearch {
    List<LightTweet> search(String searchType, List<String> keywords);

}
