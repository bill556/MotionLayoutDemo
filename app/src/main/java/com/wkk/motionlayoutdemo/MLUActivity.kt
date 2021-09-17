package com.wkk.motionlayoutdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionLayout.DEBUG_SHOW_PATH
import androidx.constraintlayout.motion.widget.MotionLayout.DEBUG_SHOW_PROGRESS

class MLUActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mario_lu)
        findViewById<Button>(R.id.showDebug).setOnClickListener {
            findViewById<MotionLayout>(R.id.motionLayout).progress = .2f
            findViewById<MotionLayout>(R.id.motionLayout).transitionToEnd()

            //findViewById<MotionLayout>(R.id.motionLayout).setDebugMode(DEBUG_SHOW_PATH)
        }
    }
}
