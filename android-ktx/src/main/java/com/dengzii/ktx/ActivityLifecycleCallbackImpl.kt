package com.dengzii.ktx

import android.app.Activity
import android.app.Application
import android.os.Bundle

class ActivityLifecycleCallbackImpl : Application.ActivityLifecycleCallbacks {

    companion object {
        internal val INSTANCE = ActivityLifecycleCallbackImpl()
    }

    override fun onActivityPaused(activity: Activity) {

    }

    override fun onActivityStarted(activity: Activity) {

    }

    override fun onActivityDestroyed(activity: Activity) {

    }

    override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) {

    }

    override fun onActivityStopped(activity: Activity) {

    }

    override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {

    }

    override fun onActivityResumed(activity: Activity) {

    }
}