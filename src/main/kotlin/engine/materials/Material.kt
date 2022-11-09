package engine.materials

import com.cozmicgames.utils.*

class Material : Properties() {
    var colorTexturePath by string { "<missing>" }
    var shader by string { "default" }
    val color by color { it.set(Color.WHITE) }

    fun set(material: Material) {
        colorTexturePath = material.colorTexturePath
        shader = material.shader
        color.set(material.color)
    }

    override fun equals(other: Any?): Boolean {
        if (other == null)
            return false

        if (this === other)
            return true

        if (this::class != other::class)
            return false

        other as Material

        if (colorTexturePath != other.colorTexturePath)
            return false

        if (shader != other.shader)
            return false

        if (color != other.color)
            return false

        return true
    }
}