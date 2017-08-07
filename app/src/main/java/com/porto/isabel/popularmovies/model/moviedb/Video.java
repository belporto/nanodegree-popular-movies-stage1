package com.porto.isabel.popularmovies.model.moviedb;

import com.google.gson.annotations.SerializedName;

public class Video {

  @SerializedName("id")
  private String id;

  @SerializedName("iso_639_1")
  private String iso6391;

  @SerializedName("iso_3166_1")
  private String iso31661;

  @SerializedName("key")
  private String key;

  @SerializedName("name")
  private String name;

  @SerializedName("site")
  private String site;

  @SerializedName("size")
  private Integer size;

  @SerializedName("type")
  private String type;

}