package com.grstar.pagememo_grass

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBHelper(context: Context):SQLiteOpenHelper(context,"memo.db",null,1,null) {
    override fun onCreate(db: SQLiteDatabase?) {
        val sql = "create table memotable(id integer PRIMARY KEY AUTOINCREMENT, memo_text text, day_date text)"
        db?.execSQL(sql)
    }

    override fun onUpgrade(p0: SQLiteDatabase?, p1: Int, p2: Int) {
        TODO("Not yet implemented")
    }

}