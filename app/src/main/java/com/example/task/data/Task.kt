package com.example.task.data

import android.arch.persistence.room.ColumnInfo
import android.arch.persistence.room.Entity
import android.arch.persistence.room.PrimaryKey


@Entity
data class Task(

    @ColumnInfo(name = "title")
    var title: String
){
    @PrimaryKey(autoGenerate = true)
    var Id: Int = 0
}
