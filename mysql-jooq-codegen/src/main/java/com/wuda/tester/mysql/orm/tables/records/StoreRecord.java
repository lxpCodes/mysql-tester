/*
 * This file is generated by jOOQ.
 */
package com.wuda.tester.mysql.orm.tables.records;


import com.wuda.tester.mysql.orm.tables.Store;

import java.time.LocalDateTime;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record9;
import org.jooq.Row9;
import org.jooq.impl.UpdatableRecordImpl;
import org.jooq.types.UByte;
import org.jooq.types.ULong;


/**
 * 店铺信息
 */
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class StoreRecord extends UpdatableRecordImpl<StoreRecord> implements Record9<ULong, ULong, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> {

    private static final long serialVersionUID = 1691008573;

    /**
     * Setter for <code>mysql_tester.store.store_id</code>.
     */
    public void setStoreId(ULong value) {
        set(0, value);
    }

    /**
     * Getter for <code>mysql_tester.store.store_id</code>.
     */
    public ULong getStoreId() {
        return (ULong) get(0);
    }

    /**
     * Setter for <code>mysql_tester.store.user_id</code>. 所属用户ID
     */
    public void setUserId(ULong value) {
        set(1, value);
    }

    /**
     * Getter for <code>mysql_tester.store.user_id</code>. 所属用户ID
     */
    public ULong getUserId() {
        return (ULong) get(1);
    }

    /**
     * Setter for <code>mysql_tester.store.type</code>. 店铺类型
     */
    public void setType(UByte value) {
        set(2, value);
    }

    /**
     * Getter for <code>mysql_tester.store.type</code>. 店铺类型
     */
    public UByte getType() {
        return (UByte) get(2);
    }

    /**
     * Setter for <code>mysql_tester.store.status</code>.
     */
    public void setStatus(UByte value) {
        set(3, value);
    }

    /**
     * Getter for <code>mysql_tester.store.status</code>.
     */
    public UByte getStatus() {
        return (UByte) get(3);
    }

    /**
     * Setter for <code>mysql_tester.store.create_time</code>.
     */
    public void setCreateTime(LocalDateTime value) {
        set(4, value);
    }

    /**
     * Getter for <code>mysql_tester.store.create_time</code>.
     */
    public LocalDateTime getCreateTime() {
        return (LocalDateTime) get(4);
    }

    /**
     * Setter for <code>mysql_tester.store.create_user_id</code>.
     */
    public void setCreateUserId(ULong value) {
        set(5, value);
    }

    /**
     * Getter for <code>mysql_tester.store.create_user_id</code>.
     */
    public ULong getCreateUserId() {
        return (ULong) get(5);
    }

    /**
     * Setter for <code>mysql_tester.store.last_modify_time</code>.
     */
    public void setLastModifyTime(LocalDateTime value) {
        set(6, value);
    }

    /**
     * Getter for <code>mysql_tester.store.last_modify_time</code>.
     */
    public LocalDateTime getLastModifyTime() {
        return (LocalDateTime) get(6);
    }

    /**
     * Setter for <code>mysql_tester.store.last_modify_user_id</code>.
     */
    public void setLastModifyUserId(ULong value) {
        set(7, value);
    }

    /**
     * Getter for <code>mysql_tester.store.last_modify_user_id</code>.
     */
    public ULong getLastModifyUserId() {
        return (ULong) get(7);
    }

    /**
     * Setter for <code>mysql_tester.store.is_deleted</code>.
     */
    public void setIsDeleted(ULong value) {
        set(8, value);
    }

    /**
     * Getter for <code>mysql_tester.store.is_deleted</code>.
     */
    public ULong getIsDeleted() {
        return (ULong) get(8);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    @Override
    public Record1<ULong> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record9 type implementation
    // -------------------------------------------------------------------------

    @Override
    public Row9<ULong, ULong, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> fieldsRow() {
        return (Row9) super.fieldsRow();
    }

    @Override
    public Row9<ULong, ULong, UByte, UByte, LocalDateTime, ULong, LocalDateTime, ULong, ULong> valuesRow() {
        return (Row9) super.valuesRow();
    }

    @Override
    public Field<ULong> field1() {
        return Store.STORE.STORE_ID;
    }

    @Override
    public Field<ULong> field2() {
        return Store.STORE.USER_ID;
    }

    @Override
    public Field<UByte> field3() {
        return Store.STORE.TYPE;
    }

    @Override
    public Field<UByte> field4() {
        return Store.STORE.STATUS;
    }

    @Override
    public Field<LocalDateTime> field5() {
        return Store.STORE.CREATE_TIME;
    }

    @Override
    public Field<ULong> field6() {
        return Store.STORE.CREATE_USER_ID;
    }

    @Override
    public Field<LocalDateTime> field7() {
        return Store.STORE.LAST_MODIFY_TIME;
    }

    @Override
    public Field<ULong> field8() {
        return Store.STORE.LAST_MODIFY_USER_ID;
    }

    @Override
    public Field<ULong> field9() {
        return Store.STORE.IS_DELETED;
    }

    @Override
    public ULong component1() {
        return getStoreId();
    }

    @Override
    public ULong component2() {
        return getUserId();
    }

    @Override
    public UByte component3() {
        return getType();
    }

    @Override
    public UByte component4() {
        return getStatus();
    }

    @Override
    public LocalDateTime component5() {
        return getCreateTime();
    }

    @Override
    public ULong component6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime component7() {
        return getLastModifyTime();
    }

    @Override
    public ULong component8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong component9() {
        return getIsDeleted();
    }

    @Override
    public ULong value1() {
        return getStoreId();
    }

    @Override
    public ULong value2() {
        return getUserId();
    }

    @Override
    public UByte value3() {
        return getType();
    }

    @Override
    public UByte value4() {
        return getStatus();
    }

    @Override
    public LocalDateTime value5() {
        return getCreateTime();
    }

    @Override
    public ULong value6() {
        return getCreateUserId();
    }

    @Override
    public LocalDateTime value7() {
        return getLastModifyTime();
    }

    @Override
    public ULong value8() {
        return getLastModifyUserId();
    }

    @Override
    public ULong value9() {
        return getIsDeleted();
    }

    @Override
    public StoreRecord value1(ULong value) {
        setStoreId(value);
        return this;
    }

    @Override
    public StoreRecord value2(ULong value) {
        setUserId(value);
        return this;
    }

    @Override
    public StoreRecord value3(UByte value) {
        setType(value);
        return this;
    }

    @Override
    public StoreRecord value4(UByte value) {
        setStatus(value);
        return this;
    }

    @Override
    public StoreRecord value5(LocalDateTime value) {
        setCreateTime(value);
        return this;
    }

    @Override
    public StoreRecord value6(ULong value) {
        setCreateUserId(value);
        return this;
    }

    @Override
    public StoreRecord value7(LocalDateTime value) {
        setLastModifyTime(value);
        return this;
    }

    @Override
    public StoreRecord value8(ULong value) {
        setLastModifyUserId(value);
        return this;
    }

    @Override
    public StoreRecord value9(ULong value) {
        setIsDeleted(value);
        return this;
    }

    @Override
    public StoreRecord values(ULong value1, ULong value2, UByte value3, UByte value4, LocalDateTime value5, ULong value6, LocalDateTime value7, ULong value8, ULong value9) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        value8(value8);
        value9(value9);
        return this;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached StoreRecord
     */
    public StoreRecord() {
        super(Store.STORE);
    }

    /**
     * Create a detached, initialised StoreRecord
     */
    public StoreRecord(ULong storeId, ULong userId, UByte type, UByte status, LocalDateTime createTime, ULong createUserId, LocalDateTime lastModifyTime, ULong lastModifyUserId, ULong isDeleted) {
        super(Store.STORE);

        set(0, storeId);
        set(1, userId);
        set(2, type);
        set(3, status);
        set(4, createTime);
        set(5, createUserId);
        set(6, lastModifyTime);
        set(7, lastModifyUserId);
        set(8, isDeleted);
    }
}
