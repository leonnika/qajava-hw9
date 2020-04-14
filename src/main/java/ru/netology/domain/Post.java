package ru.netology.domain;

import java.util.Date;

public class Post {
    private int idNumber; //уникальный id номер поста
    private String accountNameUrl; //ссылка по имени аккаунта, возвращает на главную страницу
    private String avatarUrl;// ссылка на аватарку пользователя
    private DataPost dataPost; //дата и время размещения поста
    private String textPostUrl; //ссылка на текст поста
    private String imageUrl; //ссылка на изображение к посту
    private int numberView; // количество просмотров
    private int numberLike; //количество лайков
    private int numberSharePost; //количество поделившихся постом
    private ReportPost reportPost; //пожаловаться на пост
    private CommentsInfo commentsInfo; // коменты к посту
}
