package ru.netology.domain;

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
    private int canPin; //+информация о том, может ли текущий пользователь закрепить запись (1 — может, 0 — не может).
    private int canDelete; //+информация о том, может ли текущий пользователь удалить запись (1 — может, 0 — не может).
    private int canEdit; //+информация о том, может ли текущий пользователь редактировать запись (1 — может, 0 — не может).
    private int isPinned; //+информация о том, что запись закреплена
    private int markedAsAds; //+информация о том, содержит ли запись отметку "реклама" (1 — да, 0 — нет).
    private boolean isFavorite; //+true, если объект добавлен в закладки у текущего пользователя.
    private int postponedId; //+идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
    private int dataPost; //дата и время размещения поста
    private String textPostUrl; //ссылка на текст поста
    private RepostPost reportPost; //репост на пост
    private CommentsInfo commentsInfo; // коменты к посту

    public int getIdNumber() {
        return idNumber;
    }

    public void setIdNumber(int idNumber) {
        this.idNumber = idNumber;
    }

    public int getIdOwner() {
        return idOwner;
    }

    public void setIdOwner(int idOwner) {
        this.idOwner = idOwner;
    }

    public int getIdFrom() {
        return idFrom;
    }

    public void setIdFrom(int idFrom) {
        this.idFrom = idFrom;
    }

    public int getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(int createdBy) {
        this.createdBy = createdBy;
    }

    public int getIdReplyOwner() {
        return idReplyOwner;
    }

    public void setIdReplyOwner(int idReplyOwner) {
        this.idReplyOwner = idReplyOwner;
    }

    public int getIdReplyPost() {
        return idReplyPost;
    }

    public void setIdReplyPost(int idReplyPost) {
        this.idReplyPost = idReplyPost;
    }

    public int getFriendsOnly() {
        return friendsOnly;
    }

    public void setFriendsOnly(int friendsOnly) {
        this.friendsOnly = friendsOnly;
    }

    public LikesInfo getLikesInfo() {
        return likesInfo;
    }

    public void setLikesInfo(LikesInfo likesInfo) {
        this.likesInfo = likesInfo;
    }

    public ViewsInfo getViewsInfo() {
        return viewsInfo;
    }

    public void setViewsInfo(ViewsInfo viewsInfo) {
        this.viewsInfo = viewsInfo;
    }

    public String getPostType() {
        return postType;
    }

    public void setPostType(String postType) {
        this.postType = postType;
    }

    public PostSource getPostSource() {
        return postSource;
    }

    public void setPostSource(PostSource postSource) {
        this.postSource = postSource;
    }

    public GeoInfo getGeoInfo() {
        return geoInfo;
    }

    public void setGeoInfo(GeoInfo geoInfo) {
        this.geoInfo = geoInfo;
    }

    public int getSignerId() {
        return signerId;
    }

    public void setSignerId(int signerId) {
        this.signerId = signerId;
    }

    public int getCanPin() {
        return canPin;
    }

    public void setCanPin(int canPin) {
        this.canPin = canPin;
    }

    public int getCanDelete() {
        return canDelete;
    }

    public void setCanDelete(int canDelete) {
        this.canDelete = canDelete;
    }

    public int getCanEdit() {
        return canEdit;
    }

    public void setCanEdit(int canEdit) {
        this.canEdit = canEdit;
    }

    public int getIsPinned() {
        return isPinned;
    }

    public void setIsPinned(int isPinned) {
        this.isPinned = isPinned;
    }

    public int getMarkedAsAds() {
        return markedAsAds;
    }

    public void setMarkedAsAds(int markedAsAds) {
        this.markedAsAds = markedAsAds;
    }

    public boolean isFavorite() {
        return isFavorite;
    }

    public void setFavorite(boolean favorite) {
        isFavorite = favorite;
    }

    public int getPostponedId() {
        return postponedId;
    }

    public void setPostponedId(int postponedId) {
        this.postponedId = postponedId;
    }

    public int getDataPost() {
        return dataPost;
    }

    public void setDataPost(int dataPost) {
        this.dataPost = dataPost;
    }

    public String getTextPostUrl() {
        return textPostUrl;
    }

    public void setTextPostUrl(String textPostUrl) {
        this.textPostUrl = textPostUrl;
    }

    public RepostPost getReportPost() {
        return reportPost;
    }

    public void setReportPost(RepostPost reportPost) {
        this.reportPost = reportPost;
    }

    public CommentsInfo getCommentsInfo() {
        return commentsInfo;
    }

    public void setCommentsInfo(CommentsInfo commentsInfo) {
        this.commentsInfo = commentsInfo;
    }
}
