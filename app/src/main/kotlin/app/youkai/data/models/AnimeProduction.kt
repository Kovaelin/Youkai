package app.youkai.data.models

import com.github.jasminb.jsonapi.annotations.*

@Type("animeProductions")
class AnimeProduction : BaseJsonModel() {

    var role: String? = null

    @Relationship("anime")
    var anime: Anime? = null

    @RelationshipLinks("anime")
    var animeLinks: com.github.jasminb.jsonapi.Links? = null

    @Relationship("producer")
    var producer: Producer? = null

    @RelationshipLinks("producer")
    var producerLinks: com.github.jasminb.jsonapi.Links? = null

}
