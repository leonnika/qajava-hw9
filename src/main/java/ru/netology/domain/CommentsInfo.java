package ru.netology.domain;

public class CommentsInfo {
    private int count; //+количество комментариев;
    private int[] canPost = {0, 1}; //+ информация о том, может ли текущий пользователь комментировать запись
    private int[] groupsCanPost = {0, 1}; //+информация о том, могут ли сообщества комментировать запись;
    private boolean canClose; //+может ли текущий пользователь закрыть комментарии к записи;
    private boolean canOpen; //+ может ли текущий пользователь открыть комментарии к записи
    private int idNumber; //уникальный id номер комментария
    //private String accountNameUrl; //ссылка по имени аккаунта, возвращает на главную страницу
    //private String avatarUrl;// ссылка на аватарку пользователя
    //private DataPost dataPost; //дата и время размещения комментария
    //private String textPost; //текст коментария
    //private int numberLike; //количество лайков

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int[] getCanPost() {
        return canPost;
    }

    public void setCanPost(int[] canPost) {
        this.canPost = canPost;
    }

    public int[] getGroupsCanPost() {
        return groupsCanPost;
    }

    public void setGroupsCanPost(int[] groupsCanPost) {
        this.groupsCanPost = groupsCanPost;
    }

    public boolean isCanClose() {
        return canClose;
    }

    public void setCanClose(boolean canClose) {
        this.canClose = canClose;
    }

    public boolean isCanOpen() {
        return canOpen;
    }

    public void setCanOpen(boolean canOpen) {
        this.canOpen = canOpen;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }
    //private CommentsInfo replyMessage; // объект ответить
}
