package com.example.todoapp.room;


import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import com.example.todoapp.models.Work;

import java.util.List;

@Dao

public interface WorkDao {


   @Query("SELECT*FROM Work")
   LiveData<List<Work> >getAll();



    @Insert
     void insert(Work work);
}
