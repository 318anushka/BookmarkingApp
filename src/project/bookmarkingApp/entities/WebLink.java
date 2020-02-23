package project.bookmarkingApp.entities;

public class WebLink extends Bookmark{
    private String url;
    private String host;
    private long id;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String title;


    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public String toString() {
        return "WebLink{" +
                "url='" + url + '\'' +
                ", host='" + host + '\'' +
                ", id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public boolean isKidFriendlyEligible() {

        if(url.contains("porn")||getTitle().contains("porn")||host.contains("adult")){
            return false;
        }
        return true;
    }
}
