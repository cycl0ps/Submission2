package id.ac.unsrat.submission2.api

import android.net.Uri
import id.ac.unsrat.submission2.BuildConfig

object TheSportDBApi {

    fun getTeams(league: String?): String {
        return Uri.parse(BuildConfig.BASE_URL).buildUpon()
                .appendPath("api")
                .appendPath("v1")
                .appendPath("json")
                .appendPath(BuildConfig.TSDB_API_KEY)
                .appendPath("search_all_teams.php")
                .appendQueryParameter("id", "4432")
                .build()
                .toString()
    }
}