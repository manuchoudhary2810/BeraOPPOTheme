package com.bajuu.a3iconpack

import android.app.Activity
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val content = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            gravity = Gravity.CENTER_VERTICAL
            setPadding(28.dp, 32.dp, 28.dp, 32.dp)
            setBackgroundColor(Color.rgb(247, 246, 240))
        }

        content.addView(TextView(this).apply {
            text = getString(R.string.app_name)
            textSize = 30f
            setTextColor(Color.rgb(27, 54, 45))
        })

        content.addView(TextView(this).apply {
            text = getString(R.string.pack_status)
            textSize = 16f
            setTextColor(Color.rgb(64, 73, 68))
            setPadding(0, 16.dp, 0, 0)
        })

        content.addView(TextView(this).apply {
            text = getString(R.string.apply_hint)
            textSize = 14f
            setTextColor(Color.rgb(91, 98, 93))
            setPadding(0, 24.dp, 0, 0)
        })

        setContentView(content, ViewGroup.LayoutParams.MATCH_PARENT.let {
            LinearLayout.LayoutParams(it, ViewGroup.LayoutParams.MATCH_PARENT)
        })
    }

    private val Int.dp: Int
        get() = (this * resources.displayMetrics.density).toInt()
}