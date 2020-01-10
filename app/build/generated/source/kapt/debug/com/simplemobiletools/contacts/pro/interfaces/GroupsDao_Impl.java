package com.simplemobiletools.contacts.pro.interfaces;

import android.database.Cursor;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import com.simplemobiletools.contacts.pro.models.Group;
import java.lang.Long;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings({"unchecked", "deprecation"})
public final class GroupsDao_Impl implements GroupsDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<Group> __insertionAdapterOfGroup;

  private final SharedSQLiteStatement __preparedStmtOfDeleteGroupId;

  public GroupsDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfGroup = new EntityInsertionAdapter<Group>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `groups` (`id`,`title`,`contacts_count`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, Group value) {
        if (value.getId() == null) {
          stmt.bindNull(1);
        } else {
          stmt.bindLong(1, value.getId());
        }
        if (value.getTitle() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getTitle());
        }
        stmt.bindLong(3, value.getContactsCount());
      }
    };
    this.__preparedStmtOfDeleteGroupId = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM groups WHERE id = ?";
        return _query;
      }
    };
  }

  @Override
  public long insertOrUpdate(final Group group) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      long _result = __insertionAdapterOfGroup.insertAndReturnId(group);
      __db.setTransactionSuccessful();
      return _result;
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deleteGroupId(final long id) {
    __db.assertNotSuspendingTransaction();
    final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteGroupId.acquire();
    int _argIndex = 1;
    _stmt.bindLong(_argIndex, id);
    __db.beginTransaction();
    try {
      _stmt.executeUpdateDelete();
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
      __preparedStmtOfDeleteGroupId.release(_stmt);
    }
  }

  @Override
  public List<Group> getGroups() {
    final String _sql = "SELECT * FROM groups";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfTitle = CursorUtil.getColumnIndexOrThrow(_cursor, "title");
      final int _cursorIndexOfContactsCount = CursorUtil.getColumnIndexOrThrow(_cursor, "contacts_count");
      final List<Group> _result = new ArrayList<Group>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final Group _item;
        final Long _tmpId;
        if (_cursor.isNull(_cursorIndexOfId)) {
          _tmpId = null;
        } else {
          _tmpId = _cursor.getLong(_cursorIndexOfId);
        }
        final String _tmpTitle;
        _tmpTitle = _cursor.getString(_cursorIndexOfTitle);
        final int _tmpContactsCount;
        _tmpContactsCount = _cursor.getInt(_cursorIndexOfContactsCount);
        _item = new Group(_tmpId,_tmpTitle,_tmpContactsCount);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
