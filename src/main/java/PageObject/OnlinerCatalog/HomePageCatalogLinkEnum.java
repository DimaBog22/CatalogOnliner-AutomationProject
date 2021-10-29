package PageObject.OnlinerCatalog;

public enum HomePageCatalogLinkEnum {

    ELECTRONICS("[data-id='1']>span.catalog-navigation-classifier__item-title>span"),
    COMPUTERS("[data-id='2']>span.catalog-navigation-classifier__item-title>span"),
    APPLIANCES("[data-id='3']>span.catalog-navigation-classifier__item-title>span");

    String link;

    HomePageCatalogLinkEnum(String link) {
        this.link = link;
    }

    public String getLinkText() {
        return link;
    }

}
