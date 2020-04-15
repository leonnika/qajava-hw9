package ru.netology.domain.attachment;

public class PreviewInfo {
    private PhotoPreview photo;
    private GraffitiPreview graffiti;
    private AudioMessagePreview audioMessage;

    public PhotoPreview getPhoto() {
        return photo;
    }

    public void setPhoto(PhotoPreview photo) {
        this.photo = photo;
    }

    public GraffitiPreview getGraffiti() {
        return graffiti;
    }

    public void setGraffiti(GraffitiPreview graffiti) {
        this.graffiti = graffiti;
    }

    public AudioMessagePreview getAudioMessage() {
        return audioMessage;
    }

    public void setAudioMessage(AudioMessagePreview audioMessage) {
        this.audioMessage = audioMessage;
    }
}
