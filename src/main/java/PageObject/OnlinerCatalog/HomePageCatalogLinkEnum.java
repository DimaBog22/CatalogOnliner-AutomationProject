package PageObject.OnlinerCatalog;

public enum HomePageCatalogLinkEnum {

    ELECTRONICS("[data-id='1']>span.catalog-navigation-classifier__item-title>span"),
    COMPUTERS_AND_NETWORKS("[data-id='2']>span.catalog-navigation-classifier__item-title>span"),
    APPLIANCES("[data-id='3']>span.catalog-navigation-classifier__item-title>span"),
    CONSTRUCTION_AND_REPAIR("[data-id='4']>span.catalog-navigation-classifier__item-title>span"),
    HOUSE_AND_GARDEN("[data-id='5']>span.catalog-navigation-classifier__item-title>span"),
    AUTO_AND_MOTO("[data-id='6']>span.catalog-navigation-classifier__item-title>span"),
    BEAUTY_AND_SPORT("[data-id='7']>span.catalog-navigation-classifier__item-title>span"),
    CHILDREN_AND_MOMS("[data-id='8']>span.catalog-navigation-classifier__item-title>span"),
    WORK_AND_OFFICE("[data-id='9']>span.catalog-navigation-classifier__item-title>span"),
    FOOD("[data-id='16']>span.catalog-navigation-classifier__item-title>span");

    String link;

    HomePageCatalogLinkEnum(String link) {
        this.link = link;
    }

    public String getLinkText() {
        return link;
    }

}
