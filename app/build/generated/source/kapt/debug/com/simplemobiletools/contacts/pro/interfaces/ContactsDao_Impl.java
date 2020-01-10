package com.simplemobiletools.contacts.pro.interfaces;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.room.util.StringUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.simplemobiletools.contacts.pro.helpers.Converters;
import com.simplemobiletools.contacts.pro.models.Address;
import com.simplemobiletools.contacts.pro.models.Email;
import com.simplemobiletools.contacts.pro.models.Event;
import com.simplemobiletools.contacts.pro.models.IM;
import com.simplemobiletools.contacts.pro.models.LocalContact;
import com.simplemobiletools.contacts.pro.models.PhoneNumber;
import java.lang.Integer;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.StringBuilder;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class ContactsDao_Impl implements ContactsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<LocalContact> __insertionAdapterOfLocalContact;

  private final Converters __converters = new Converters();

  private final SharedSQLiteStatement __preparedStmtOfUpdateStarred;

  private final SharedSQLiteStatement __preparedStmtOfDeleteContactId;

  public ContactsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfLocalContact = new EntityInsertionAdapter<LocalContact>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `contacts` (`id`,`prefix`,`first_name`,`middle_name`,`surname`,`suffix`,`nickname`,`photo`,`phone_numbers`,`emails`,`events`,`starred`,`addresses`,`notes`,`groups`,`company`,`job_position`,`websites`,`ims`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, LocalContact value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getPrefix() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getPrefix());
        }
        if (value.getFirstName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getFirstName());
        }
        if (value.getMiddleName() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getMiddleName());
        }
        if (value.getSurname() == null) {
          stmt.bindNull(5);
        } else {
          stmt.bindString(5, value.getSurname());
        }
        if (value.getSuffix() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getSuffix());
        }
        if (value.getNickname() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNickname());
        }
        if (value.getPhoto() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindBlob(8, value.getPhoto());
        }
        final String _tmp;
        _tmp = __converters.phoneNumberListToJson(value.getPhoneNumbers());
        if (_tmp == null) {
          stmt.bindNull(9);
        } else {
          stmt.bindString(9, _tmp);
        }
        final String _tmp_1;
        _tmp_1 = __converters.emailListToJson(value.getEmails());
        if (_tmp_1 == null) {
          stmt.bindNull(10);
        } else {
          stmt.bindString(10, _tmp_1);
        }
        final String _tmp_2;
        _tmp_2 = __converters.eventListToJson(value.getEvents());
        if (_tmp_2 == null) {
          stmt.bindNull(11);
        } else {
          stmt.bindString(11, _tmp_2);
        }
        stmt.bindLong(12, value.getStarred());
        final String _tmp_3;
        _tmp_3 = __converters.addressListToJson(value.getAddresses());
        if (_tmp_3 == null) {
          stmt.bindNull(13);
        } else {
          stmt.bindString(13, _tmp_3);
        }
        if (value.getNotes() == null) {
          stmt.bindNull(14);
        } else {
          stmt.bindString(14, value.getNotes());
        }
        final String _tmp_4;
        _tmp_4 = __converters.longListToJson(value.getGroups());
        if (_tmp_4 == null) {
          stmt.bindNull(15);
        } else {
          stmt.bindString(15, _tmp_4);
        }
        if (value.getCompany() == null) {
          stmt.bindNull(16);
        } else {
          stmt.bindString(16, value.getCompany());
        }
        if (value.getJobPosition() == null) {
          stmt.bindNull(17);
        } else {
          stmt.bindString(17, value.getJobPosition());
        }
        final String _tmp_5;
        _tmp_5 = __converters.stringListToJson(value.getWebsites());
        if (_tmp_5 == null) {
          stmt.bindNull(18);
        } else {
          stmt.bindString(18, _tmp_5);
        }
        final String _tmp_6;
        _tmp_6 = __converters.IMsListToJson(value.getIMs());
        if (_tmp_6 == null) {
          stmt.bindNull(19);
        } else {
          stmt.bindString(19, _tmp_6);
        }
      }
    };
    this.__preparedStmtOfUpdateStarred = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "UPDATE contacts SET starred = ? WHERE id = ?";
        return _query;
      }
    };
    this.__preparedStmtOfDeleteContactId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM contacts WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insertOrUpdate(final LocalContact contact) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfLocalContact.insertAndReturnId(contact);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void updateStarred(final int isStarred, final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfUpdateStarred.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, isStarred);
    _argIndex = 2;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfUpdateStarred.release(_stmt);
    }
  }

  @Override
  public void deleteContactId(final int id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteContactId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteContactId.release(_stmt);
    }
  }

  @Override
  public List<LocalContact> getContacts() {
    final String _sql = "SELECT * FROM contacts";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPrefix = CursorUtil.getColumnIndexOrThrow(_cursor, "prefix");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "first_name");
      final int _cursorIndexOfMiddleName = CursorUtil.getColumnIndexOrThrow(_cursor, "middle_name");
      final int _cursorIndexOfSurname = CursorUtil.getColumnIndexOrThrow(_cursor, "surname");
      final int _cursorIndexOfSuffix = CursorUtil.getColumnIndexOrThrow(_cursor, "suffix");
      final int _cursorIndexOfNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "nickname");
      final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
      final int _cursorIndexOfPhoneNumbers = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_numbers");
      final int _cursorIndexOfEmails = CursorUtil.getColumnIndexOrThrow(_cursor, "emails");
      final int _cursorIndexOfEvents = CursorUtil.getColumnIndexOrThrow(_cursor, "events");
      final int _cursorIndexOfStarred = CursorUtil.getColumnIndexOrThrow(_cursor, "starred");
      final int _cursorIndexOfAddresses = CursorUtil.getColumnIndexOrThrow(_cursor, "addresses");
      final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
      final int _cursorIndexOfGroups = CursorUtil.getColumnIndexOrThrow(_cursor, "groups");
      final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
      final int _cursorIndexOfJobPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "job_position");
      final int _cursorIndexOfWebsites = CursorUtil.getColumnIndexOrThrow(_cursor, "websites");
      final int _cursorIndexOfIMs = CursorUtil.getColumnIndexOrThrow(_cursor, "ims");
      final List<LocalContact> _result = new ArrayList<LocalContact>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final LocalContact _item;
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpPrefix;
        _tmpPrefix = _cursor.getString(_cursorIndexOfPrefix);
        final String _tmpFirstName;
        _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        final String _tmpMiddleName;
        _tmpMiddleName = _cursor.getString(_cursorIndexOfMiddleName);
        final String _tmpSurname;
        _tmpSurname = _cursor.getString(_cursorIndexOfSurname);
        final String _tmpSuffix;
        _tmpSuffix = _cursor.getString(_cursorIndexOfSuffix);
        final String _tmpNickname;
        _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
        final byte[] _tmpPhoto;
        _tmpPhoto = _cursor.getBlob(_cursorIndexOfPhoto);
        final ArrayList<PhoneNumber> _tmpPhoneNumbers;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfPhoneNumbers);
        _tmpPhoneNumbers = __converters.jsonToPhoneNumberList(_tmp);
        final ArrayList<Email> _tmpEmails;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfEmails);
        _tmpEmails = __converters.jsonToEmailList(_tmp_1);
        final ArrayList<Event> _tmpEvents;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfEvents);
        _tmpEvents = __converters.jsonToEventList(_tmp_2);
        final int _tmpStarred;
        _tmpStarred = _cursor.getInt(_cursorIndexOfStarred);
        final ArrayList<Address> _tmpAddresses;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfAddresses);
        _tmpAddresses = __converters.jsonToAddressList(_tmp_3);
        final String _tmpNotes;
        _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
        final ArrayList<Long> _tmpGroups;
        final String _tmp_4;
        _tmp_4 = _cursor.getString(_cursorIndexOfGroups);
        _tmpGroups = __converters.jsonToLongList(_tmp_4);
        final String _tmpCompany;
        _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
        final String _tmpJobPosition;
        _tmpJobPosition = _cursor.getString(_cursorIndexOfJobPosition);
        final ArrayList<String> _tmpWebsites;
        final String _tmp_5;
        _tmp_5 = _cursor.getString(_cursorIndexOfWebsites);
        _tmpWebsites = __converters.jsonToStringList(_tmp_5);
        final ArrayList<IM> _tmpIMs;
        final String _tmp_6;
        _tmp_6 = _cursor.getString(_cursorIndexOfIMs);
        _tmpIMs = __converters.jsonToIMsList(_tmp_6);
        _item = new LocalContact(_tmpId,_tmpPrefix,_tmpFirstName,_tmpMiddleName,_tmpSurname,_tmpSuffix,_tmpNickname,_tmpPhoto,_tmpPhoneNumbers,_tmpEmails,_tmpEvents,_tmpStarred,_tmpAddresses,_tmpNotes,_tmpGroups,_tmpCompany,_tmpJobPosition,_tmpWebsites,_tmpIMs);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public LocalContact getContactWithId(final int id) {
    final String _sql = "SELECT * FROM contacts WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfPrefix = CursorUtil.getColumnIndexOrThrow(_cursor, "prefix");
      final int _cursorIndexOfFirstName = CursorUtil.getColumnIndexOrThrow(_cursor, "first_name");
      final int _cursorIndexOfMiddleName = CursorUtil.getColumnIndexOrThrow(_cursor, "middle_name");
      final int _cursorIndexOfSurname = CursorUtil.getColumnIndexOrThrow(_cursor, "surname");
      final int _cursorIndexOfSuffix = CursorUtil.getColumnIndexOrThrow(_cursor, "suffix");
      final int _cursorIndexOfNickname = CursorUtil.getColumnIndexOrThrow(_cursor, "nickname");
      final int _cursorIndexOfPhoto = CursorUtil.getColumnIndexOrThrow(_cursor, "photo");
      final int _cursorIndexOfPhoneNumbers = CursorUtil.getColumnIndexOrThrow(_cursor, "phone_numbers");
      final int _cursorIndexOfEmails = CursorUtil.getColumnIndexOrThrow(_cursor, "emails");
      final int _cursorIndexOfEvents = CursorUtil.getColumnIndexOrThrow(_cursor, "events");
      final int _cursorIndexOfStarred = CursorUtil.getColumnIndexOrThrow(_cursor, "starred");
      final int _cursorIndexOfAddresses = CursorUtil.getColumnIndexOrThrow(_cursor, "addresses");
      final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
      final int _cursorIndexOfGroups = CursorUtil.getColumnIndexOrThrow(_cursor, "groups");
      final int _cursorIndexOfCompany = CursorUtil.getColumnIndexOrThrow(_cursor, "company");
      final int _cursorIndexOfJobPosition = CursorUtil.getColumnIndexOrThrow(_cursor, "job_position");
      final int _cursorIndexOfWebsites = CursorUtil.getColumnIndexOrThrow(_cursor, "websites");
      final int _cursorIndexOfIMs = CursorUtil.getColumnIndexOrThrow(_cursor, "ims");
      final LocalContact _result;
      if(_cursor.moveToFirst()) {
        final Integer _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getInt(_cursorIndexOfId);
        }
        final String _tmpPrefix;
        _tmpPrefix = _cursor.getString(_cursorIndexOfPrefix);
        final String _tmpFirstName;
        _tmpFirstName = _cursor.getString(_cursorIndexOfFirstName);
        final String _tmpMiddleName;
        _tmpMiddleName = _cursor.getString(_cursorIndexOfMiddleName);
        final String _tmpSurname;
        _tmpSurname = _cursor.getString(_cursorIndexOfSurname);
        final String _tmpSuffix;
        _tmpSuffix = _cursor.getString(_cursorIndexOfSuffix);
        final String _tmpNickname;
        _tmpNickname = _cursor.getString(_cursorIndexOfNickname);
        final byte[] _tmpPhoto;
        _tmpPhoto = _cursor.getBlob(_cursorIndexOfPhoto);
        final ArrayList<PhoneNumber> _tmpPhoneNumbers;
        final String _tmp;
        _tmp = _cursor.getString(_cursorIndexOfPhoneNumbers);
        _tmpPhoneNumbers = __converters.jsonToPhoneNumberList(_tmp);
        final ArrayList<Email> _tmpEmails;
        final String _tmp_1;
        _tmp_1 = _cursor.getString(_cursorIndexOfEmails);
        _tmpEmails = __converters.jsonToEmailList(_tmp_1);
        final ArrayList<Event> _tmpEvents;
        final String _tmp_2;
        _tmp_2 = _cursor.getString(_cursorIndexOfEvents);
        _tmpEvents = __converters.jsonToEventList(_tmp_2);
        final int _tmpStarred;
        _tmpStarred = _cursor.getInt(_cursorIndexOfStarred);
        final ArrayList<Address> _tmpAddresses;
        final String _tmp_3;
        _tmp_3 = _cursor.getString(_cursorIndexOfAddresses);
        _tmpAddresses = __converters.jsonToAddressList(_tmp_3);
        final String _tmpNotes;
        _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
        final ArrayList<Long> _tmpGroups;
        final String _tmp_4;
        _tmp_4 = _cursor.getString(_cursorIndexOfGroups);
        _tmpGroups = __converters.jsonToLongList(_tmp_4);
        final String _tmpCompany;
        _tmpCompany = _cursor.getString(_cursorIndexOfCompany);
        final String _tmpJobPosition;
        _tmpJobPosition = _cursor.getString(_cursorIndexOfJobPosition);
        final ArrayList<String> _tmpWebsites;
        final String _tmp_5;
        _tmp_5 = _cursor.getString(_cursorIndexOfWebsites);
        _tmpWebsites = __converters.jsonToStringList(_tmp_5);
        final ArrayList<IM> _tmpIMs;
        final String _tmp_6;
        _tmp_6 = _cursor.getString(_cursorIndexOfIMs);
        _tmpIMs = __converters.jsonToIMsList(_tmp_6);
        _result = new LocalContact(_tmpId,_tmpPrefix,_tmpFirstName,_tmpMiddleName,_tmpSurname,_tmpSuffix,_tmpNickname,_tmpPhoto,_tmpPhoneNumbers,_tmpEmails,_tmpEvents,_tmpStarred,_tmpAddresses,_tmpNotes,_tmpGroups,_tmpCompany,_tmpJobPosition,_tmpWebsites,_tmpIMs);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public void deleteContactIds(final List<Long> ids) {
    __db.assertNotSuspendingTransaction();
    StringBuilder _stringBuilder = StringUtil.newStringBuilder();
    _stringBuilder.append("DELETE FROM contacts WHERE id IN (");
    final int _inputSize = ids.size();
    StringUtil.appendPlaceholders(_stringBuilder, _inputSize);
    _stringBuilder.append(")");
    final String _sql = _stringBuilder.toString();
    final SupportSQLiteStatement _stmt = __db.compileStatement(_sql);
    int _argIndex = 1;
    for (Long _item : ids) {
      if (_item == null) {
        _stmt.bindNull(_argIndex);
      } else {
        _stmt.bindLong(_argIndex, _item);
      }
      _argIndex ++;
    }
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }
}
