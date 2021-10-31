package PageObject.OnlinerCatalog;

public enum HomePageBrandsLinkEnum {

    SUPER_PRICES("li[data-id='brand-0']"),
    CASHBACK_15_PERCENT("li[data-id='brand-1']"),
    NEW_CATALOG_SECTIONS("li[data-id='brand-2']"),
    PET_SUPPLIES("li[data-id='brand-3']"),
    XIAOMI("li[data-id='brand-4']"),
    APPLE("li[data-id='brand-5']"),
    IKEA("li[data-id='brand-6']"),
    COUNTRY_SEASON("li[data-id='brand-7']"),
    FURNITURE("li[data-id='brand-8']");

    String link;

    HomePageBrandsLinkEnum(String link) {
        this.link = link;
    }

    public String getLinkText() {
        return link;
    }

}
