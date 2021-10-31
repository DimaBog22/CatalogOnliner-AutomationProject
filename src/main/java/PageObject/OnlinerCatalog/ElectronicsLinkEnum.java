package PageObject.OnlinerCatalog;

public enum ElectronicsLinkEnum {

    PHONES_AND_ACCESSORIES("//div[contains(text(),'Мобильные телефоны')]"),
    TELEVISION_AND_VIDEO("//div[contains(text(),'Телевидение')]"),
    TABLETS_AND_ELECTRONIC_BOOKS("//div[contains(text(),'Планшеты, электронные книги')]"),
    AUDIO_ENGINEERING("//div[contains(text(),'Аудиотехника')]"),
    HIFI_AUDIO("//div[contains(text(),'Hi-Fi аудио')]"),
    PHOTO_AND_VIDEO("//div[contains(text(),'Фото- и')]"),
    VIDEO_GAMES("//div[contains(text(),'Видеоигры')]"),
    GADGETS("//div[contains(text(),'Гаджеты')]"),
    SMART_HOUSE_AND_VIDEO("//div[contains(text(),'Умный дом и')]"),
    ELECTRIC_TRANSPORT("//div[contains(text(),'Электрический транспорт')]"),
    TELEPHONY_AND_COMMUNICATIONS("//div[contains(text(),'Телефония и')]"),
    MUSICAL_EQUIPMENT("//div[contains(text(),'Музыкальное оборудование')]"),
    OPTICAL_INSTRUMENTS("//div[contains(text(),'Оптические приборы')]");

    String link;

    ElectronicsLinkEnum(String link) {
        this.link = link;
    }

    public String getLinkText() {
        return link;
    }

}
