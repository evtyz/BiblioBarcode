package com.evanzheng.bibliobarcode;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import java.util.List;

@Dao
public interface BookDao {
    @Insert
    void insertBook(Book book);

    @Update
    void updateBook(Book book);

    @Delete
    void deleteBook(Book book);

    @Query("SELECT isbn FROM books")
    List<String> loadISBN();

    @Query("SELECT * FROM books")
    List<Book> loadBookSources();
}
