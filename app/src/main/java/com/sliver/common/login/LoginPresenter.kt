package com.sliver.common.login

import com.sliver.common.arch.mvp.BasePresenter

class LoginPresenter : BasePresenter<LoginContract.View>(), LoginContract.Presenter {
    private lateinit var loginModel: LoginModel

    override fun login(username: String, password: String) {
        view.showLoadingDialog()
        loginModel.login(username, password, object : LoginContract.Model.LoginCallback {
            override fun onSuccess() {
                view.hideLoadingDialog()
                view.launchNextActivity()
            }

            override fun onFailed() {
                view.hideLoadingDialog()
                view.showLoginFailedReason("用户名或密码错误")
            }
        })
    }
}