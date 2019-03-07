package com.example.task

import android.arch.persistence.room.Room
import android.content.Intent
import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import com.example.task.data.Task
import com.example.task.data.TaskDatabase
import kotlinx.android.synthetic.main.create_task.*

class CreateTask : AppCompatActivity() {

    private var TAG: String = "CreateTask"


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.create_task)

        val db = Room.databaseBuilder(
            this.applicationContext,
            TaskDatabase::class.java,
            "Task_database"
        ).allowMainThreadQueries()
            .build()

        button.setOnClickListener { view ->
            Log.d(
                TAG, "onClick: Task:  ${task_name.text.toString()} " +
                        ", Description: ${task_description.text.toString()} "
            )
            db.taskDao().inserAllTasks(Task(task_name.text.toString()))
            startActivity(Intent(this@CreateTask, MainActivity::class.java))


        }
    }
}