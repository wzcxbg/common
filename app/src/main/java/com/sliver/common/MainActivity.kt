package com.sliver.common

import android.content.Intent
import com.sliver.common.base.BaseActivity
import com.sliver.common.databinding.ActivityMainBinding
import com.sliver.common.login.mvvm.LoginActivity

class MainActivity : BaseActivity<ActivityMainBinding>() {
    override fun initView() {
        //val userConfig = PreferenceConfigOf<User>()

        /*Log.e(TAG, "initView: ${userConfig.getUsername()} ${userConfig.getPassword()} ${userConfig.getAge()}")
        userConfig.setUsername("1")
            .setPassword("1")
            .setAge(1)*/
        //TODO 使用javassist实现插件功能 hook log

        //  Log.e(TAG, "initView: ${userConfig.username} ${userConfig.password} ${userConfig.age}")

        //  /*userConfig.setUsername("12")
        //      .setPassword("12")
        //      .setAge(12)*/

        //  Log.e(TAG, "initView: ${userConfig.username} ${userConfig.password} ${userConfig.age}")

        //  userConfig.username = "wangwu"
        //  userConfig.password = "11223344"
        //  userConfig.age = 25

        //  Log.e(TAG, "initView: ${userConfig.username} ${userConfig.password} ${userConfig.age}")

        startActivity(Intent(this, LoginActivity::class.java))
    }
}