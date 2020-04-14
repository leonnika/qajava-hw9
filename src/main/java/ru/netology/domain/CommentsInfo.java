package ru.netology.domain;

public class CommentsInfo {
    private int idNumber; //уникальный id номер комментария
    private String accountNameUrl; //ссылка по имени аккаунта, возвращает на главную страницу
    private String avatarUrl;// ссылка на аватарку пользователя
    private DataPost dataPost; //дата и время размещения комментария
    private String textPost; //текст коментария
    private int numberLike; //количество лайков
    private CommentsInfo replyMessage; // объект ответить
}
