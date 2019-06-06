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

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

import java.io.IOException;

/**
 * Codes indicating why a conversation has ended
 */
@JsonAdapter(EndOfConversationCodes.Adapter.class)
public enum EndOfConversationCodes {
  
  UNKNOWN("unknown"),
  
  COMPLETEDSUCCESSFULLY("completedSuccessfully"),
  
  USERCANCELLED("userCancelled"),
  
  BOTTIMEDOUT("botTimedOut"),
  
  BOTISSUEDINVALIDMESSAGE("botIssuedInvalidMessage"),
  
  CHANNELFAILED("channelFailed");

  private String value;

  EndOfConversationCodes(String value) {
    this.value = value;
  }

  public String getValue() {
    return value;
  }

  @Override
  public String toString() {
    return String.valueOf(value);
  }

  public static EndOfConversationCodes fromValue(String text) {
    for (EndOfConversationCodes b : EndOfConversationCodes.values()) {
      if (String.valueOf(b.value).equals(text)) {
        return b;
      }
    }
    return null;
  }

  public static class Adapter extends TypeAdapter<EndOfConversationCodes> {
    @Override
    public void write(final JsonWriter jsonWriter, final EndOfConversationCodes enumeration) throws IOException {
      jsonWriter.value(enumeration.getValue());
    }

    @Override
    public EndOfConversationCodes read(final JsonReader jsonReader) throws IOException {
      String value = jsonReader.nextString();
      return EndOfConversationCodes.fromValue(String.valueOf(value));
    }
  }
}

