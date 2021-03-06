package jp.co.systena.webjava.dao.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * The Class OrderHistory.
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class OrderHistory implements Serializable {

  /** The order no. */
  @Id
  @GeneratedValue(strategy = GenerationType.AUTO)
  @Column(name = "order_no", nullable = false)
  private int orderNo;

  /** The client no. */
  @Column(name = "client_no", nullable = false)
  private int clientNo;

  /** The item no. */
  @Column(name = "item_no", nullable = false)
  private int itemNo;

  /** The item name. */
  @Column(name = "item_name", nullable = false)
  private String itemName;

  /** The item type. */
  @Column(name = "item_type", nullable = false)
  private String itemType;

  /** The item price. */
  @Column(name = "item_price", nullable = false)
  private int itemPrice;

  /** The item count. */
  @Column(name = "item_count", nullable = false)
  private int itemCount;

  /** The create datetime. */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
  @Column(name = "create_datetime", nullable = false)
  private Timestamp createDatetime;

  /** The update datetime. */
  @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss", timezone = "Asia/Tokyo")
  @Column(name = "update_datetime", nullable = false)
  private Timestamp updateDatetime;

  /** The del flg. */
  @Column(name = "del_flg", nullable = false)
  private String delFlg;
}