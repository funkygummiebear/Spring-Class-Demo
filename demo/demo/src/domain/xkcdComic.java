import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@RestController

public class XKCDController {

    @GetMapping("/xkcd")
    public XkcdComic xkcdComic(){
         RestTemplate restTemplate = new RestTemplate();
        XkcdComic result = restTemplate.getForObject("https://xkcd.com/info.0.json", XkcdComic.class);
        return result;
    }
    public class XkcdComic {
        private String month;
        private int num;
        private String link;
        private String year;
        private String news;
        private String safe_title;
        private String transcript;
        private String alt;
        private String img;
        private String title;
        private String day;
        
        public getMonth(){
            return month;
        }
        public setMonth(String mon){
            month = mon;
        }

    }
}