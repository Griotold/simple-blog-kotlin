package org.kotlin.simpleblog.domain.comment

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Table
import org.kotlin.simpleblog.domain.AuditingEntity
@Entity
@Table(name = "Comment")
class Comment (

    content: String,

) : AuditingEntity(){

    @Column(name = "content")
    var content: String = content
        private set
}