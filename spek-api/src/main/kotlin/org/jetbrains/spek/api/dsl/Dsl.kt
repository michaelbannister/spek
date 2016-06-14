package org.jetbrains.spek.api.dsl

import kotlin.reflect.KClass

/**
 * @author Ranie Jade Ramiso
 * @since 1.0
 */
interface Dsl {
    fun group(description: String, pending: Pending = Pending.No, body: org.jetbrains.spek.api.dsl.Dsl.() -> Unit)
    fun <T: Any> group(subject: KClass<T>, description: String,
                       pending: Pending = Pending.No, body: SubjectDsl<T>.() -> Unit)
    fun test(description: String, pending: Pending = Pending.No, body: () -> Unit)

    fun beforeEach(callback: () -> Unit)
    fun afterEach(callback: () -> Unit)

    // fun <T: Spek> includeSpec(spec: KClass<T>)
}
