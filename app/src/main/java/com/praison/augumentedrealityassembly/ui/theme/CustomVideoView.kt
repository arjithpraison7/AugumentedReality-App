package com.praison.augumentedrealityassembly.ui.theme

import android.content.Context
import android.util.AttributeSet
import android.widget.VideoView

class CustomVideoView : VideoView {
    constructor(context: Context) : super(context)
    constructor(context: Context, attrs: AttributeSet?) : super(context, attrs)
    constructor(context: Context, attrs: AttributeSet?, defStyleAttr: Int) : super(context, attrs, defStyleAttr)

    override fun onMeasure(widthMeasureSpec: Int, heightMeasureSpec: Int) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec)

        val width = measuredWidth
        val height = measuredHeight

        // Set the desired aspect ratio (e.g., 16:9)
        val desiredAspectRatio = 16f / 9f

        val measuredAspectRatio = width.toFloat() / height.toFloat()

        if (measuredAspectRatio > desiredAspectRatio) {
            val newHeight = (width / desiredAspectRatio).toInt()
            setMeasuredDimension(width, newHeight)
        } else {
            val newWidth = (height * desiredAspectRatio).toInt()
            setMeasuredDimension(newWidth, height)
        }
    }
}
