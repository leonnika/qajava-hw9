package ru.netology.domain;

import java.util.Date;

public class Post {
    private int idNumber; //уникальный id номер поста
    private int idOwner; //+идентификатор владельца стены, на которой размещена запись.
    private int idFrom; //+идентификатор автора записи
    private int createdBy; //+идентификатор администратора, который опубликовал запись (возвращается только для сообществ при запросе с ключом доступа администратора).
    private int idReplyOwner; //+идентификатор владельца записи, в ответ на которую была оставлена текущая.
    private int idReplyPost; //+идентификатор записи, в ответ на которую была оставлена текущая.
    private int friendsOnly; //+1, если запись была создана с опцией «Только для друзей».
    private LikesInfo likesInfo; //+информация о лайках к записи, объект с полями
    private ViewsInfo viewsInfo; //+ информация о просмотрах
    private String postType; //+тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    private PostSource postSource; //+ объект описывающий способ размещения записи на стене
    private GeoInfo geoInfo; //+ объект описывающий информацию о местоположении
    private int signerId; //+идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем;
    private int[] canPin={0,1}; //+информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int[] canDelete={0,1}; //+информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private int[] canEdit ={0,1}; //+информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private int[] isPinned ={1}; //+информация о том, что запись закреплена
    private int[] markedAsAds ={0,1}; //+информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite; //+true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId; //+идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
    //private String accountNameUrl; //ссылка по имени аккаунта, возвращает на главную страницу
    //private String avatarUrl;// ссылка на аватарку пользователя
    private DataPost dataPost; //дата и время размещения поста
    private String textPostUrl; //ссылка на текст поста
    //private String imageUrl; //ссылка на изображение к посту
    //private int numberView; // количество просмотров
    //private int numberLike; //количество лайков
    //private int numberSharePost; //количество поделившихся постом
    private RepostPost reportPost; //репост на пост
    private CommentsInfo commentsInfo; // коменты к посту
}
