package id.ac.unsrat.submission2.main

import id.ac.unsrat.submission2.model.Team

interface MainView {
    fun showLoading()
    fun hideLoading()
    fun showTeamList(data: List<Team>)
}
