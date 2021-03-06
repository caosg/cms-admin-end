/**
 * This class is generated by jOOQ
 */
package diamond.cms.server.model.jooq.tables.records;


import diamond.cms.server.model.jooq.tables.CGuest;
import diamond.cms.server.model.jooq.tables.interfaces.ICGuest;

import java.sql.Timestamp;

import javax.annotation.Generated;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.jooq.Field;
import org.jooq.Record1;
import org.jooq.Record7;
import org.jooq.Row7;
import org.jooq.impl.UpdatableRecordImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.6"
    },
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CGuestRecord extends UpdatableRecordImpl<CGuestRecord> implements Record7<String, String, Timestamp, Timestamp, String, String, String>, ICGuest {

    private static final long serialVersionUID = -1730474538;

    /**
     * Setter for <code>cms.c_guest.id</code>.
     */
    @Override
    public void setId(String value) {
        set(0, value);
    }

    /**
     * Getter for <code>cms.c_guest.id</code>.
     */
    @NotNull
    @Size(max = 40)
    @Override
    public String getId() {
        return (String) get(0);
    }

    /**
     * Setter for <code>cms.c_guest.email</code>.
     */
    @Override
    public void setEmail(String value) {
        set(1, value);
    }

    /**
     * Getter for <code>cms.c_guest.email</code>.
     */
    @NotNull
    @Size(max = 100)
    @Override
    public String getEmail() {
        return (String) get(1);
    }

    /**
     * Setter for <code>cms.c_guest.create_time</code>.
     */
    @Override
    public void setCreateTime(Timestamp value) {
        set(2, value);
    }

    /**
     * Getter for <code>cms.c_guest.create_time</code>.
     */
    @Override
    public Timestamp getCreateTime() {
        return (Timestamp) get(2);
    }

    /**
     * Setter for <code>cms.c_guest.login_time</code>.
     */
    @Override
    public void setLoginTime(Timestamp value) {
        set(3, value);
    }

    /**
     * Getter for <code>cms.c_guest.login_time</code>.
     */
    @Override
    public Timestamp getLoginTime() {
        return (Timestamp) get(3);
    }

    /**
     * Setter for <code>cms.c_guest.third_data</code>.
     */
    @Override
    public void setThirdData(String value) {
        set(4, value);
    }

    /**
     * Getter for <code>cms.c_guest.third_data</code>.
     */
    @Size(max = 65535)
    @Override
    public String getThirdData() {
        return (String) get(4);
    }

    /**
     * Setter for <code>cms.c_guest.nickname</code>.
     */
    @Override
    public void setNickname(String value) {
        set(5, value);
    }

    /**
     * Getter for <code>cms.c_guest.nickname</code>.
     */
    @Size(max = 255)
    @Override
    public String getNickname() {
        return (String) get(5);
    }

    /**
     * Setter for <code>cms.c_guest.avatar</code>.
     */
    @Override
    public void setAvatar(String value) {
        set(6, value);
    }

    /**
     * Getter for <code>cms.c_guest.avatar</code>.
     */
    @Size(max = 180)
    @Override
    public String getAvatar() {
        return (String) get(6);
    }

    // -------------------------------------------------------------------------
    // Primary key information
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Record1<String> key() {
        return (Record1) super.key();
    }

    // -------------------------------------------------------------------------
    // Record7 type implementation
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Timestamp, Timestamp, String, String, String> fieldsRow() {
        return (Row7) super.fieldsRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Row7<String, String, Timestamp, Timestamp, String, String, String> valuesRow() {
        return (Row7) super.valuesRow();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field1() {
        return CGuest.C_GUEST.ID;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field2() {
        return CGuest.C_GUEST.EMAIL;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field3() {
        return CGuest.C_GUEST.CREATE_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<Timestamp> field4() {
        return CGuest.C_GUEST.LOGIN_TIME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field5() {
        return CGuest.C_GUEST.THIRD_DATA;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field6() {
        return CGuest.C_GUEST.NICKNAME;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Field<String> field7() {
        return CGuest.C_GUEST.AVATAR;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value1() {
        return getId();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value2() {
        return getEmail();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value3() {
        return getCreateTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Timestamp value4() {
        return getLoginTime();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value5() {
        return getThirdData();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value6() {
        return getNickname();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public String value7() {
        return getAvatar();
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord value1(String value) {
        setId(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord value2(String value) {
        setEmail(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord value3(Timestamp value) {
        setCreateTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord value4(Timestamp value) {
        setLoginTime(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord value5(String value) {
        setThirdData(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord value6(String value) {
        setNickname(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord value7(String value) {
        setAvatar(value);
        return this;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public CGuestRecord values(String value1, String value2, Timestamp value3, Timestamp value4, String value5, String value6, String value7) {
        value1(value1);
        value2(value2);
        value3(value3);
        value4(value4);
        value5(value5);
        value6(value6);
        value7(value7);
        return this;
    }

    // -------------------------------------------------------------------------
    // FROM and INTO
    // -------------------------------------------------------------------------

    /**
     * {@inheritDoc}
     */
    @Override
    public void from(ICGuest from) {
        setId(from.getId());
        setEmail(from.getEmail());
        setCreateTime(from.getCreateTime());
        setLoginTime(from.getLoginTime());
        setThirdData(from.getThirdData());
        setNickname(from.getNickname());
        setAvatar(from.getAvatar());
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public <E extends ICGuest> E into(E into) {
        into.from(this);
        return into;
    }

    // -------------------------------------------------------------------------
    // Constructors
    // -------------------------------------------------------------------------

    /**
     * Create a detached CGuestRecord
     */
    public CGuestRecord() {
        super(CGuest.C_GUEST);
    }

    /**
     * Create a detached, initialised CGuestRecord
     */
    public CGuestRecord(String id, String email, Timestamp createTime, Timestamp loginTime, String thirdData, String nickname, String avatar) {
        super(CGuest.C_GUEST);

        set(0, id);
        set(1, email);
        set(2, createTime);
        set(3, loginTime);
        set(4, thirdData);
        set(5, nickname);
        set(6, avatar);
    }
}
