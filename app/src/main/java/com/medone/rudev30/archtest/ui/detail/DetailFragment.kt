package com.medone.rudev30.archtest.ui.detail

import android.arch.lifecycle.Observer
import android.arch.lifecycle.ViewModelProvider
import android.arch.lifecycle.ViewModelProviders
import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.medone.rudev30.archtest.R
import kotlinx.android.synthetic.main.detail_fragment.*
import javax.inject.Inject

class DetailFragment : Fragment() {

    companion object {
        fun newInstance() = DetailFragment()
    }

    @Inject
    lateinit var viewModelFactory: ViewModelProvider.Factory

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
                              savedInstanceState: Bundle?): View {
        return inflater.inflate(R.layout.detail_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        val viewModel = ViewModelProviders.of(this, viewModelFactory).get(DetailViewModel::class.java)
        viewModel.welcomeString.observe(
                this,
                Observer(::setWelcomeString)
        )
    }

    private fun setWelcomeString(welcomeString: String?) {
        welcomeString?.let{
            message.text = it
        }
    }

}
