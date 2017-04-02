package app.youkai.ui.feature.media.summary

import android.support.annotation.IntegerRes
import app.youkai.data.models.*
import com.hannesdorfmann.mosby.mvp.MvpView

interface SummaryView : MvpView {
    fun setSynopsis(synopsis: String)
    fun setGenres(genres: List<Genre>)
    fun setNoGenres()
    fun setLength(firstLine: String, secondLine: String, makeLink: Boolean)
    fun setLengthIcon(@IntegerRes res: Int)
    fun setStreamers(streamers: List<StreamingLink>)
    fun setStremersShown(show: Boolean = true)
    fun setNoStreamingServices()
    fun setReleaseInfo(firstLine: String, secondLine: String, makeLink: Boolean)
    fun setCommunityRating(rating: Float)
    fun setRatingsCount(count: Int)
    fun setFavoritesCount(count: Int)
    fun setPopularityRank(rank: Int)
    fun setRatingRank(rank: Int)
    fun setReviews(reviews: List<Review>)
    fun setNoReviews()
    fun setProducers(producers: String)
    fun setProducersIcon(@IntegerRes res: Int)
    fun setCharacters(characters: List<Character?>)
    fun setCharactersShown(show: Boolean = true)
    fun setMoreCharactersCount(count: Int)
    fun setRelated(related: List<MediaRelationship>?)
    fun setRelatedVisible(show: Boolean = true)

    fun onSynopsisClicked(title: String, synopsis: String)
    fun onStreamingServiceClicked(url: String)
    fun onLengthClicked()
    fun onReleaseInfoClicked()
    fun onReviewClicked(id: String)
    fun onAllReviewsClicked()
    fun onCharacterClicked(id: String)
    fun onAllCharactersClicked()
    fun onGenreClicked(slug: String)
    fun onRelatedClicked(id: String)
}