package org.kotlin.simpleblog.domain.comment

import jakarta.persistence.*
import org.kotlin.simpleblog.domain.AuditingEntity
import org.kotlin.simpleblog.domain.member.Member
import org.kotlin.simpleblog.domain.post.Post

@Entity
@Table(name = "Comment")
class Comment (

    content: String,
    post: Post

) : AuditingEntity(){

    @Column(name = "content", nullable = false)
    var content: String = content
        protected set

    @ManyToOne(fetch = FetchType.LAZY, targetEntity = Post::class)
    var post: Post = post
        protected set
}