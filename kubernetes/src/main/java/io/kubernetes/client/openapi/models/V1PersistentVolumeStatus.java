/*
 * Kubernetes
 * No description provided (generated by Openapi Generator https://github.com/openapitools/openapi-generator)
 *
 * The version of the OpenAPI document: v1.15.7
 * 
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */


package io.kubernetes.client.openapi.models;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * PersistentVolumeStatus is the current status of a persistent volume.
 */
@ApiModel(description = "PersistentVolumeStatus is the current status of a persistent volume.")
@javax.annotation.Generated(value = "org.openapitools.codegen.languages.JavaClientCodegen", date = "2019-11-28T14:07:30.308Z[Etc/UTC]")
public class V1PersistentVolumeStatus {
  public static final String SERIALIZED_NAME_MESSAGE = "message";
  @SerializedName(SERIALIZED_NAME_MESSAGE)
  private String message;

  public static final String SERIALIZED_NAME_PHASE = "phase";
  @SerializedName(SERIALIZED_NAME_PHASE)
  private String phase;

  public static final String SERIALIZED_NAME_REASON = "reason";
  @SerializedName(SERIALIZED_NAME_REASON)
  private String reason;


  public V1PersistentVolumeStatus message(String message) {
    
    this.message = message;
    return this;
  }

   /**
   * A human-readable message indicating details about why the volume is in this state.
   * @return message
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "A human-readable message indicating details about why the volume is in this state.")

  public String getMessage() {
    return message;
  }


  public void setMessage(String message) {
    this.message = message;
  }


  public V1PersistentVolumeStatus phase(String phase) {
    
    this.phase = phase;
    return this;
  }

   /**
   * Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase
   * @return phase
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Phase indicates if a volume is available, bound to a claim, or released by a claim. More info: https://kubernetes.io/docs/concepts/storage/persistent-volumes#phase")

  public String getPhase() {
    return phase;
  }


  public void setPhase(String phase) {
    this.phase = phase;
  }


  public V1PersistentVolumeStatus reason(String reason) {
    
    this.reason = reason;
    return this;
  }

   /**
   * Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.
   * @return reason
  **/
  @javax.annotation.Nullable
  @ApiModelProperty(value = "Reason is a brief CamelCase string that describes any failure and is meant for machine parsing and tidy display in the CLI.")

  public String getReason() {
    return reason;
  }


  public void setReason(String reason) {
    this.reason = reason;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    V1PersistentVolumeStatus v1PersistentVolumeStatus = (V1PersistentVolumeStatus) o;
    return Objects.equals(this.message, v1PersistentVolumeStatus.message) &&
        Objects.equals(this.phase, v1PersistentVolumeStatus.phase) &&
        Objects.equals(this.reason, v1PersistentVolumeStatus.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(message, phase, reason);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class V1PersistentVolumeStatus {\n");
    sb.append("    message: ").append(toIndentedString(message)).append("\n");
    sb.append("    phase: ").append(toIndentedString(phase)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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
