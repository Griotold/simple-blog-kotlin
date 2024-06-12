package org.kotlin.simpleblog.domain.post

import jakarta.persistence.*
import org.kotlin.simpleblog.domain.AuditingEntity

@Entity
@Table(name = "Post")
class Post (
    title: String,
    content: String,
) : AuditingEntity() {

    @Column(name = "title", nullable = false)
    var title:String = title
        protected set
    @Column(name = "content")
    var content: String = content
        protected set
}