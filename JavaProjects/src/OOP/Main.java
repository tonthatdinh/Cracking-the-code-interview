package OOP;

/**
 * 7.3. Design a musical juke box using object oriented principles
 *
 */

import java.util.*;


class Song{
    private int id;
    private String songname;

    public Song(int id, String songname) {
        this.id = id;
        this.songname = songname;
    }

    public Song(){
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSongname() {
        return songname;
    }

    public void setSongname(String songname) {
        this.songname = songname;
    }
}


class CD{
    private int id;
    private String CDName;
    private ArrayList<Song> songList;

    public CD(int id, String CDName, ArrayList<Song> songList) {
        this.id = id;
        this.CDName = CDName;
        this.songList = songList;
    }

    public CD() {
        songList = new ArrayList<Song>();
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCDName() {
        return CDName;
    }

    public void setCDName(String CDName) {
        this.CDName = CDName;
    }

    public ArrayList<Song> getSongList() {
        return songList;
    }

    public void setSongList(ArrayList<Song> songList) {
        this.songList = songList;
    }

    public void printAll(){
        for(int i = 0; i < songList.size(); i ++)
            System.out.println(songList.get(i).getSongname() + "," + songList.get(i).getId());
    }

    public void addSong(Song song){
        songList.add(song);
    }
}

/**
 * 7.5. Design the data structure for an online book reader system.
 * Assume we want to design a basic online reading system which provides the following functionality:
 * 1. User membership creation and extension
 * 2. Search the database of books
 * 3. Reading the books
 * To implement these may require many other funcitons, like get, set, update, etc.
 *
 */

class Book{
    private long ID;
    private String details;

    public long getID() {
        return ID;
    }

    public void setID(long ID) {
        this.ID = ID;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public Book(long ID, String details){
        this.ID = ID;
        this.details = details;
    }
}

class ListBook{
    private HashSet<Book> bookSet;

    public ListBook(){
        bookSet = new HashSet<Book>();
    }

    public void addBook(long ID, String details){
        bookSet.add(new Book(ID, details));
    }

    public void addBook(Book book){
        bookSet.add(book);
    }

    public void deleteBook(Book book) {
        bookSet.remove(book);
    }

    public void printAll(){
        System.out.println(bookSet.size());
        Iterator<Book> iterator = bookSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next().getID());
        }
    }
}

public class Main {
    public static void main(String args[]){
        CD cd = new CD();
        Song song = new Song(1, "cay dan");
        cd.addSong(song);
        cd.addSong(new Song(2, "sinh vien Viet Name"));
        cd.addSong(new Song(3, "Shopee"));
        cd.addSong(new Song(4, "Lazada"));
        cd.addSong(new Song(5, "Garena"));
        cd.addSong(new Song(6, "VNG"));
        cd.addSong(new Song(7, "Zalora"));
        cd.addSong(new Song(8, "Cuoc doi van dep sao"));
        cd.addSong(new Song(9, " "));
        cd.printAll();
    }
}
