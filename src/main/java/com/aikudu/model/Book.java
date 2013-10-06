package com.aikudu.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;


public class Book {

  private String id;
  private String name;// 书名
  private List<BookAuthor> authors = new ArrayList<>();// 作者
  private String format;// 版本：平装／精装
  private Integer price;// 9.99表示为999
  private String press;// 出版社
  private String version; // 版本，如第1版
  private Date pubDate;// 出版日期
  private String language;// 语言
  private Integer pages;// 页数
  private Integer size;// 开本
  private String isbn10;
  private String isbn13;
  private String asin;// 亚马逊商品编号
  private String barcode;// 条形码
  private String dimension;// 尺寸
  private String weight;// 重量
  private String brands;// 品牌
  private String cover;// 封面
  private String editorChoice;// 编辑推荐
  private String mediaChoice;// 媒体推荐
  private String description;// 图书描述
  private String category;// 类别：如 /古籍/史库/正史/
  private String series;// 丛书
  private String doubanId;// 豆瓣书籍ID
  private List<String> epubs = new ArrayList<>();// EPUB下载
  private List<String> mobis = new ArrayList<>();// MOBI下载
  private Date created;// 注册时间
  private Date modified;// 最后更新时间

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public List<BookAuthor> getAuthors() {
    return authors;
  }

  public void setAuthors(List<BookAuthor> authors) {
    this.authors = authors;
  }

  public String getFormat() {
    return format;
  }

  public void setFormat(String format) {
    this.format = format;
  }

  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public String getPress() {
    return press;
  }

  public void setPress(String press) {
    this.press = press;
  }

  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public Date getPubDate() {
    return pubDate;
  }

  public void setPubDate(Date pubDate) {
    this.pubDate = pubDate;
  }

  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public Integer getPages() {
    return pages;
  }

  public void setPages(Integer pages) {
    this.pages = pages;
  }

  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public String getIsbn10() {
    return isbn10;
  }

  public void setIsbn10(String isbn10) {
    this.isbn10 = isbn10;
  }

  public String getIsbn13() {
    return isbn13;
  }

  public void setIsbn13(String isbn13) {
    this.isbn13 = isbn13;
  }

  public String getAsin() {
    return asin;
  }

  public void setAsin(String asin) {
    this.asin = asin;
  }

  public String getBarcode() {
    return barcode;
  }

  public void setBarcode(String barcode) {
    this.barcode = barcode;
  }

  public String getDimension() {
    return dimension;
  }

  public void setDimension(String dimension) {
    this.dimension = dimension;
  }

  public String getWeight() {
    return weight;
  }

  public void setWeight(String weight) {
    this.weight = weight;
  }

  public String getBrands() {
    return brands;
  }

  public void setBrands(String brands) {
    this.brands = brands;
  }

  public String getCover() {
    return cover;
  }

  public void setCover(String cover) {
    this.cover = cover;
  }

  public String getEditorChoice() {
    return editorChoice;
  }

  public void setEditorChoice(String editorChoice) {
    this.editorChoice = editorChoice;
  }

  public String getMediaChoice() {
    return mediaChoice;
  }

  public void setMediaChoice(String mediaChoice) {
    this.mediaChoice = mediaChoice;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getCategory() {
    return category;
  }

  public void setCategory(String category) {
    this.category = category;
  }

  public String getSeries() {
    return series;
  }

  public void setSeries(String series) {
    this.series = series;
  }

  public String getDoubanId() {
    return doubanId;
  }

  public void setDoubanId(String doubanId) {
    this.doubanId = doubanId;
  }

  public List<String> getEpubs() {
    return epubs;
  }

  public void setEpubs(List<String> epubs) {
    this.epubs = epubs;
  }

  public List<String> getMobis() {
    return mobis;
  }

  public void setMobis(List<String> mobis) {
    this.mobis = mobis;
  }

  public Date getCreated() {
    return created;
  }

  public void setCreated(Date created) {
    this.created = created;
  }

  public Date getModified() {
    return modified;
  }

  public void setModified(Date modified) {
    this.modified = modified;
  }
}
