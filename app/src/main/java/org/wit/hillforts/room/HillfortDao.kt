package org.wit.hillforts.room

import android.arch.persistence.room.*
import org.wit.hillforts.models.HillfortModel

@Dao
interface HillfortDao {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun create(hillfort: HillfortModel)

    @Query("SELECT * FROM HillfortModel")
    fun findAll(): List<HillfortModel>

    @Query("SELECT * FROM HillfortModel where id = :id")
    fun sortByTownland(id: String): List<HillfortModel>

//    @Query("SELECT * FROM HillfortModel WHERE townland = 'town'")
//    fun findTown(town: String): List<HillfortModel>

    @Query("select * from HillfortModel where id = :id")
    fun findById(id: Long): HillfortModel

    @Update
    fun update(hillfort: HillfortModel)

    @Delete
    fun deleteHillfort(hillfort: HillfortModel)
}