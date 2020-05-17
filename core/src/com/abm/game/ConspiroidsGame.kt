package com.abm.game

import com.badlogic.gdx.ApplicationAdapter
import com.badlogic.gdx.Gdx
import com.badlogic.gdx.graphics.GL20
import com.badlogic.gdx.graphics.Texture
import com.badlogic.gdx.graphics.g2d.SpriteBatch

class ConspiroidsGame : ApplicationAdapter() {
    lateinit var batch: SpriteBatch
    lateinit var img: Texture
    override fun create() {
        batch = SpriteBatch()
        img = Texture("flying_mast.png")
    }

    override fun render() {
        Gdx.gl.glClearColor(102/255f, 143/255f, 205/255f, 1f)
        Gdx.gl.glClear(GL20.GL_COLOR_BUFFER_BIT)
        with(batch) {
            begin()
            draw(img, 0f, 0f)
            end()
        }
    }

    override fun dispose() {
        batch.dispose()
        img.dispose()
    }
}