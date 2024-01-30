package ru.netology.nmedia.repository


import kotlinx.coroutines.flow.Flow
import ru.netology.nmedia.dto.Post
import ru.netology.nmedia.model.PhotoModel

interface PostRepository {
    val data: Flow<List<Post>>
    fun getNewerCount(id: Long): Flow<Int>
    suspend fun getAll()
    suspend fun getAllVisible()
    suspend fun showAll()
    suspend fun likeById(id: Long)
    suspend fun shareById(id: Long)
    suspend fun save(post: Post)
    suspend fun removeById(id: Long)
    suspend fun saveWithAttachment(post: Post, model: PhotoModel)
}