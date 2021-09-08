
class FancyInfoProvider: basicInfoProvider() {

    override val providerInfo: String
        get() = "fancy info provider"

    override val sessionIdPrefex: String
        get() = "fancy session"
}