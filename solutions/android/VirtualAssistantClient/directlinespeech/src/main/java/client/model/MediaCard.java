/*
 * Microsoft Bot Connector API - v3.0
 * The Bot Connector REST API allows your bot to send and receive messages to channels configured in the  [Bot Framework Developer Portal](https://dev.botframework.com). The Connector service uses industry-standard REST  and JSON over HTTPS.    Client libraries for this REST API are available. See below for a list.    Many bots will use both the Bot Connector REST API and the associated [Bot State REST API](/en-us/restapi/state). The  Bot State REST API allows a bot to store and retrieve state associated with users and conversations.    Authentication for both the Bot Connector and Bot State REST APIs is accomplished with JWT Bearer tokens, and is  described in detail in the [Connector Authentication](/en-us/restapi/authentication) document.    # Client Libraries for the Bot Connector REST API    * [Bot Builder for C#](/en-us/csharp/builder/sdkreference/)  * [Bot Builder for Node.js](/en-us/node/builder/overview/)  * Generate your own from the [Connector API Swagger file](https://raw.githubusercontent.com/Microsoft/BotBuilder/master/CSharp/Library/Microsoft.Bot.Connector.Shared/Swagger/ConnectorAPI.json)    � 2016 Microsoft
 *
 * OpenAPI spec version: v3
 * Contact: botframework@microsoft.com
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

/**
 * Media card
 */
@ApiModel(description = "Media card")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-29T10:06:15.114-07:00")
public class MediaCard {
  @SerializedName("title")
  private String title = null;

  @SerializedName("subtitle")
  private String subtitle = null;

  @SerializedName("text")
  private String text = null;

  @SerializedName("image")
  private ThumbnailUrl image = null;

  @SerializedName("media")
  private List<MediaUrl> media = null;

  @SerializedName("buttons")
  private List<CardAction> buttons = null;

  @SerializedName("shareable")
  private Boolean shareable = null;

  @SerializedName("autoloop")
  private Boolean autoloop = null;

  @SerializedName("autostart")
  private Boolean autostart = null;

  @SerializedName("aspect")
  private String aspect = null;

  @SerializedName("value")
  private Object value = null;

  public MediaCard title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title of this card
   * @return title
  **/
  @ApiModelProperty(value = "Title of this card")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public MediaCard subtitle(String subtitle) {
    this.subtitle = subtitle;
    return this;
  }

   /**
   * Subtitle of this card
   * @return subtitle
  **/
  @ApiModelProperty(value = "Subtitle of this card")
  public String getSubtitle() {
    return subtitle;
  }

  public void setSubtitle(String subtitle) {
    this.subtitle = subtitle;
  }

  public MediaCard text(String text) {
    this.text = text;
    return this;
  }

   /**
   * Text of this card
   * @return text
  **/
  @ApiModelProperty(value = "Text of this card")
  public String getText() {
    return text;
  }

  public void setText(String text) {
    this.text = text;
  }

  public MediaCard image(ThumbnailUrl image) {
    this.image = image;
    return this;
  }

   /**
   * Thumbnail placeholder
   * @return image
  **/
  @ApiModelProperty(value = "Thumbnail placeholder")
  public ThumbnailUrl getImage() {
    return image;
  }

  public void setImage(ThumbnailUrl image) {
    this.image = image;
  }

  public MediaCard media(List<MediaUrl> media) {
    this.media = media;
    return this;
  }

  public MediaCard addMediaItem(MediaUrl mediaItem) {
    if (this.media == null) {
      this.media = new ArrayList<MediaUrl>();
    }
    this.media.add(mediaItem);
    return this;
  }

   /**
   * Media URLs for this card
   * @return media
  **/
  @ApiModelProperty(value = "Media URLs for this card")
  public List<MediaUrl> getMedia() {
    return media;
  }

  public void setMedia(List<MediaUrl> media) {
    this.media = media;
  }

  public MediaCard buttons(List<CardAction> buttons) {
    this.buttons = buttons;
    return this;
  }

  public MediaCard addButtonsItem(CardAction buttonsItem) {
    if (this.buttons == null) {
      this.buttons = new ArrayList<CardAction>();
    }
    this.buttons.add(buttonsItem);
    return this;
  }

   /**
   * Actions on this card
   * @return buttons
  **/
  @ApiModelProperty(value = "Actions on this card")
  public List<CardAction> getButtons() {
    return buttons;
  }

  public void setButtons(List<CardAction> buttons) {
    this.buttons = buttons;
  }

  public MediaCard shareable(Boolean shareable) {
    this.shareable = shareable;
    return this;
  }

   /**
   * This content may be shared with others (default:true)
   * @return shareable
  **/
  @ApiModelProperty(value = "This content may be shared with others (default:true)")
  public Boolean isShareable() {
    return shareable;
  }

  public void setShareable(Boolean shareable) {
    this.shareable = shareable;
  }

  public MediaCard autoloop(Boolean autoloop) {
    this.autoloop = autoloop;
    return this;
  }

   /**
   * Should the client loop playback at end of content (default:true)
   * @return autoloop
  **/
  @ApiModelProperty(value = "Should the client loop playback at end of content (default:true)")
  public Boolean isAutoloop() {
    return autoloop;
  }

  public void setAutoloop(Boolean autoloop) {
    this.autoloop = autoloop;
  }

  public MediaCard autostart(Boolean autostart) {
    this.autostart = autostart;
    return this;
  }

   /**
   * Should the client automatically start playback of media in this card (default:true)
   * @return autostart
  **/
  @ApiModelProperty(value = "Should the client automatically start playback of media in this card (default:true)")
  public Boolean isAutostart() {
    return autostart;
  }

  public void setAutostart(Boolean autostart) {
    this.autostart = autostart;
  }

  public MediaCard aspect(String aspect) {
    this.aspect = aspect;
    return this;
  }

   /**
   * Aspect ratio of thumbnail/media placeholder, allowed values are \&quot;16:9\&quot; and \&quot;4:3\&quot;
   * @return aspect
  **/
  @ApiModelProperty(value = "Aspect ratio of thumbnail/media placeholder, allowed values are \"16:9\" and \"4:3\"")
  public String getAspect() {
    return aspect;
  }

  public void setAspect(String aspect) {
    this.aspect = aspect;
  }

  public MediaCard value(Object value) {
    this.value = value;
    return this;
  }

   /**
   * Supplementary parameter for this card
   * @return value
  **/
  @ApiModelProperty(value = "Supplementary parameter for this card")
  public Object getValue() {
    return value;
  }

  public void setValue(Object value) {
    this.value = value;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MediaCard mediaCard = (MediaCard) o;
    return Objects.equals(this.title, mediaCard.title) &&
        Objects.equals(this.subtitle, mediaCard.subtitle) &&
        Objects.equals(this.text, mediaCard.text) &&
        Objects.equals(this.image, mediaCard.image) &&
        Objects.equals(this.media, mediaCard.media) &&
        Objects.equals(this.buttons, mediaCard.buttons) &&
        Objects.equals(this.shareable, mediaCard.shareable) &&
        Objects.equals(this.autoloop, mediaCard.autoloop) &&
        Objects.equals(this.autostart, mediaCard.autostart) &&
        Objects.equals(this.aspect, mediaCard.aspect) &&
        Objects.equals(this.value, mediaCard.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(title, subtitle, text, image, media, buttons, shareable, autoloop, autostart, aspect, value);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MediaCard {\n");

    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    subtitle: ").append(toIndentedString(subtitle)).append("\n");
    sb.append("    text: ").append(toIndentedString(text)).append("\n");
    sb.append("    image: ").append(toIndentedString(image)).append("\n");
    sb.append("    media: ").append(toIndentedString(media)).append("\n");
    sb.append("    buttons: ").append(toIndentedString(buttons)).append("\n");
    sb.append("    shareable: ").append(toIndentedString(shareable)).append("\n");
    sb.append("    autoloop: ").append(toIndentedString(autoloop)).append("\n");
    sb.append("    autostart: ").append(toIndentedString(autostart)).append("\n");
    sb.append("    aspect: ").append(toIndentedString(aspect)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }

}

