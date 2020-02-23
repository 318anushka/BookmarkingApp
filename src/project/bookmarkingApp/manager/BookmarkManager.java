package project.bookmarkingApp.manager;


import project.bookmarkingApp.dao.BookmarkDao;
import project.bookmarkingApp.entities.*;

public class BookmarkManager {

    private static BookmarkDao dao = new BookmarkDao();

    private static BookmarkManager instance = new BookmarkManager();
    private BookmarkManager(){ }

    public static BookmarkManager getInstance(){
        return instance;
    }

    public Movie createMovie(int id , String title , int releaseYear , String[] cast , String[] director , String genre , double imdbRating){
        Movie movie = new Movie();
        movie.setId(id);
        movie.setTitle(title);
        movie.setReleaseYear(releaseYear);
        movie.setCast(cast);
        movie.setDirector(director);
        movie.setGenre(genre);
        movie.setImdbRating(imdbRating);
        return movie;
    }


    public Book createBook(long id , String title ,  int publicationYear , String publisher , String[] author , String genre , double amazonRating){
        Book book = new Book();
        book.setId(id);
        book.setTitle(title);
        book.setPublicationYear(publicationYear);
        book.setPublisher(publisher);
        book.setAuthor(author);
        book.setGenre(genre);
        book.setAmazonRating(amazonRating);
        return book;
    }


    public WebLink createWebLink(long id , String title , String url , String host){
        WebLink webLink = new WebLink();
        webLink.setId(id);
        webLink.setTitle(title);
        webLink.setUrl(url);
        webLink.setHost(host);
        return webLink;
    }

    public Bookmark[][] getBookmark(){
       return dao.getBookmark();
    }

    public void saveUserBookmark(User user, Bookmark bookmark) {
        UserBookmark userBookmark = new UserBookmark();
        userBookmark.setUser(user);
        userBookmark.setBookmark(bookmark);

        dao.saveUserBookmark(userBookmark);
    }
}
